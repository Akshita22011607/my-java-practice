package conditionStatements;

public class NestedIf {

	public static void main(String[] args) {
		int result = 85;

		if (result >= 35) {
			if (result > 35 && result <= 50) {
				System.out.println("pass");
			}
			if (result > 50 && result <= 65) {
				System.out.println("second class");
			}
			if (result > 65 && result <= 75) {
				System.out.println("first class");
			}
			if (result > 75 && result < 100) {
				System.out.println("Distinction");
			}

		}

	}
}