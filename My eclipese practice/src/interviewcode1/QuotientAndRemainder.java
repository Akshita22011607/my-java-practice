package interviewcode1;

public class QuotientAndRemainder {
	public static float forQuotient(float a, float b) {// for Quotient and static method
		float result = a / b;
		return result;
	}
	public double forRemainder(double a, double b) {// for remainder and non static method
		double result = a % b;
		return result;
	}

	public static void main(String[] args) {// to call method

		float result = QuotientAndRemainder.forQuotient(50.5f, 5.6f);// for static call by using class
		System.out.println(" Quotient = " + result);

		QuotientAndRemainder obj = new QuotientAndRemainder();// for non-static by using object class
		double result1 = obj.forRemainder(100.35, 12.25);
		System.out.println(" Remainder =" + result1);
	}
}
