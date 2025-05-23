package collection_1_List;
import java.util.ArrayList;
//add one Array list object to another ArrayLiost object
public class ArrayListExample4 {
	public static void main(String[] args) {
	ArrayList obj1 = new ArrayList();//object 1 of ArrayList class
		obj1.add("Mumbai");
		obj1.add("Pune");
		obj1.add("Nagpur");
		obj1.add(123345);
	ArrayList obj2 = new ArrayList();//object 2 of ArrayList class
		obj2.add("Banana");
		obj2.add("Apple");
		obj2.add("Mango");
	//	obj2.add("Nagpur");
		
		System.out.println(obj1);//it will print obj1 objects // [Mumbai, Pune, Nagpur]
		System.out.println(obj2);//it will print obj1 objects // [Banana, Apple, Mango]
//add obj1 objects to obj 2 objects by using addall methos in ArrayList		
		obj1.addAll(obj2);//return type of addAll method is boolean
		System.out.println(obj1);//print obj1 to see all result [Mumbai, Pune, Nagpur, 123345, Banana, Apple, Mango]
		
	obj1.add(5, "Akshita");	//konse index me kya add karna hai.rest is same.jusr add new object in given index.
	System.out.println(obj1);//this will add akshita at index [5] in obj1
	
	obj1.removeAll(obj2);//remove one object from another object
	System.out.println(obj1);//it will remove obj 2 all object //[Mumbai, Pune, Nagpur, 123345, Akshita]
	
	obj1.addAll(obj2);//same as removeAll we can addAll means add all object to one onject to 2nd object
	System.out.println(obj1);//[Mumbai, Pune, Nagpur, 123345, Akshita, Banana, Apple, Mango]
	
	obj1.retainAll(obj2);//// it will take/retain obj1 objects that are also in obj2
	System.out.println(obj1);//[Banana, Apple, Mango]//Keep only those elements in obj1 that are also present in obj2.
	}
}
