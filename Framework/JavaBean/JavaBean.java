
import java.io.Serializable;

class App implements Serializable {
    private String name;

    public App() {
        System.out.println("constructor");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}


public class JavaBean {
    /*
     * EJB: Enterprise Java Bean
     * Follow below steps to create EJB
     * 1. class should have only default contructor(no-argumnet)
     * 2. it should have getters and setters
     * 3. it should implement Serializable
     */
    public static void main(String[] args) {
        App obj = new App();
    }
}
