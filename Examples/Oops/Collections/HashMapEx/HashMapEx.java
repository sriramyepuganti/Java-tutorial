import java.util.HashMap;

public class HashMapEx {
    /*
     * A HashMap however, store items in "key/value" pairs, and you can access them by an index of another type (e.g. a String).
     */
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();

    // Add keys and values (Country, City)
    capitalCities.put("England", "London"); // add values
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
    System.out.println(capitalCities);
    // capitalCities.clear(); // clear values
    capitalCities.size(); //get size
    capitalCities.get("England");
    capitalCities.remove("England");

    for (String i : capitalCities.keySet()) {
        System.out.println(i);
      }
    }
}
