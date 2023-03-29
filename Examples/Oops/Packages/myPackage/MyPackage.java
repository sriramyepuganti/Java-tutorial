package pack;

/**
     * * class
     * public: The class is accessible by any other class (no need to import if they are in same package. have to import they are in different)
     * default: The class is only accessible by classes in the same package. This is used when you don't specify a modifier
     * There are no restrictions on the number of classes that can be present in one Java program. 
     * But each java program should have only one class declared with public access specifier
     * * Methods, attributes, Constructors
     * public: 	The code is accessible for all classes
     * private: The code is only accessible within the declared class
     * default: The code is only accessible in the same package.
     * protected: The code is accessible in the same package and subclasses (inheritance)
     */
class Test {
    private int privateVar = 55;
    protected int protectedVar = 55;
    int defaultVar = 44;
    public int publicVar = 455;

    private void privateMethod () {
        System.out.println("private method");
    }
    
    protected void protectedMethod() {
        System.out.println("protected method");
    }

    public void publicMethod () {
        System.out.println("public method");
    }

    void defaultMethod() {
        System.out.println("default method");
    }
}

public class MyPackage {
    /**
     * There are no restrictions on the number of classes that can be present in one Java program. 
     * But each java program should have only one class declared with public access specifier
     * private: can be accessible with in
     * 
     */
    private int privateVar1 = 55;
    protected int protectedVar1 = 55;
    int defaultVar1 = 44;
    public int publicVar1 = 455;

    private void privateMethod1 () {
        System.out.println("private method1");
    }
    
    protected void protectedMethod1() {
        System.out.println("protected method1");
    }

    public void publicMethod1 () {
        System.out.println("public method1");
    }

    void defaultMethod1() {
        System.out.println("default method1");
    }

    public static void main(String[] args) {
        Test obj = new Test();
        // Default
        obj.defaultMethod();
        System.out.println(obj.defaultVar);

        // public
        obj.publicMethod();
        System.out.println(obj.publicVar);

        // protected
        obj.protectedMethod();
        System.out.println(obj.protectedVar);

        // private
        // obj.privateMethod(); // throw error
        // System.out.println(obj.privateVar); //throw error
    }    
}
