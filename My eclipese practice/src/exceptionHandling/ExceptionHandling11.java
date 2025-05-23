package exceptionHandling;
//Exception throw using throw keyword.
public class ExceptionHandling11 {
	public static void main(String[] args) {
		int a = 15;
		int b = 20;
		if(a>b) {
			System.out.println("a is greater than b ");
		}else {
			throw new ArithmeticException("b value is more than a value");
		}
	}
}
