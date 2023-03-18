class Class1 {
    // System.out.println("hii"); // it throws error. it should be used inside
    // method
    final int RANDOM_VALUE = 34;
    int outerScope = 10; // instance varaible

    void printValues() {
        int methodScope = 35; // local or method varaible, local scope
        if (true) {
            int blockScope = 36; // block scope
            System.out.println("block scope:" + blockScope);
        }
        // System.out.println(blockScope); it throws error
        System.out.println("method scope:" + methodScope);
    }

    static void staticMethod1() {
        /**
         * System.out.println(this);
         * Error: non-static variable this cannot be referenced from a static context
         */
    }

    static void staticMethod2() {
        System.out.println("static method-2");
    }
}

class Class2 {
    int x;
    /**
     * constructor name must match the class name, and it cannot have a return type
     * All classes have constructors by default
     * if you do not create a class constructor yourself, Java creates one for you
     */
    Class2() {
        x = 5;
        System.out.println("Class2 default constructor");
    }

    Class2(int a) {
        System.out.println("Class2 constructor with parameters:" + a);
    }

    public String toString() {
        return Class2.class.getName();
    }
}

class Class3 {

}

class Oops {
    int selfValue = 10;
    static void staticMethodTest() {
        System.out.println("static method in Oops class");
    }
    public static void main(String[] args) {
        Oops own = new Oops();
        System.out.println("self:" + own.selfValue);
        staticMethodTest();

        Class1 obj1 = new Class1();
        System.out.println(obj1); // it is equal to obj1.toString()
        obj1.printValues();
        obj1.outerScope = 45; // modify the value
        Class1 obj2 = new Class1();
        System.out.println(obj2.outerScope); // it prints 10

        /**
         * obj1.RANDOM_VALUE = 34;
         * it will throw error. final values treated as constant value
         */

        /**
         * obj1.staticMethod2(); // it will work. but use with class
         */

        Class2 obj3 = new Class2();
        System.out.println(obj3); // it calls custom toString() method
        System.out.println(obj3.x);
        new Class2(5);

    }
}
