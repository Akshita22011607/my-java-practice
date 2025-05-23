package MethodPractice2;

public class MethodPractice6 {

	public static int addition(int a, int b, boolean bl) {
		int result = a + b;
		System.out.println(" Addition Of Two Num = " + (a + b));
		return result;
	}

	public static void main(String[] args) {
		MethodPractice6.addition(35, 10, true);

		int addition1 = MethodPractice6.addition(35, 10, true);
		System.out.println(addition1);

		int addition2 = MethodPractice6.addition(11, 11, false);
		System.out.println(addition2);

		int addition3 = MethodPractice6.addition(16, 16, true);
		System.out.println(addition3);
	}

}
