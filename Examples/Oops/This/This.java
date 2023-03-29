class This {
    /**
     * 'this' to refer current class instance variable
     * this: to invoke current class method
     * this: [this(), This(10)]  is used for constructor chaining. it should be first statement in Constructor
     * You can not use this() in normal methods. it thorws error
     * this: to pass as an argument in the method.
     * this keyword can be used to return current class instance 
     * you should not use this inside static methods
     */

    int someValue;

    This () {
        System.out.println("Default constructor");
        This result = this.invokeMethod();
        System.out.println("object address in constructor:" + result);
    }

    This (int a) {
        this(); // it will call default constructor
        System.out.println("constructor with Params:" + a);
    }

    void setValues (int someValue) {
        this.someValue = someValue;
    }

    int getValues () {
        this.getThisAsArgument(this);
        return someValue;
        // return this.someValue; // it is also works
    }

    This invokeMethod() {
        System.out.println("Method invoked");
        return this;
    }

    void getThisAsArgument (This arg) {
        System.out.println("this value as argument:" + arg);
    }

    public static void main(String[] args) {
        This obj = new This();
        System.out.println("object address:" + obj);
        obj.setValues(100);
        System.out.println(obj.getValues());
        new This(10);
    }
}
