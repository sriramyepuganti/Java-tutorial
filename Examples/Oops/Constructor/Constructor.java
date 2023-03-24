class Constructor {
    /*
     * constructor in Java is a special method that is used to initialize objects 
     * name should match with class name
     * should not have return type including void
     * All classes have constructors by default
     * if you do not create a class constructor yourself, Java creates one for you
     */
    Constructor() {
        System.out.println("Default constructor");
    }

    Constructor(int a) {
        System.out.println("Constructor with parama:" + a);
    }
    public static void main(String[] args) {
        new Constructor(); // it will invoke Default constructor
        new Constructor(10); // it will inxoke Constructor with matcing params
    }
}
