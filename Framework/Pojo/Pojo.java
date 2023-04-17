
class App {
    /*
     * POJO in Java stands for Plain Old Java Object.
     * It is an ordinary object, which is not bound by any special restriction
     * POJO class contains variables and their Getters and Setters.
     * * The POJO class must be public.
     * * It must have a public default constructor.
     * * It may have the arguments constructor.
     * * A POJO class should not extend predefined classes.
     * * It should not implement prespecified interfaces.
     * * It should not have any prespecified annotation.
     * ** Any object managed by spring is called Spring Bean
     */
    private String name;
    private int number;
    
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

   @Override
   public String toString() {
    System.out.println("[name "+ name + "]" + "[number " +  number + "]");
    return "";
   }

}

class Pojo {
    public static void main(String[] args) {
        App pojo = new App();
        pojo.setNumber(20);
        pojo.setName("hello world");
        System.out.println(pojo);
    }
}
