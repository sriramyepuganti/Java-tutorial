interface Constants {
    int MAX = 30; // both have same modifers by default
    public static final int MIN = 1;
    void run();
}

interface IProps extends Constants {
    void print(); // it has public abstract
    void run(); // Above interface has same method with different return type. it will throw error
}

class Main implements IProps {
    public void run() {
        System.out.println("Run");
    }
    public void print() {
        System.out.println("Print");
    }
}

class Interface {
    /**
     * Like abstract classes, interfaces cannot be used to create objects
     * Interface methods do not have a body - the body is provided by the "implement" class
     * On implementation of an interface, you must override all of its methods
     * Interface methods are by default abstract and public
     * Interface attributes are by default public, static and final
     * An interface cannot contain a constructor
     */
    public static void main(String[] args) {
        Main obj = new Main();
        obj.run();
        obj.print();
        System.out.println(obj.MAX);
        System.out.println(Main.MIN);
    }
}
