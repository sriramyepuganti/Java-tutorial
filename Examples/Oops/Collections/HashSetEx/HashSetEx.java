package HashSetEx;

import java.util.HashSet;

public class HashSetEx {
    /*
     * A HashSet is a collection of items where every item is unique
     */
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        System.out.println(cars);
        cars.contains("Mazda"); // check it exists or not
        cars.remove("Volvo"); // remove item
        // cars.clear(); // clear
        cars.size(); // size
        for (String i : cars) {
            System.out.println(i);
          }
    }
}
