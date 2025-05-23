package predefindclass_StringClass;

public class VowelInString2{
	public String printVowel(String s1) {
		String vowelPrint = "";
		for (int a = 0;a< s1.length();a++) {
			char ch = s1.charAt(a);
			
			if ("AEIOUaeiou".indexOf(ch) != -1) {
				vowelPrint = vowelPrint+ch;
			}
			
		}
		return vowelPrint;
	}

	public static void main(String[] args) {
		String s1 = "Akshita Ishwar Meshram";
		VowelInString2 obj = new VowelInString2();
		String vowel = obj.printVowel(s1);
		System.out.println(vowel);
	}

}
