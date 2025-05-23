package exceptionHandling;
//import = Shift+Control+o;
//we can use multiple Exception classes after  throws

import java.io.FileInputStream;//need to import
import java.io.FileNotFoundException;//need to import
public class ExceptionHandling13 {
	public void divisionAndArray() throws ArithmeticException, ArrayIndexOutOfBoundsException, FileNotFoundException {
		//creat method _throws_multiple classes(add ,(comma) after every class)
		//1st ArithmeticException - unchecked exception
		int a = 20;
		int b = 0;
		int div = a / b;

		//ArrayIndexOutOfBoundsException- unchecked exception
		int[] arr = new int[3];
		arr[4] = 23;

		//FileNotFoundException - checked exception(compile time Exception)
		FileInputStream fis = new FileInputStream("G://xyz.txt");
	}
	public static void main(String[] args) {
		ExceptionHandling13 obj = new ExceptionHandling13();
		//it will print only one Exception at a time so if you want to see echa an evry result need to comment rest working/exception
		try {
			obj.divisionAndArray();
		} catch (ArithmeticException e) {
			System.out.println(e);//java.lang.ArithmeticException: / by zero
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);//java.lang.ArrayIndexOutOfBoundsException: 4
		} catch (FileNotFoundException e) {
			System.out.println(e);
			//java.io.FileNotFoundException: G:\xyz.txt (The system cannot find the file specified)
		}
	}
}