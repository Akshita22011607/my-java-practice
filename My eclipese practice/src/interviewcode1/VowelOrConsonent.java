package interviewcode1;

public class VowelOrConsonent {
	public static void forCapital() {// static
		char ch = 'V';
		if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
			System.out.println("Alphabet is vowel");
		} else {
			System.out.println("Alphabet is consonent");
		}
	}
	public void forSmall() {// non-static
		char ch = 'i';
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println("Alphabet is vowel");
		} else {
			System.out.println("Alphabet is consonent");
		}
	}
	public static void main(String[] args) {// just for call
		VowelOrConsonent.forCapital();// for static by using class
		VowelOrConsonent obj = new VowelOrConsonent();// creat object to call non static method
		obj.forSmall();// call object
	}
}
