/*
final class HasFinalClass {

}

class Test extends HasFinalClass {
    // throws error on extending final class
}
*/

class HasFinalMethod {
    final float PI = 3.14f;
    final int NNN; // it will throw error. if you do not initalize in constructor
    static final int RRR;
    static {
        RRR = 4;
    }
    HasFinalMethod() {
        this.NNN = 23;
        // RRR = 4; // it will throw error
    }
    final void getValue() {
        System.out.println("get value");
    }

    void readValue (final int a) {
        // final parameter
    }
}

public class Final extends HasFinalMethod{
    /**
     * The final keyword in java is used to restrict the user. 
     * The java final keyword can be used in many context. Final can be:
     * variable
     * method
     * class
     */
    final int MAX = 30;

    /*
    void getValue () {
        // can not override final methods
        System.out.println("get value");
    }
    */

    public static void main(String[] args) {
       // MAX = 43; // it will throw error
       final int MIN = 3;
       // MIN = 5; // throw error
    }
}
