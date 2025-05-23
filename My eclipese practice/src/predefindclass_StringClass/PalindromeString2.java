package predefindclass_StringClass;

public class PalindromeString2 {
	public void palindromOrNot(String str) {
		String reverse = "";
		for (int a = str.length()-1;a>=0;a--) {
			reverse = reverse + str.charAt(a);
		}
		System.out.println(reverse);
		if(str.equalsIgnoreCase(reverse)) {
			System.out.println("Palindrome");
		}else
			System.out.println("Not Palindrome");
	}

	public static void main(String[] args) {
		String name = "Akshita";
		System.out.println(name);
		PalindromeString2 obj =  new PalindromeString2();
		obj.palindromOrNot(name);
	}
}
