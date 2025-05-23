package constructor;

public class ParameterizedConstructor2 {
	// Number of parameters should be different
	ParameterizedConstructor2(int a, short s) {
		System.out.println("Parameterized Constructor for int and short");
	}
	ParameterizedConstructor2(float fl) {
		System.out.println("Parameterized Constructor for float");
	}
	ParameterizedConstructor2(char ch, boolean bl, double dl) {
		System.out.println("Parameterized Constructor for boolean,char and double");
	}
	public static void main(String[] args) {// need to creat diffrent object
		ParameterizedConstructor2 obj1 = new ParameterizedConstructor2(202558);
		ParameterizedConstructor2 obj2 = new ParameterizedConstructor2(564.35f);
		ParameterizedConstructor2 obj3 = new ParameterizedConstructor2('S', true, 2035.69);
	}
}