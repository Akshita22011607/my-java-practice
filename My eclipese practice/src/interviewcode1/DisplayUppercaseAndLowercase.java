package interviewcode1;

public class DisplayUppercaseAndLowercase {
	public static void displayUppercase() {//static
		for (char ch = 'A';ch<='Z';ch++) {
			System.out.println(ch);
		}
	}
	public char displayLowercase() {//non-static
		for (char ch = 'a';ch<='z';ch++) {
			System.out.println(ch);
		}
		return 'a';
	}

	public static void main(String[] args) {
		DisplayUppercaseAndLowercase.displayUppercase();//call static
		DisplayUppercaseAndLowercase obj = new DisplayUppercaseAndLowercase();// creat object for non static
		obj.displayLowercase();//call non static
	}
}
