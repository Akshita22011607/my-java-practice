package MethodPractice1;

public class MethodPractice1 {
	// without parameter
	public static void addition1() {
		int a = 25, b = 10;
		System.out.println(" Addition Of Two = " + (a + b));
	}

	public void multiplication1() {
		long c = 16, d = 22;
		System.out.println(" Multiplication Of Two = " + (c * d));
	}

	public static void main(String[] args) {

		MethodPractice1.addition1();

		MethodPractice1 obj = new MethodPractice1();
		obj.multiplication1();

	}

}
