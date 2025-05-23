package finalKeyword;

public class FinalKeyword8 {//varible by using parameter
	
	public void parametricFinalKeyword(final int a) {
		System.out.println(a);
		//a = 23;we cant not parameter like this it will show error
	}

	public static void main(String[] args) {
		FinalKeyword8 obj = new FinalKeyword8();
		obj.parametricFinalKeyword(23);//for assigning final parametric variable
		obj.parametricFinalKeyword(36);
	}
}
