package breakAndContinueStatement;

public class BreakStatement5 {

	public static void main(String[] args) {
		// loop ke andar loop then break statement
		// type 3rd for inner n outer for both break statement

		for (int a = 0; a <= 5; a++) {
			if (a == 3) {
				break;
			}
			for (int b = 0; b <= 7; b++) {
				System.out.println(b);
				if (b == 3) {
					break;
				}
			}
		}
	}
}