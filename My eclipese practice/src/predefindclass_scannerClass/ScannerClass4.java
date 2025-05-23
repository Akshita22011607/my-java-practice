package predefindclass_scannerClass;
import java.util.Scanner;
public class ScannerClass4 {//input green output black in console tabe
	public void switchcaseforScanner(char charecter) {//method creat
		switch(charecter) {//switch case statement//we use car instead int
		case 'A':
			System.out.println("A to a");
			break;
		case 'B':
			System.out.println("B to b");
			break;
		case 'C':
			System.out.println("C to c");
			break;//we can make as many as statement we want
		}
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("My Name");
		String name = scn.next();//string
		System.out.println(name);
		System.out.println("Name first char");
		char ch = scn.next().charAt(0);//char user define
		System.out.println(ch);
		System.out.println("print char");//this is for method
		ScannerClass4 obj = new ScannerClass4();//creat object
		char ch1 = scn.next().charAt(0);//make user define input using scanner object
		obj.switchcaseforScanner(ch1);//call method n give referance variable of user define input
		System.out.println(ch1);//call method.
	}
}
