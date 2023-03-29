class Parent {
    Parent() {
        System.out.println("Parent constructor");
    }
    void run () {
        System.out.println("run in Parent");
    }

    int getNumber (int a, int b, int c) {
        return a + b + c;
    }
}

class Child extends Parent {
    Child() {
        System.out.println("Child constructor");
    }

    void run () {
        System.out.println("run in Child");
    }

    int getNumber (int a) {
        return a;
    }

    int getNumber(int a, int b) {
        return a + b;
    }
}

class Polymorphism {
    /**
     * Polymorphism means "many forms", and 
     * it occurs when we have many classes that are related to each other by inheritance.
     ** Method overloading
     * same method name and different parameter, it can happen in same class
     * By changing number of arguments
     * By changing the data type
     * *Method overriding
     *  method overriding occurs when a subclass (child class) has the same method as the parent class
     * The method must have the same name as in the parent class
     * The method must have the same parameter as in the parent class.
     * There must be an IS-A relationship (inheritance).
     */

     public static void main(String[] args) {
        Child obj = new Child();
        Parent obj1 = new Child();
         // Child obj2 = (Child) new Parent(); // it throws run time error
        obj.run();
        obj1.run();
        // obj2.run();
        // obj1.getNumber(1); // throw error. because obj1 is Parent type
        obj.getNumber(0, 0, 0);
        obj.getNumber(0, 0);
        obj.getNumber(0);

     }
}
