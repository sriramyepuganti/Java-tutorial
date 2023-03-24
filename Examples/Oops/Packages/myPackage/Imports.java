import pack.MyPackage;

public class Imports {
    public static void main(String[] args) {
        MyPackage obj = new MyPackage();
        // public
        obj.publicMethod1();
        System.out.println(obj.publicVar1);

        // private
        // obj.privateMethod1(); throw error
        // System.out.println(obj.privateVar); throw error

        // default
        // obj.defaultMethod1(); throw error
        // System.out.println(obj.defaultVar1); // throw error

        // protected
        // obj.protectedMethod1(); throw error
        // System.out.println(obj.protectedVar1); throw error
    }
}
