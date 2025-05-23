package constructor;

public class SingleParametarizedConstructor {
	SingleParametarizedConstructor(int a) {// because we give single parameter to method
		System.out.println("Single Parametarized Constructor = " + a);
	}

	public static void main(String[] args) {
		SingleParametarizedConstructor obj = new SingleParametarizedConstructor(20);
	}
}
