 package exceptionHandling;
//exception not handled
// it will not excecute lines/statements after exception occurs.
//it will not givers error it will throw exceptions
public class ExceptionHandling2 {
	public static void main(String[] args) {
	System.out.println("Program Starts");//print on the console tab
		int a =10;
		int b = 10/0;//abnormal Statement __ we cant devide anything with 0
				System.out.println(b);
	System.out.println("Program ends");	//not print on the console tabe
	//because exeption throw due to abnormal Statement 
	}
}
