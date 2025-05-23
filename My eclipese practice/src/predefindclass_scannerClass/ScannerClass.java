package predefindclass_scannerClass;
//scanner class
//sara declarartion dene ke bad console me ham direct value likh skte hai n result dekh skte h using scanner class
import java.util.Scanner;//shortcut to import util package --> control+shift+o
//most imp step to import java .util package for scanner class
public class ScannerClass {
	public static void main(String[] args) {
		//first creat scanner class object
		Scanner scn  = new Scanner(System.in);//scn-just referance name.
//but this is showing error because this package belongs to java.util so we must import java.util package
		System.out.println("Addition of two");//just for consone not needed
	//so if you want to erform some task so now we have to define value
	int a,b,result;//define values
	a= scn.nextInt();//now i want to take value from user,int because i want to perform addition of 2 integer
	b=scn.nextInt();//same nextInt because i want to do addition of two integer value		
	result = a+b;//want additon
	System.out.println(result);//print result.
	scn.close();//lastely we need to close scanner class because it leak memory
	//if we dont give close statemnet it will give error called resource leake scn is never close
	}
}
//console me addition perform karenge kaise??
//run program-->click on console tab(topmost line)-->add first value-->enter-->second value-->enter
//it will print result.//cant edit once done writing n enter. then you have to again run n then give input
/*we can see console tab int number was always black n not changabale but this time it is light grey n we can 
also change it manually without initializing it in code*/