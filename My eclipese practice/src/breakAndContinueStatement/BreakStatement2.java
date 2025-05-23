package breakAndContinueStatement;

public class BreakStatement2 {

	public static void main(String[] args) {
		char ch = 'a';
		while (ch <= 'z') {
			System.out.println(ch);
			// ch++;(if we put ch++ here it will print till q not r)
			if (ch == 'r') {
				break;
			}
			ch++;
			// we need to put ch++ or a++ value after statement so that it will print last value as well
			// like till 'r' or till 20 etc
		}

		System.out.println("loop ends here");
	}
}
