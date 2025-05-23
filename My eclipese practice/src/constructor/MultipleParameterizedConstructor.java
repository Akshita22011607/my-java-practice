package constructor;

public class MultipleParameterizedConstructor {
	MultipleParameterizedConstructor(int a, char ch, boolean bl) {
		System.out.println("Multiple Parameterized Constructor");
		// abhi bas call karna hai na ki console me uski value print
	}

	public static void main(String[] args) {
		MultipleParameterizedConstructor obj = new MultipleParameterizedConstructor(20, 'A', true);
	}
}
