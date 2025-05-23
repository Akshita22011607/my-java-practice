package operators;

public class AssignmentOperator {

	public static void main(String[] args) {
		//when we doesn't want to right a=a+10/a=a-5/a=a*2/a=a/5
		//then we provide short hand version of this
		//when we want to use high level language n make it attractive
		
		int a = 50;
		System.out.println(a);
		a = a+10;//this is traditional way to write this type of program
		System.out.println(a);//60
		
		//by using assignment operator//short hand method
		a += 10;// meaning of this is a = a+10
		System.out.println(a);//70
		
		a -= 10;// meaning of this is a = a-10
		System.out.println(a);//60
		
		a *= 10;// meaning of this is a = a*10
		System.out.println(a);//600
		
		a /= 10;// meaning of this is a = a/10
		System.out.println(a);//60
		
		a %= 10;// meaning of this is a = a%10
		System.out.println(a);//0
	}

}
