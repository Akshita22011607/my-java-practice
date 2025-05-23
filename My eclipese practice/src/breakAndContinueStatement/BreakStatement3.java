package breakAndContinueStatement;

public class BreakStatement3 {

	public static void main(String[] args) {
		// loop ke andar loop then break statement
		// type 1st. use break statement for inner loop

		for (int a = 0; a <= 4; a++) {// five times it will repeat 0,1,2,3,4 bcz it will check condition
			for (int b = 0; b <= 6; b++) {// if i don't write break it will print value from 0 to 6 (5 times)
				System.out.println(b);
				if (b == 3) {// because of break statement it will break value from 0 to 6 to 0 to 3
					break;
				}
			}
		}
	}
}
