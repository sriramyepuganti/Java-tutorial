class Main {
    class Inner {

    }
    private class InnerPrivate {

    }
    static class StaticClass {
        // just like static attributes and methods, a static inner class does not have access to members of the outer class.
    }
}

public class InnerClass {
    public static void main(String[] args) {
        Main.Inner obj = new Main(). new Inner();
        System.out.println(obj);
        // Main.InnerPrivate obj1 = new Main().new InnerPrivate(); // throw error
        Main.StaticClass obj2 = new Main.StaticClass();
    }
}
