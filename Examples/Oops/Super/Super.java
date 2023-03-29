class Parent {
    int a = 10;
    Parent() {
        System.out.println("Parent Default constructor");
    }
    Parent(int a) {
        System.out.println("Constructor:" + a);
    }

    void run () {
        System.out.println("Run in Parent");
    }
}

class Child extends Parent{
    int a = 20;
    Child() {
        super(10); // it should be first statment
        System.out.println("Child Default constructor");
    }
    Child(int a) {
        System.out.println("Constructor:" + a);
    }

    void run () {
        super.run();
        
        System.out.println("Run in Child:" + super.a);
    }
}

public class Super {
    /**
     * super can be used to refer immediate parent class instance variable.
     * super can be used to invoke immediate parent class method.
     * super() can be used to invoke immediate parent class constructor.
     */
    public static void main(String[] args) {
        Child obj = new Child();
        obj.run();
        System.out.println("*****");
        Child obj1 = new Child(10);
    }
}
