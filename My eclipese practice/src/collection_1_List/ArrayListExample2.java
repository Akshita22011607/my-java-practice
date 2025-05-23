package collection_1_List;
//different way /method to print ArrayList
import java.util.ArrayList;//need to import predefine class of ArrayList
public class ArrayListExample2 {
	public static void main(String[] args) {
		ArrayList obj =  new ArrayList();//first we need to create object of  main ArrayList class.
		//because we want to use method under ArrayList class.
		System.out.println("Size of ArrayList = "+obj.size());//print 0 bcz we havnt add any object 
		System.out.println("ArrayList is empty = "+obj.isEmpty());//print true bcz we havnt add any object  
//System.out.println("Get index 2 value = "+obj.get(2)); it will throw exception as we do not add any values n index 2 dont have value
	//First step after creating ArrayList should be  add object.add hi object nahi karenge to print kiska karenge list kiska banega
	obj.add("Pune");//call method of ArrayList class use add method to add or creat String object then pass String."_" 
	obj.add("Mumbai");//pass String object to add method of ArrayList class
	obj.add('A'); //autoboxing char to charecter	
	obj.add('B');//autoboxing char to Character
	obj.add(123);//autoboxing int to Integer
	
	System.out.println("Get index 2 value = "+obj.get(2));//get object value from perticular index//indexing starts from 0 and 2 has A object.
														
//create loop to print list,array has lengh method but in collection it hase size method,it just object has size and array has length.
	System.out.println("----print list by using For loop----");
	for(int a = 0;a<obj.size();a++) {//way 1 .creat for loop to print all one by one object according to size
		System.out.println(obj.get(a));//see result thats why get result at index a(whatever ref variable of loop you have passed to creat loop)
		//it will print object line by line according to its size
	}
	System.out.println("----print list by using For each loop----");
	for(Object ob : obj) {//way 2 .creat for each loop //  list me jo element store hote hai vo sare object type ke hote hai thats why Object
		System.out.println(ob);//unlike for loop in for each we will just pass refrance variable to print list.	
	}
	
	System.out.println("----print list by using lamda Expression----");//lamda function is java 8 functinality hai 8 me introduce hua hai 
//expression ko simplify karne ke liye lamda expression use kiya jata hai. 
//syntax = objectrefvariable.foreach(temp variable ->{Sysout statemnet (temp variable)});	
	obj.forEach(f -> {System.out.println(f);});//obj variable ke object temprory variable ayenge n then use print statemnet se call karenge
	//obj1 = f --> f = Pune -->Sysout(f means pune)//obj 2 = f --> f = mumbai --> Sysout(f = mumbai)//this is same for all---> A,B,123
		}
	}


