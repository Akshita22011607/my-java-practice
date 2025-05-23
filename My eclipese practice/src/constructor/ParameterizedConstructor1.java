package constructor;

public class ParameterizedConstructor1 {

	ParameterizedConstructor1(int a) {
		System.out.println("Parameterized Constructor for int");
	}
	ParameterizedConstructor1(float fl) {
		System.out.println("Parameterized Constructor for float");
	}
	ParameterizedConstructor1(boolean bl) {
		System.out.println("Parameterized Constructor for boolean");
	}
	ParameterizedConstructor1(char ch) {
		System.out.println("Parameterized Constructor for charecter");
	}

	public static void main(String[] args) {//need to creat diffrent object
		ParameterizedConstructor1 obj1 = new ParameterizedConstructor1(20);
		ParameterizedConstructor1 obj2 = new ParameterizedConstructor1(564.35f);
		ParameterizedConstructor1 obj3 = new ParameterizedConstructor1(true);
		ParameterizedConstructor1 obj4 = new ParameterizedConstructor1('A');
	}
}
