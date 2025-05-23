package interviewcode1;

public class SumOfNaturalNumber {// sum of natural numbers from 1 to 50
	public int sumOfNaturalNum() {// non static method
		int sum = 0;// initialize sum
		// int i = 1 → Initialization: Start the loop with i set to 1.
		// i <= 50 → Condition: Continue looping as long as i is less than or equal to
		// 50.
		// i++ → Increment: After each loop, increase the value of i by 1.
		for (int a = 1; a <= 50; a++) {
			sum = sum + a; // Add the current value of 'i' to 'sum'
		}
		return sum;//return because return type is int
	}

	public static void main(String[] args) {
		SumOfNaturalNumber obj = new SumOfNaturalNumber();// creat object to call
		obj.sumOfNaturalNum();//call non static method
		int sum = obj.sumOfNaturalNum();
		System.out.println("Sum of Natural Number =" + sum);//print to console
	}
}
