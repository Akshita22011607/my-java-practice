package predefindclass_scannerClass;
//import util package
import java.util.Scanner;

public class ScannerClass2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);//creat scanner object
		System.out.println("Multiplication of two");//just for comment
		int a,b,result;//declare a,b,result
		a=scn.nextInt();//
		b=scn.nextInt();
		result = a*b;
		System.out.println(result);
		scn.close();
	}
}
