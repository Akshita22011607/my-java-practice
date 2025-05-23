package constructor;

public class ZeroParaConstructor {
	ZeroParaConstructor() {// Constructor name same as class name
		// (){ has no value in it thats why it is called zero para constructor
		System.out.println("Zero Parameterised Constructor");
		// want to print this in console
	}

	public static void main(String[] args) {
		ZeroParaConstructor obj = new ZeroParaConstructor();
		// (); has no value in it thats why it is called zero para constructor
		// need to creat object if we want to call constructor
		// in object we have new keyword thats why constructor get memory.
	}
}
