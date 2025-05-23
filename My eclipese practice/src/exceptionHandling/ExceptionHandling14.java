package exceptionHandling;
//exeption propagation in simple words
public class ExceptionHandling14 {
	public static void divisionOfTwo() {//step 1 create method
		int a = 20;
		int b = a/0;//Step 2 ,add abnormal Statement//we cant devide anything with 0
		System.out.println(b);//want to print value of b
		//Step 3 now JVM will check where we handle this abnormal Statement here only or not
		//Step 4 we can see this arithmetic Exeption is not handlle here by using try catch method
		//Step 5 then jvm will check this same exeption is handle in main method or not
	}

	public static void main(String[] args) {
		ExceptionHandling14.divisionOfTwo();//call static method by using class name
		//step 6 now JVM will now check whether main () can handle it.
		//step 7 we can see JVM is also not handle this exception here(handle using try,catch block)
		//step 8 then JVM will stop execution of program abnormally
		
		//Step 9 Finally, the exception object is handed over to the default exception handler,
		//Step 9 which prints the exception stack trace on the console.
		//stack trace means full exeption details we can see this in console --->>
	}
}
