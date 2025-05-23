package collection_2_Queue;
import java.util.PriorityQueue;//after creating object of PriorityQueue we must add Package
public class PriorityQueue3 {
	public static void main(String[] args) {

//remove and poll method with elements		
		PriorityQueue queue = new PriorityQueue();
			System.out.println("Check empty of not = "+ queue.isEmpty());//true
			System.out.println("initial number of element = "+queue.size());
		queue.add("Kiwi");
		queue.add("Mango");
		queue.add("Apple");
		queue.add("Banana");
			System.out.println("Object in queue = "+queue);
			System.out.println("Size of Queue = "+queue.size());
			
	System.out.println(queue.remove());//Apple....Removes and returns the head element of the queue.
	System.out.println(queue);//// Remaining: [Banana, Mango, Kiwi] print except Apple because apple/head element is remove
												System.out.println("---------------------");
	//remove and poll method with  not elements	..for this need to creat PriorityQueue class object with no elements
		PriorityQueue queue1 = new PriorityQueue();
//System.out.println(queue1.remove());//Throw Exception of NoSuchElementException
		System.out.println(queue1.poll());//it will not throw Exception and print value as null			
	}
}