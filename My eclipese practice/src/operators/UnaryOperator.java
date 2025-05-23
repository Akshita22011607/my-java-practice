package operators;

public class UnaryOperator {

	public static void main(String[] args) {
		int a = 10;

		System.out.println(-a);// unary minus
		System.out.println(+a);// unary plus

		System.out.println(a++);// post increment
		System.out.println(a);// just to print post increment value
		System.out.println(++a);// pre increment
		System.out.println(--a);// pre decrement
		System.out.println(a--);// post decrement
		System.out.println(a);// just to print post decrement value
	}
}
