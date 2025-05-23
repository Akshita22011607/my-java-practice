package interviewCode2;

public class FullPyramid5 {
	public void printFullPyramid5() {
		for (int a = 0; a < 5; a++) {
			for (int s = 5 - a - 1; s > 0; s--) {
				System.out.print(" ");
			}
			for (int j = 0; j < (2 * a) + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		FullPyramid5 obj = new FullPyramid5();
		obj.printFullPyramid5();
	}

}
