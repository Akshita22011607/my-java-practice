package collection_1_List;
import java.util.ArrayList;//once creat ArrayList class object need to import ArrayList package
import java.util.Iterator;//once create Iterator Interface object need to import Iterator package
public class ArrayList_Iterator2 {//main class
	public static void main(String[] args) {
	ArrayList obj = new ArrayList();//ArrayList class object without this we can not use add method
		obj.add("akshita");//String object added
		obj.add("Poonam");
		obj.add("ruchika");
		obj.add("");	//empty String added//it will print blank in console tab	
		System.out.println(obj.size());//number of object
		System.out.println(obj);//print object
		
	Iterator itr = obj.iterator();/*Iterator Interface object without this we can not use iterator method
		most important method 1st hasNext,2nd next,3rd remove.*/
		while(itr.hasNext()) { /*boolean form thats why need to writw it in while loop condition first if it 
			is true then print true if not retum false*///if it is true.
			System.out.println(itr.next());//use 2nd method thats is next.write it in print Statemnet
			itr.remove();//then remove all from object
		}
	Iterator itr1 = obj.iterator();	//creat new object of iterator  to check object print or not
//now we are repeating same step to see after remove method() strill every value of abject print or not.		
		while(itr1.hasNext()) {//while loop with hasNext to check object present or nor
			System.out.println(itr1.next());//everything is removed in first loop so it will return false
			//and both while loop and print statemnet will not have any value because it doest have any
		}
	System.out.println(obj.size());//not only methods in iterator interface if we are trying to print size
	System.out.println(obj);//and trying to print object it will show 0 size n empty object[]
	}
}
