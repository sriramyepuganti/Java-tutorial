import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListEx  {
    /*
     * The ArrayList class is a resizable array,
     * The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be modified
     * The ArrayList class has a regular array inside it
     */
    public static void main(String[] args) throws Exception {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(3);
        list.add(1);
        System.out.println(list);
        list.get(0); // get value
        list.set(1,5); // update value (key, value)
        list.remove(0); // remove value,
        // list.clear(); // clear list
        list.size(); // get size
        Collections.sort(list); // sort the list

        Iterator<Integer> it = list.iterator();
        System.out.println(it.next()); // it.remove, it.hasNext
    }
}
