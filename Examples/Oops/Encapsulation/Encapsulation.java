class Encapsulation {
    /**
     * The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users
     * declare class variables/attributes as private
     * provide public get and set methods to access and update the value of a private variable
     */

     private String name;

     public String getName() {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
        obj.setName("Test");
        System.out.println(obj.getName());
    }

}
