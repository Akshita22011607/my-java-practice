package operators;

public class NumberReversal2 {
	
	public static void main(String[] args) {
		//if hame loop ke andar call karte hai tab console me kya aata hai
		int a= 654321;
		int reverseNum = 0,remainder;
		while(a != 0) {
			
			remainder = a%10;
			a = a/10;
			reverseNum = reverseNum*10 + remainder;
			System.out.println(reverseNum);
		}
	}
}
