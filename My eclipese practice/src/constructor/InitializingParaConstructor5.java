package constructor;

public class InitializingParaConstructor5 {
	double average;
	char ch;
	static long l;

	InitializingParaConstructor5(double d, char c, long l1) {//parameterised
		average = d;
		ch = c;
		l = l1;
	}
	InitializingParaConstructor5(char c) {
		ch = c;
	}

	public static void main(String[] args) {
		InitializingParaConstructor5 obj = new InitializingParaConstructor5(120.1,'S', 540);
		System.out.println("average = " + obj.average);
		System.out.println("char = " + obj.ch);
//		ConstructorPractice8.l = 500;
		System.out.println("long = " + InitializingParaConstructor5.l);

		InitializingParaConstructor5 obj1 = new InitializingParaConstructor5('Z');
		System.out.println("average = " + obj1.average);
		System.out.println("char = " + obj1.ch);
//		ConstructorPractice7.l = 500;
		System.out.println("long = " + InitializingParaConstructor5.l);

	}
}

