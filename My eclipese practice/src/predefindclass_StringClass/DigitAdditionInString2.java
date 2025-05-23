package predefindclass_StringClass;
//orignal String = "A1ks2hi3ta 4Is5hw6ar 7Me8sh9ram";
//Add numbers from this digits - 1+2+3+4+5+6+7+8+9 = 45
public class DigitAdditionInString2 {
	public void addDigitInString(String str) {
		int addValue = 0;//because i want to add digit not string thats why empty int value
		for(int a = 0;a< str.length();a++ ) {
			if(Character.isDigit(str.charAt(a))) {
				addValue = addValue+Character.getNumericValue(str.charAt(a));
			}
		}
		System.out.println("Addition of digits in STring = "+addValue);
	}
	public static void main(String[] args) {
		String original = "A1ks2hi3ta 4Is5hw6ar 7Me8sh9ram";
		DigitAdditionInString2 obj = new DigitAdditionInString2();
		obj.addDigitInString(original);
	}
}
