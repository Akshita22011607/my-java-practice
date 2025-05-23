package collection_1_List;
//creat ArrayList Object with parameetr by using generic means ArrayList for specific data type only
//use collections class method to performe sorting,shuffling of String/variables 
import java.util.ArrayList;//need to import ArrayList class to perform methods
import java.util.Collections;//it is automatically import but
public class ArrayListExample5 {
	public static void main(String[] args) {
	ArrayList obj1 = new ArrayList();//ArrayList is a raw object which can holds hetrogeneous data(LSH != RHS)
	         //Giving warning ArrayList is a raw type. References to generic type ArrayList<E> should be parameterized,it should be parametrised

//now will create ArrayList with parameetr , by using generics means ArrayList for specific data type only
//Syntax = ArrayListclass <DataType> refObjectname = new ArrayListclass <DataType>(); 
	ArrayList<String> obj2 = new ArrayList<String>();//< > is angular bracket//generic only for string object
		// obj2.add(12345) --> when i give integer data type it is showing compile time error called  //it must have String data type only
		//The method add(int, String) in the type ArrayList<String> is not applicable for the  arguments (int)
	obj2.add("Apple");//adding object of string only
	obj2.add("Banana");
	obj2.add("Mango");
	obj2.add("Kiwi");
	                 System.out.println(obj2);//it will print [Apple, Banana, Mango, Kiwi]
	 Collections.sort(obj2);//sort method in Collections class will arrange String in Ascending order
	     //ham sort tab hi use kar skte hai jab ham generics menas ek specific data type assign karenge object banate vkt using < >angular bracket
	                 System.out.println(obj2);//[Apple, Banana, Kiwi, Mango]
	                 
	 Collections.shuffle(obj2);//shuffle method in collection class will shuffle object/randomly give index to object
	                 System.out.println(obj2);//it will always give diffrant output every time because it will shuffle after run everytime.
	                 
//first way ..we can sort object in desceding order as well,for this you need to sort it then give reverse method.
	 Collections.sort(obj2);//sort method in Collections class will arrange String in Ascending order again for descending
	 Collections.reverse(obj2);//then reverse method in Collections class will place object in descending order.
	 System.out.println(obj2);//and then print [Mango, Kiwi, Banana, Apple].    
//Second way to directly place object in descending order without doing extra step is//using overided method in sort.
	 Collections.sort(obj2, Collections.reverseOrder());//Collections.sort(ArrayListRefObject,Collection.reverse())
	 System.out.println(obj2);//result same as way 1[Mango, Kiwi, Banana, Apple]
	}
}
