import java.util.LinkedList;

public class LinkedListEx {
    /*
     * The LinkedList class is a collection which can contain many objects of the same type
     * The LinkedList class has all of the same methods as the ArrayList class because they both implement the List interface
     * The LinkedList stores its items in "containers."
     * The list has a link to the first container and each container has a link to the next container in the list
     */
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(4);
        System.out.println(list);
        /*
         * addFirst()	Adds an item to the beginning of the list.	
         * addLast()	Add an item to the end of the list	
         * removeFirst()	Remove an item from the beginning of the list.	
         * removeLast()	Remove an item from the end of the list	
         * getFirst()	Get the item at the beginning of the list	
         * getLast()	Get the item at the end of the list
         */
    }
}
