package finalKeyword;

public class FinalKeyword {

	public static void main(String[] args) {
		final int a = 20;//initialize n declare at same line
		//final means constance menas iske bad iski value change nahi ho skti
		System.out.println(a);

//      a = 25; //it will give error says The final local variable a cannot be re-assigned.
		System.out.println(a);
	}
}
