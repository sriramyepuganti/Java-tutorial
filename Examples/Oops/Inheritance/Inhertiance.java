class Parent {
    protected final int MAX_SPEED = 120;
    private final String NAME = "Logo";

    public String getEngineDetails () {
        return "Max speed" + MAX_SPEED; 
    } 
    protected void protectedNumbers() {
        System.out.println("protected method");
    }

    private void privateNumbers() {
        System.out.println("private method");
    }
}

class Child extends Parent {

}




class Inhertiance {
    /**
     * subclass (child) - the class that inherits from another class
     * superclass (parent) - the class being inherited from
     */
    public static void main(String[] args) {
        Child obj = new Child();
        System.out.println(obj.getEngineDetails());

        Parent obj1 = new Child();
        System.out.println(obj1.getEngineDetails());
        System.out.println(obj.MAX_SPEED);
        // System.out.println(obj.NAME); it throws error
        obj.protectedNumbers();
        // obj.privateNumbers(); it throws error

    }
}
