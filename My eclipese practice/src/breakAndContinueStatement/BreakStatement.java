package breakAndContinueStatement;

public class BreakStatement {
	public static void main(String[] args) {
		//loop ke andar statements to break loop
		int a = 0;
		while (a <= 20) {
			System.out.println(a);//output till 0 to 20
			a++;
			if(a==10) {//i break this number till 10 so it will give value before 10.
				break;//output till 9 only 
			}
		}
		System.out.println("loop ends here");//just to print last value not mandatory to write
	}
}
