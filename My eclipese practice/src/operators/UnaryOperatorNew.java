package operators;

public class UnaryOperatorNew {

	public static void main(String[] args) {

		int d = 7;
		int result = d++ + ++d + ++d - d++ + d-- + --d + ++d + --d - ++d - --d + d++; 
		// 7+9+10-10+11+9+10+9-10-9+9 = 45
	    System.out.println(result);

       	int c = 5;
		int result1 = c++ + ++c + ++c;//5+7+8 = 20
		System.out.println(result1);

		int a = 4;

		int res = ++a + a++ + ++a; // 5 + 5 + 7 = 17
		System.out.println(res); // 17

		int b = 5;

		res = b++ + b++ + ++b + ++b + b++; // 5 + 6 + 8 + 9 + 9
		System.out.println(res); // 37
		
		int e = 2;
		int result2 = ++e + ++e - --e - e-- + ++e + ++e - e++ + --e;
				//3+4-3-3+3+4-4+4
				System.out.println(result2);

	}

}
