package basicCodePractice;

public class AdditionOfTwoIntNum {

	/* direct main method me han program nahi likhenge sirf call karenge that is
	 * best practice method jitne bhi program hai abhi sare new method banake
	 * likhenge n main method me call karenge*/

	// example 1 for static method
	public static int additionOfTwoInt(int a, int b) {
		int result = a + b;
		return result;
	}
	// example 2 for Non-static method
	public int additionOfTwoInt1(int a, int b) {
		int result = a + b;
		return result;
	}
	public static void main(String[] args) {

		// call static method by using class as per coding standerds
		int result = AdditionOfTwoIntNum.additionOfTwoInt(20, 30);
		System.out.println("Addition of two static num = " + result);
		
		// call non staticusing object as per coding standerd
		AdditionOfTwoIntNum obj = new AdditionOfTwoIntNum();
		int result1 = obj.additionOfTwoInt1(15,15);
		System.out.println("Addition of two non-static num = " + result1);	
	}
}
