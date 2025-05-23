package operators;

public class NumberRevese {

	public static void main(String[] args) {
		// want to print 654321
		//we can use any loop but while is a fastest n easiest one
		int num = 123456;
		int reverseNum = 0, reminder;
		while (num != 0) {
			reminder = num % 10;
			num = num / 10;
			reverseNum = reverseNum * 10 + reminder;	
			
		}
		//example for loop/working is same as while
		/*for(;num!=0;num = num/10) {
			reminder = num % 10;
			reverseNum = reverseNum * 10 + reminder;	
		}*/
		System.out.println(reverseNum);
	}
}
