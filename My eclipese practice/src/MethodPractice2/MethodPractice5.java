package MethodPractice2;

public class MethodPractice5 {
	public static void allInOne(int a, int b, boolean c) {
		System.out.println(" Addition Of Two " + (a + b));
		System.out.println(" Boolean Answer " + c);
	}

	public static void main(String[] args) {

		MethodPractice5.allInOne(20, 10, true);
		MethodPractice5.allInOne(22, 16, false);
	}
}
