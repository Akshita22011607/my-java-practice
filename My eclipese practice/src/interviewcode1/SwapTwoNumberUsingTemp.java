package interviewcode1;

public class SwapTwoNumberUsingTemp {

	public static void main(String[] args) {
		//swap number with the help of temporary variable temp
		
		int a = 20, b = 15, temp;
		// but temp variable ko declair karna hai initialise nahi
		// temp = a means temp = 15
		// a =b means a= 25
		// b= temp means b=15

		System.out.println("befor swapping= " + a);//before
		System.out.println("befor swaping= " + b);//before

		temp = a;
		a = b;
		b = temp;
		System.out.println("after swapping= " + a);//after swapping
		System.out.println("after swaping= " + b);//after swapping
	}
}
