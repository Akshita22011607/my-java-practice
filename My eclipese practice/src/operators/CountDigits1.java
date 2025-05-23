package operators;

public class CountDigits1 {

	public static void main(String[] args) {
		int num = 1232567809;
		int counter = 0;

		while (num != 0) {
			counter++;
			num = num / 10;
		}
		System.out.println(counter);
	}
}
