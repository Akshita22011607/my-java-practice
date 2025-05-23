package collection_2_Queue;
/*In a PriorityQueue, every element has a priority.
The element with the highest priority is removed first, even if it was added later.*/
//Example:numbers like this:5, 1, 3  ..A PriorityQueue gives output: 1 3 5 or 1 5 3
import java.util.PriorityQueue;//after creating object of PriorityQueue we must add Package
public class PriorityQueue2 {
	public static void main(String[] args) {
		PriorityQueue queue = new PriorityQueue();
			System.out.println("Check empty of not = "+ queue.isEmpty());//true
			System.out.println("initial number of element = "+queue.size());
		queue.add("Kiwi");
		queue.add("Mango");
		queue.add("Apple");
		queue.add("Banana");
			System.out.println("Object in queue = "+queue);
			System.out.println("Size of Queue = "+queue.size());
		System.out.println(queue.add("Grapes"));//true
		System.out.println(queue .offer("Chiku"));//boolean value return true if has value
		System.out.println(queue);
																		System.out.println("----------------------");
//System.out.println(queue.add(123));	//throw exception ClassCastException allow only one data type at a time.means homogeneous data only
// element and peek method with queue has elements 
		System.out.println(queue.element());//Apple ..it will return only head element
		System.out.println(queue.peek());//Apple ..it will also return only head element

																		System.out.println("----------------------");
// element and peek method with queue has no elements,empty.. creat one object of class with no elements
	PriorityQueue queue1 = new PriorityQueue();//object created of PriorityQueue class to check element and peek method working in empty element
//System.out.println(queue1.element());//Throw Exception  as NoSuchElementException because no elements
		System.out.println(queue1.peek());//null no exception it will simply print null value in console

	}
}