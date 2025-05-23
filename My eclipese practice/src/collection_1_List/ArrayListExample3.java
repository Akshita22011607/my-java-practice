package collection_1_List;
//ArrayList class method,remove method,set method to replace index.
import java.util.ArrayList;//need to import.
//see some more method available in ArrayList class.

public class ArrayListExample3 {
	public static void main(String[] args) {
		ArrayList obj = new ArrayList();
		// add() method ka retun type boolean hai,mouse hover karne ke bad pata
		// chala,mouse hover on ad
		// means add() me object add karne ki koshich ki hai vo succsess hua to it will
		// print true if not false
		obj.add("Pune");// we can see value added successfully so it will print true.
//agar hame check karna hai add succssessfully hua ki nahi to simply same method aap print statemnet me dalo it will print either true or false		
		System.out.println("Succsessfully add object to add method = " + obj.add("mumbai"));// add succsessfully so ot
																							// will print true
//		System.out.println("object not added in add method = "+obj.add());if not added anything it will throw error
		obj.add('A'); // autoboxing char to charecter
		obj.add('B');// autoboxing char to Character
		obj.add(123);// autoboxing int to Integer
		// add method ka retun type boolean hai,mouse hover karne ke bad pata chala

//i want to remove one onject from this array list using remove method
		obj.remove(2);// index dete ho to return type honga object,indexing Starts from 0
		System.out.println("ArrayList after removing one onject " + obj);// it will remove index[2] object that is A
		System.out.println(obj);// it will print true
		obj.remove("Pune");// it will remove object either STring comes under object ony
//System.out.println(obj.remove('A'));//it will give exception -Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 65, Size: 3
//it will consider char/integer as variable not object n according to its ascii value it will try to remove char/integer n throw exception.

		//System.out.println(obj.removeAll());// remove all//it is throwing exception
		obj.set(2, "Nagpur");//it will replace index 2 with string
		System.out.println(obj);//print string//123 replace with nagpur.
	}
}
