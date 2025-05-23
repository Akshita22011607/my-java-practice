package operators;

public class TernaryOperator {

	public static void main(String[] args) {
		
		int a = 25, b = 35;
		int c = 66, d = 99;
		
		//we try to get which is max value either a or b by using if else condition
		//but it is making our procedure lengthy
		/*if(a>b) {
			System.out.println("a is greater than b");
		}else {
			System.out.println("a is less than b");
		}*/
		
		//thats why we use ternary operator
		int highestNum = (a>b)? a:b;
		System.out.println("Highest number is = "+highestNum);
		
		int lowestNum = (c<d)? c:d;
		System.out.println("Lowest number is ="+lowestNum);
		
		//we can directly print value if we dont want to use it later
		System.out.println((a>b)? a:b);
	}

}

