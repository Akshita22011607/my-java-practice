package exceptionHandling;
//Situatio where finally block not execute/work
//System. Exit (0)
//exception occurs in the finally block
public class ExceptionHandling8 {
	public static void main(String[] args) {
		int a = 53;
		try {//to write abnormal Statemnet
			int b = a/0;
		}catch (Exception e) {//trying to solve/handle abnormal Statemnets
			System.out.println("Exception handle = "+e);
		}finally {//Exception handle or not print Statement written in finally block
			System.out.println("finally block");//if ye first line pr likhti to ye value console me aati because it is doent have abnormal Statmnt
			
			//but now we see situation where finally block doen not execute/work
			int b = a/0;//1st agar mene exception hi finally me likh liya 
			System.out.println("finally block");//this will not print in console tab because this is exception written in finally block
			
//			System.exit(0);//2nd if we write System. Exit (0); ye method working close karta h same as scanner.close thats why finlly not working
			//because working ko hi close kar diya is liye exception nahi aaya. na hi print hue value
//			System.out.println("Finally block");
		}
	}
}
