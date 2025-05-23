package exceptionHandling;
//exception handled using try catch
//it will excecute lines/statements after exception occurs.
//because it will handled using try catch
//it will not givers error it will throw exceptions which is handled
public class ExceptionHandling3 {
	public static void main(String[] args) {
		System.out.println("Program Starts");//this will print
		int a = 10;
		try {//try block n try ke sath catch block dena hi pdta hai
			int b = a/0;//try me abnormal condition likhte hai
		}catch (Throwable e) {//Throwable is class name and e is refrance name
			//catch block with(Exception class_ ref name) use to handles abnormal Statement
	// we can write in diffrant ways  Exception e,Throwable e or AritmeticException e
			System.out.println(" Exception is handled = "+ e);
		}
		System.out.println("Program ends");//it will print on console because Exception is handled
	}
}
