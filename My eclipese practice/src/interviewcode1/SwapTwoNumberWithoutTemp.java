package interviewcode1;

public class SwapTwoNumberWithoutTemp {

	public static void main(String[] args) {
		// swap number without temp variable
		int a = 25, b = 15;
		System.out.println("before swapping= " + a);
		System.out.println("before swaping= " + b);
		a = a + b;// a= 25+15;
		b = a - b;//b = 40-15;
		a = a - b;//a = 40-25;
		System.out.println("after swapping= " + a);
		System.out.println("after swaping= " + b);
		
		/* swap number without help of temporary variable temp
		 * int a = 20, b = 15, temp;
		 * temp = a; a = b; b = temp; System.out.println("after swapping= " + a);//after
		 * swapping System.out.println("after swaping= " + b);//after swapping
		 */
	}
}
