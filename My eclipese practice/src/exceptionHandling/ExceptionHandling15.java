package exceptionHandling;
//exeption propagation in simple words with handle exception using try,catch
public class ExceptionHandling15 {
	public static void divisionOfTwo() {//step 1 create method
		int a = 20;
		int b = a/0;//Step 2 ,add abnormal Statement//we cant devide anything with 0
		System.out.println(b);//want to print value of b
		//Step 3 now JVM will check where we handle this abnormal Statement here only or not
		//Step 4 we can see this arithmetic Exeption is not handlle here by using try catch method
		//Step 5 then jvm will check this same exeption is handle in main method or not
	}
	public static void main(String[] args) {	
		try {//call abnormal Statemnet from previous method
		ExceptionHandling15.divisionOfTwo();//call static method by using class name
		}catch (ArithmeticException e) {//try to handle abnormal statement using catch
			System.out.println("Exception handle");//this will print only exception handle
			System.out.println("Exception handle = "+e);//this will print String value plus stack trace
		}
		//step 6 now JVM will now check whether main () can handle it.
		//step 7 we can see main() handle this exception using try catch method
		//step 8 finally it will print handle  statements
	}
}