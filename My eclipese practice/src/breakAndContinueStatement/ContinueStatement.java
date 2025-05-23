package breakAndContinueStatement;

public class ContinueStatement {

	public static void main(String[] args) {
		// Skips the current iteration but continues the loop.

		// for single number
		/*
		 * int a = 1; 
		 * for (; a <= 8; a++) { 
		 * if (a == 5) 
		 * { continue;//continue ke vjh se jo ans me nahi chaiye vo cancle ho jayenga } 
		 * System.out.println(a);//5 cancle rest print }
		 */
		
		// for multiple numbers
		for (int a = 0; a <= 10; a++) {
			if (a == 5 || a == 7) {
				continue;// continue ke vjh se jo ans me nahi chaiye vo cancle ho jayenga
			}
			System.out.println(a);// 5 and 7 cancle rest print

		}
	}
}
