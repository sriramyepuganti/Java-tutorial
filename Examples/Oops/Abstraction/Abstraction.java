abstract class Main {
    abstract void printer();

    void scanner() {
        System.out.println("scanner");
    }
}

class Child1 extends Main {
    void printer () {
        System.out.println("printer implementation");
    }
}

// it will throw error. 
// if you extend abstract class. you have to write implementaion for abstract methods
// if you want to resolve the issue add abstract to class
// abstract class Child2 extends Main {
//     void tv() {
//         System.out.println("TV");
//     }
// }

class Abstraction {
    /**
     * abstraction is the process of hiding certain details and showing only essential information to the user
     * Abstraction can be achieved with either abstract classes or interfaces
     */
    public static void main(String[] args) {
        Child1 obj = new Child1();
        // Child2 obj2 = new Child2(); // it throw error if parent does not have implementation for abstract

    }   
}