package collection_2_Queue;
import java.util.PriorityQueue;
//we have seen String elements now we will see numbers
public class PriorityQueue4 {

	public static void main(String[] args) {
		PriorityQueue queue = new PriorityQueue();
		queue.add(6);
		queue.add(9);
		queue.add(2);
		queue.add(4);
		
		System.out.println(queue);//[2, 4, 6, 9] print smallest number at first 
		//because for this queue 2 is head element
		System.out.println(queue.size());//size 4 total object is 4
														System.out.println("----------------------");
//for add and offer class(we can protect class from throwing exception by using offer instead of add method)
System.out.println(queue.add(1));//int value present thats why true if not it will throw exception
System.out.println(queue.offer(3));////int value present thats why true if not it will print false
System.out.println(queue);//[1, 3, 2, 9, 4, 6]
														System.out.println("----------------------");
//for element and peek class (we can protect class from throwing exception by using peek instead of element method)
System.out.println(queue.element());//1..if object/element is there it will print head element value if not throw Exception ClassCastException
System.out.println(queue.peek());//1..if object/element is there it will print head element value if not it will print null value
														System.out.println("----------------------");
//for remove and pool class(we can protect class from throwing exception by using poll instead of remove method)
System.out.println(queue.remove());//it will print head value and print this value in console because we are removing it
System.out.println(queue);//[2, 4, 3, 9, 6] then print queue it will remove 1 from queue and consider second smallest number after 1 that is 2
	//if value/element/object is present it will print n remove element if not it will throw exception as NoSuckElement
System.out.println(queue.poll());//it will remove smallest/head element from queue and print it to console
System.out.println(queue);//[3, 4, 6, 9] it will remove poll value from queue n print third smallest number from queue
	//if value/element/object is present it will print n remoce head element if not it will print null value.
	}
}
