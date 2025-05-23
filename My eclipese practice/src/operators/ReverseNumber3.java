package operators;

public class ReverseNumber3 {

	public static void main(String[] args) {
		//want to print 123456
				int a= 654321;
				int reverseNum = 0,remainder;
				while(a != 0) {
					
					remainder = a%10;
					a = a/10;
					reverseNum = reverseNum*10 + remainder;
				}
				System.out.println(reverseNum);
			}
		}
