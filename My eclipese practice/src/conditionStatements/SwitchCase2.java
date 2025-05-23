package conditionStatements;

public class SwitchCase2 {

	public static void main(String[] args) {

		double a = 20.20, b = 10.10;
		char operation = '+';
		switch (operation) {

		case '+':
			System.out.println(a + b);
			break;

		case '-':
			System.out.println(a - b);
			break;
		}
	}

}
