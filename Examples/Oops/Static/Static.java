class StaticCheck {
    static int value;
    static {
        // it will be excuted onlt one time. At the time class load
        System.out.println("static block in Static check class");
        value = 10;
     }

     static {
        value = 20; // it will override above value
     }

     StaticCheck () {
        System.out.println("Default constructor:");
        this.nonStaticMethod();
        staticMethod();
    }

    void nonStaticMethod () {
        System.out.println(value);
    }

    static void staticMethod() {
        System.out.println(value);
    }
    
}


class Static {
    /**
     * The static keyword in Java is used for memory management mainly.
     ** Varaibles:
     * The static variable can be used to refer to the common property of all objects
     * static variable gets memory only once in the class area at the time of class loading
     * static varaibles are class varaibles
     * * Methods
     * static methods are class methods
     * A static method can access static data member and can change the value of it.
     * * Block
     * used to initialize the static data member.
     * Executed before the main method at the time of classloading.
     * * Nested class
     * we have static nested class
     */
     static {
        System.out.println("static block in Static class");
     }
    static int staticValue = 100;
    int instanceValue = 300;
    public static void main(String[] args) {
        Static obj = new Static();
        System.out.println(obj.staticValue); // 100
        System.out.println(staticValue); // 100
        System.out.println(Static.staticValue); // 100

        System.out.println(obj.instanceValue); // 300
        // System.out.println(Static.instanceValue); // throws error
        // System.out.println(instanceValue); // throws error

        new StaticCheck();
        new StaticCheck();
    }
}
