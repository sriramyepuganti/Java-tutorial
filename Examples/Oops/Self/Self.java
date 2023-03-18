class Self {
    // instance variables;
    int x = 10; 
    int z = 98;

    public int getNumber() {
        return 5;
    }

    Self() {
        System.out.println("Default constructor");
    }

    Self(int a) {
        System.out.println("constructor with parameters");
    }
    public static void main(String[] args) {
        // method or local variable
        int x = 15; 
        if (true) {
            // int x = 16; // throws error. Duplicate local
            int y = 17; // block scope
            System.out.println("block scope:" + y);
        }
        System.out.println("method scope:" + x);
        // System.out.println("Try to access block variable:" + y); // throws error

        Self obj = new Self();
        System.out.println("obj.x="+ obj.x);
        obj.z = 99;
        /**
         * System.out.println("Checking z value:" + z);
         * 
         * error: non-static variable z cannot be referenced from a static context
         */

        System.out.println(obj.getNumber());
        new Self(10);
    }
}