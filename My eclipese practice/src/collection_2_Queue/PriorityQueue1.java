package collection_2_Queue;
/*In a PriorityQueue, every element has a priority.
The element with the highest priority is removed first, even if it was added later.*/
//Example:numbers like this:5, 1, 3  ..A PriorityQueue gives output: 1 3 5 or 1 5 3
import java.util.PriorityQueue;//after creating object of PriorityQueue we must add Package
public class PriorityQueue1 {
	public static void main(String[] args) {
		PriorityQueue queue = new PriorityQueue();
		System.out.println("Check empty of not = "+ queue.isEmpty());//true
		System.out.println("initial number of element = "+queue.size());
		//o because we havent added any elements
		
		queue.add("Kiwi");
		queue.add("Mango");
		queue.add("Apple");
		queue.add("Banana");
		System.out.println("Object in queue = "+queue);//Object in queue = [Apple, Banana, Kiwi, Mango]//apple 3 number tha but A sabse 1st hai
//priority queue means jo value asceding order ke hisab se sabse first aaye automatically vo sabse first me console me aati hai.
//priority queue means Ascending ya sabse smallest element jo hota hai vahi queue ka head element hota hai	
//baki ke random order me print honge after head element.		
		System.out.println("Size of Queue = "+queue.size());//Size of Queue = 4
		
//add and offer method in PriorityQueue class			
		System.out.println(queue.add("Grapes"));//true
	//System.out.println(queue.add(null));//Throw Exception _NullPointerException because of null element are not allowed
	//	System.out.println(queue.offer(null)); this should print false not throw exception but will se tomorrow .
		System.out.println("Add grapes in queue = "+queue);
		System.out.println(queue.add("Apple"));//duplicate element add
		System.out.println("Object in new queue = "+queue);//Apple bvas ek bar Priority queue me rahenga n 1st print honga 2nd apple shuffle honga
		//means ek hi koi head element reh sakta hai queue me.duplecate hua head element still rest shuffle n give 1 st only
	}
}
