package exceptionHandling;
//creat new method n then work on try,catch,finally
public class ExceptionHandling7 {
	public static void devisionOfTwo(int a,int b) {
	//i want to devide = 50/0;//Static method
		try {
			int division = a/b;//in try = abnormal Statemnets
			
		} catch(Throwable e) {//can write Arithmetic,array,Exceptions,nullpoint anything
			System.out.println(e);
		}finally {//finally to print Statemnet anyhow handle or not.
			System.out.println("Exception might handle 1");
		}
	}
	public static void devisionOfTwo1(int a,int b) {//nonStatic method
		//i want to devide = 50/0;
			try {
				int division = a/b;//in try = abnormal statement
			} catch(NullPointerException e) {//i gave wrong Exception handle method//it will throw Exception//catch = trying to handle
				System.out.println(e);
				e.printStackTrace();//to check details of exception,class name,location line number
			}finally {//finally to print Statemnet anyhow handle or not.it will print whatever written in finally block//finally= print anyways
				System.out.println("Exception might handle 2");
			}
		}
	public static void main(String[] args) {
	ExceptionHandling7.devisionOfTwo(50, 0);//static method call using class name and five values
	ExceptionHandling7 obj =  new ExceptionHandling7();//creat object of class for nonstatic method
	obj.devisionOfTwo1(50, 0);//call non static method n give values
	}
}
