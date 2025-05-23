package interviewcode1;

public class NumberReversal {
	public static void main(String[] args) {
		// want to print 654321
		// we can use any loop but while is a fastest n easiest one
		int num = 123456;
		int reverseNum = 0, reminder;
		while (num != 0) {
			reminder = num % 10;//6
			num = num / 10;//12345
			reverseNum = reverseNum * 10 + reminder;//6 then 65 then 654 then 6543..till 654321

		}
		// example for loop/working is same as while
		/*
		 * for(;num!=0;num = num/10) { reminder = num % 10; reverseNum = reverseNum * 10
		 * + reminder; }
		 */
		System.out.println(reverseNum);
	}
}
