package conditionStatements;

public class SwitchCase1 {
	public static void main(String[] args) {
		double b = 10.20, d = 20.30;
		char operation = '+';
		switch (operation) {
		case '+':
			System.out.println("Addition of number " + (b + d));
			break;
		case '-':
			System.out.println("Subtraction of number " + (b - d));
			break;
		}

	}

}
