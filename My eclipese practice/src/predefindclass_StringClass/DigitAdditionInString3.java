package predefindclass_StringClass;
//Addition of number in String
public class DigitAdditionInString3 {
	public int addNum(String s1) {
		int addNumOfString = 0;
		for(int a= 0;a<s1.length();a++) {
			if(Character.isDigit(s1.charAt(a))) {
				addNumOfString = addNumOfString+Character.getNumericValue(s1.charAt(a));
			}
		}
		return addNumOfString;
	}
	public static void main(String[] args) {
		String original = "I A5m T2h9e B7es2t";
		DigitAdditionInString3 obj = new DigitAdditionInString3();
		int add = obj.addNum(original);
		System.out.println(add);
	}
}
