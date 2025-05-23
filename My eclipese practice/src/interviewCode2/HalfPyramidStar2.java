package interviewCode2;

public class HalfPyramidStar2 {
	public static void halfPyramidUsingMethod() {//static method
		int row = 10;
		for(int i = 0;i<=10;i++) {//outer loop for number of row
			for (int j = 0;j<=i;j++) {//inner loop for number of output in a row
				System.out.print("$ ");//want to print $//print just to print each row result in a single row
				//inner loop close//give space after $ just to have space between two $
			}
			System.out.println();//just to break each row
			//outer loop close
		}
	}
	public static void main(String[] args) {
		HalfPyramidStar2.halfPyramidUsingMethod();//call static method by using class
	}
}
