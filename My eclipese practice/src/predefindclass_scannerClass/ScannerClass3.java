package predefindclass_scannerClass;
import java.util.Scanner;
public class ScannerClass3 {
	static void switchCase(int month_num) {
		switch(month_num) {//just to add other concept in scanner class switch case statement
		case 1:
			System.out.println("january");
			break;//if breat nahi hota to vo dono print kr deta
		case 2:
			System.out.println("feb");
			break;//we can add as many as case we want
		} 
	 }
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);//create object of scannner with System.in parameter
		System.out.println("enter your name");
		String name = scn.next();//i want to add my name that is string formate using user input
		System.out.println(name);//print name
		System.out.println("mobile number");
		long mobile_Number = scn.nextLong();// i want to add mobile number using user input
		System.out.println(mobile_Number);//prin number
		System.out.println("char at first");
		char firstlatter = scn.next().charAt(0);// i want to add char using user input
		System.out.println(firstlatter);//print char
		
		System.out.println("print month");
		int printMonth = scn.nextInt();// i want to print switvh case month using user input
		ScannerClass3.switchCase(printMonth);//static thats why call by using class name
		//call this new user define input thats why print month not any other method.
		System.out.println(printMonth);//peint month
	}

}
