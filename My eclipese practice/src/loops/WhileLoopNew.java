package loops;

public class WhileLoopNew {

	public static void main(String[] args) {
		
		/*//print A to Z it will just print a to z char
		//operation perform on the basis of ASCII value.and automatically print A TO Z
		char ch = 'A';
		while(ch <= 'Z') {
			System.out.println(ch);
			ch++;*/
			
		
		//If we want to print ascii value with char.
		//it will print a to z /A to Z ascii value with char
		//just need to put (int)befor char veriable
		char ch = 'a';
		while(ch <= 'z') {
			System.out.println((int)ch+" "+ch);
			ch++;
		
		}

	}

}
