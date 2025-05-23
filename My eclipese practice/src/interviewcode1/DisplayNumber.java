package interviewcode1;

public class DisplayNumber {
	public static void displayNum() {// want to print 1 to 5 number
		int i = 1;
		for (; i <= 5; i++) {
			System.out.println("number is "+i);
		}
	}
	public static void main(String[] args) {
		DisplayNumber.displayNum();
	}
}
