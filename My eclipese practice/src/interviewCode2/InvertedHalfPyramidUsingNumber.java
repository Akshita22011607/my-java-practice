package interviewCode2;

public class InvertedHalfPyramidUsingNumber {//inverted half pyramid using number
	public void printInvertedHalfPyramid() {//creat method
		for (int a = 6;a>=1;a--) {//outer for loop for number or row starts from 6 then 5,4,3,2,1
			for(int j =1;j<=a;j++) {//inner loop to print value in perticuler row
				//like row 6 consisite value from 1 to 6 then row 2 1 to 5 then 3rd 1 to 4 4th 1 to 3 5th 1 to2 then 1
				System.out.print(j+" ");// Print the number
			}
			System.out.println();//Move to the next line or row.
		}
	}
	public static void main (String[] args) {
		InvertedHalfPyramidUsingNumber obj = new InvertedHalfPyramidUsingNumber();//object creat to call non static
		obj.printInvertedHalfPyramid();//call method
	}
}

