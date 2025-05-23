package constructor;

public class InitializingParaConstructor {// overview of global variable before initialization
	/*
	 * if we don't write constructor method below class it will add default
	 * constructor which is zero parameterized as well thats why global variable
	 * print its default value.
	 */
	double average;// global -nonstatic variable
	boolean flag;// global -nonstatic variable
	static int number;// global -static variable

	public static void main(String[] args) {
		InitializingParaConstructor obj = new InitializingParaConstructor();
		System.out.println("Default value");
		System.out.println("double = " + obj.average);//call default value of double by using object
		System.out.println("boolean = " + obj.flag);//call default value of boolean by using object
		System.out.println("int = " + InitializingParaConstructor.number);
		                                   // to call static int number by using class
	}
}
