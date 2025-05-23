package exceptionHandling;
//throw keywork in Exceptinal handling
//manually in console we can give exception type and discription
public class ExceptionHandling9 {
	public static void main(String[] args) {
		int age = 15;//initialize value
		if (age < 18) {//give statemnet
			throw new ArithmeticException("Age must be 18 or above");
	//throw new Exceptiontype("Pass String");		
			/* and without comparing is it true or false i want to give exception
			in that case we will use throw Exceptions*/
		}
		System.out.println("You are eligible to vote!");
	}
}
//console me same print honga vo value mene Throw me dali hai.mai explicitly throw creat karke Exception dungi.
