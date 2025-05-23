package interviewcode1;

public class PositiveNegativeNumber {
	public static int positiveNegativeNum() {// static call without parameter
		int a = 10;
		if (a > 0) {
			System.out.println("Number is positive");// 10 is positive
		} else if (a == 0) {
			System.out.println("Number is zero");
		} else {
			System.out.println("Number is negative");
		}
		return a;
	}
	public void positiveNegativeNum1(int a) {// non-static call with parameter void return type
		if (a > 0) {
			System.out.println("Number is positive");// -10 is negative
		} else if (a == 0) {
			System.out.println("Number is zero");
		} else {
			System.out.println("Number is negative");
		}
	}

	public static void main(String[] args) {
		PositiveNegativeNumber.positiveNegativeNum();// call static method using class
		PositiveNegativeNumber obj = new PositiveNegativeNumber();// creat object to call non static
		obj.positiveNegativeNum1(-10);// call non static method
	}

}
