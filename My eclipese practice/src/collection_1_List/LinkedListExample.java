package collection_1_List;
import java.util.LinkedList;//import LinkedList class object first then we can add this package
public class LinkedListExample {
    public static void main(String[] args) {
        // Create a LinkedList to hold objects of different types
   LinkedList<Object> list = new LinkedList<>();//object of LinkedList class//list is ref variable
        // Add elements to the list
        list.add("Akshita");  // String
        list.add('a');        // Character
        list.add(12345);      // Integer
    System.out.println("Initial list: " + list);//print object
    
    // Add element at the beginning
        list.addFirst("Start");
        System.out.println("After addFirst(\"Start\"): " + list);

    // Add element at the end
        list.addLast("End");
        System.out.println("After addLast(\"End\"): " + list);

    // Retrieve first and last elements
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());

    // Remove first and last elements
        list.removeFirst();
        System.out.println("After removeFirst(): " + list);

        list.removeLast();
        System.out.println("After removeLast(): " + list);
    }
}
