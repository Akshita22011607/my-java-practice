package predefindclass_StringClass;
public class SplitReverseString3 {
	public String reverseString(String s1) {//for reverse value
		String reverse = "";
		for(int a = s1.length()-1;a>=0;a--) {
			reverse = reverse+s1.charAt(a);}
		return reverse;}
	public void palindromeString(String s2) {//to check String palindrome or not
		String reverse1 = "";
		for(int b = s2.length()-1;b>=0;b--) {
			reverse1 = reverse1+s2.charAt(b);}
		System.out.println("String Reverse for palindrome method 2 = "+ reverse1);
		if(reverse1.equalsIgnoreCase(s2)) {
			System.out.println("String is palindrome");
		}else 
			System.out.println("String is not palindrome");	}
	public String splitReverseWord(String s3) {//split reverse String
		String[] splitString = s3.split(" ");//main string Split
		String splitReverseWord = "";
		for(int a =0;a<splitString.length;a++) {
			String splitword = splitString[a];//splitword is refrerance variable
			String splitWordReverse = "";
			for (int s =splitword.length()-1;s>=0;s-- ) {
				splitWordReverse = splitWordReverse+splitword.charAt(s);}
			splitReverseWord = splitReverseWord+splitWordReverse+" ";}
		return splitReverseWord;}
	public static void main(String[] args) {
		String original = "Who The Hell Are You"; 
		System.out.println("Original = "+ original);
		SplitReverseString3 obj = new SplitReverseString3();
		String reverseValue = obj.reverseString(original);
		System.out.println("Reverse Value method 1 = "+reverseValue);
		obj.palindromeString(original);
		String splitWord = obj.splitReverseWord(original);
		System.out.println("Split Word Revese = "+splitWord);
		}
}
