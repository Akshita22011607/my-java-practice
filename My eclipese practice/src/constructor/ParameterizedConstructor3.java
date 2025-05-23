package constructor;

public class ParameterizedConstructor3 {

	// Position of parameter should be different
	ParameterizedConstructor3( int a,double dl ,char ch) {
		System.out.println("Parameterized Constructor for int,double and char");
	}

	ParameterizedConstructor3(double dl , int a,char ch) {
		System.out.println("Parameterized Constructor for double,int and char");
	}

	public static void main(String[] args) {// need to creat diffrent object
		ParameterizedConstructor3 obj1 = new ParameterizedConstructor3(25,253.6,'d');
		ParameterizedConstructor3 obj2 = new ParameterizedConstructor3(252.35,20,'A');
	}
}
