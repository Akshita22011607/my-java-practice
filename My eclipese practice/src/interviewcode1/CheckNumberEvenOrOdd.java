package interviewcode1;

public class CheckNumberEvenOrOdd {
	public static void checkOddOrEven() {// static method
		int num = 12;
		if (num % 2 == 0) {
			System.out.println("Number is even");
		} else {
			System.out.println("Number is odd");
		}
	}
	public void checkOddOrEven1() {// non-static method
		int num = 115;
		if (num % 2 == 0) {
			System.out.println("Number is even");
		} else {
			System.out.println("Number is odd");
		}
	}
	public static void main(String[] args) {

		CheckNumberEvenOrOdd.checkOddOrEven();//// call static by using class.
		CheckNumberEvenOrOdd obj = new CheckNumberEvenOrOdd();// first creat object for non static
		obj.checkOddOrEven1();// then call by using object
	}
}
