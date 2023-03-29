package packages.pack2;

import packages.pack1.Main;

public class Test {
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
    public static void main(String[] args) {
        new Main();
        new ImportDef();
        new ImportPub();
    }
}
