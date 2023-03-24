import pack.MyPackage;

class Test extends MyPackage {
    Test () {
        System.out.println(protectedVar1);
    }
}

public class Imports extends Test {

    public static void main(String[] args) {
        new Test();
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
