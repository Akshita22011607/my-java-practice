package exceptionHandling;
//Exception Handling for  String n array exception
public class ExceptionHandling4 {
	public static void main(String[] args) {
	//exception handling for String to print  lengh n char value	
		System.out.println("Program Starts");
		String str = null;//NullPointerException
		try {
			System.out.println(str.charAt(0));//abnormal statemnets
			System.out.println(str.length());//abnormal statemnets
		}catch(Exception e) {
			System.out.println(e);//print ref variable of Throwable/Exception class
			e.printStackTrace();//it will give detailed information of Exception location,class name line number.
			//printStackTrace method only in catch block
		}
		System.out.println("Program ends");
		
	//Exception	handling for array which gives that exceding index value that we have not give memory
		System.out.println("Program Starts");
		int [] arr = new int [4];//ArrayIndexOutOfBoundsException
		try {
			arr[4] = 16;//abnormal statemnets
		}catch(Throwable a) {
			System.out.println(a);//print ref variable of Throwable class
//			a.printStackTrace();//it will give detailed information of Exception location,class name line number.
			//printStackTrace method only in catch block
		}
		System.out.println("Program Ends");
	}
}
