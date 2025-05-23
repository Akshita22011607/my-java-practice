package MethodPractice1;

public class MethodPractice3 {
	// with return type

	public static int Addition2(int a, int b) {
		int result = a + b;
		return result;
	}

	public static void main(String[] args) {
		// first way to call
		System.out.println(MethodPractice3.Addition2(22, 16));

		// 2nd way to call

		int result = MethodPractice3.Addition2(22, 16);
		System.out.println(result);

	}

}
