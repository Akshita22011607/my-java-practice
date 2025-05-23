package MethodPractice1;

public class MethodPractice4 {

	public static double multiplication1(double d, double e) {
		return d * e;
		// return is last statement of this method we can not write anything after
		// return
	}

	public static void main(String[] args) {
		System.out.println(MethodPractice4.multiplication1(20.3, 25.06));

		double Multiplication = MethodPractice4.multiplication1(20.3, 25.06);
		System.out.println(Multiplication);

		System.out.println("*********");

	}

}
