package interviewcode1;

public class ASCIIValueForchar {
	// new method ASCIIvalue for capital alphabet (Static method)
	public static char forCapitalAlphabet() {//method for capital alphabet
		char ch = 'A';
		while (ch <= 'Z') {
			System.out.println(ch + " " + (int) ch);
			ch++;
		}
		return ch;
	}
	// ASCIIvalue for small alphabet (non-Static method)
	public char forSmallAlphabet() {//method for small alphabet
		char ch = 'a';
		while (ch <= 'z') {
			System.out.println(ch + " " + (int) ch);//ch for alphabet and (int)ch for ASCII value
			ch++;//for increment as per ascii value
		}
		return ch;
	}

	public static void main(String[] args) {//main method just to call
		//kya print karna ha ye already upar diya hai yaha par bas call krna hai
		char ch1 = ASCIIValueForchar.forCapitalAlphabet();//call for static by using class//capital alphabets
		
		ASCIIValueForchar obj = new ASCIIValueForchar();
		obj.forSmallAlphabet();//call for non-static method by using object
	}
}
