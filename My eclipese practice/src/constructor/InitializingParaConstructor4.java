package constructor;

public class InitializingParaConstructor4 {// constructor 1-hard coading//2nd constructor parameterised con.
	double average;
	char ch;
	static long l;

	InitializingParaConstructor4() {// its is zero parameterized constructor//hard coding
		average = 123.32;// not implementing direct giving value called(hard coding)//hamesha memory
							// change
		ch = 'A';// hamesha memory change hongi
		l = 3562;// staic ke liye ek hi bar assign hoti h jo ki letest vali rehti h//ek hi bar
					// memory
	}
	InitializingParaConstructor4(char c) {// parameterized constructor
		ch = c;
	}

	public static void main(String[] args) {
		InitializingParaConstructor4 obj1 = new InitializingParaConstructor4();// for 1st constructor
		System.out.println("double = " + obj1.average);// using object
		System.out.println("char = " + obj1.ch);// using object
		System.out.println("long = " + InitializingParaConstructor4.l);// using class name for static
		System.out.println("**********");
		InitializingParaConstructor4 obj2 = new InitializingParaConstructor4('F');// for second constructor
		System.out.println("char = " + obj2.ch); // with parameter
		System.out.println("double = " + obj2.average);// it will take default value because not initialized
		System.out.println("long = " + InitializingParaConstructor4.l);/*
		 * //static variable hai n usko ek hi bar memory allocated hoti h islia usne default 
		 * value na leke previous value li hain usi value ko hold karenga */
	}
}
