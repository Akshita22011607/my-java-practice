package collection_1_List;
import java.util.ArrayList;//ctrl+shift+0 to import package
//ArrayList is a predefine class of list interface which comes under collection interface
//in collection we can store hetrogeneous data 
public class ArrayListExample1 {
	public static void main(String[] args) {
//once you creat ArrayList class object you need to import related package		
		ArrayList obj =  new ArrayList();//first we need to create object of  main ArrayList class.
		//because we want to use method under ArrayList class.
//String is a form of object only/non primitive data	
	obj.add("Pune");//call method of ArrayList class use add method to add or creat String object then pass String."_" 
	obj.add(" Mumbai");//pass String object to add method of ArrayList class
	obj.add("Nagpur");//add String type of object

//in this char n initger is primitive data type n collection will apply to object only
//so thats why(auto boxing) boxing opration will perform automatically ,convert primitive data type to non primitive data type
	obj.add('A'); //autoboxing char to charecter	
	obj.add('B');//autoboxing char to Character
	obj.add(123);//autoboxing int to Integer
	
//how to print this values
	System.out.println(obj);//simply print refrance variable(obj) of ArrayList class object.
	//it will print list of arrays of object in sequential manner
	//store diffrent data type object in single list thats why we use collection.
	
	System.out.println("Size of ArrayList = "+obj.size());//size of list(number of object) using size method from ArrayList class
	
//check array list is empty or not//use isEmpty method from Array list to check list is empty or not.
	System.out.println("ArrayList is empty = "+ obj.isEmpty());//give boolean value either true or false //false because it has 6 objects in it
	
	System.out.println("Get index 2 value = "+obj.get(2));//get object value from perticular index//indexing starts from 0 and 2 has Nagpur object.
	//it is same ass array but in object form size form
	}
}
