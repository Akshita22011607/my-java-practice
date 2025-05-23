package constructor;

class ClassA {
	ClassA() {
		System.out.println("This is class A constructor");
	}
	public static void main(String[] args) {
		InitializingParaConstructor6 obj = new InitializingParaConstructor6();
		// Create object in different class
		obj.display();// and call this method to different class
	}
}
class ClassB {
	ClassB() {
		System.out.println("This is class B constructor");
	}
}
public class InitializingParaConstructor6 {
	void display() { // we can call different method to different class.
		System.out.println("This is display class");
	}

	public static void main(String[] args) {
		ClassA objA = new ClassA();
		ClassB objB = new ClassB();
	}
}
