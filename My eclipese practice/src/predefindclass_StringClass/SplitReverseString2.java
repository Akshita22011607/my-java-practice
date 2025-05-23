package predefindclass_StringClass;

public class SplitReverseString2 {
	public void SplitReverse(String s1) {
		String[] arrString = s1.split(" ");// creat array of String to Split sentence on the basis of Space
		String splitWords = "";
		for (int a = 0; a < arrString.length; a++) {
			String printSplitWords = arrString[a];

			String reverseString = "";
			for (int b = printSplitWords.length() - 1; b >= 0; b--) {
				reverseString = reverseString + printSplitWords.charAt(b);
			}
			splitWords = splitWords+reverseString+" ";
		}
		System.out.println(splitWords);
	}

	public static void main(String[] args) {
		String Original = "Thala For Reason";
		SplitReverseString2 obj = new SplitReverseString2();
		obj.SplitReverse(Original);
	}

}
