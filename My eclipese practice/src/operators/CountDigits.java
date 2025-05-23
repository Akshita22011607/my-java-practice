package operators;

public class CountDigits {

	public static void main(String[] args) {
		int num = 123456789;
		int counter = 0;

		while (num != 0) {
			counter++;
			num = num / 10;
		}
		System.out.println(counter);
	}

}
