package interviewCode2;

public class HalfPyramidUsingNumber {
	public void printHalfPyramid() {//non static method
		int row = 7;//number of row
		for (int a = 0;a<=row;a++) {//outer loop for number of row
			for(int j = 0;j<=a;j++) {//inner loop for print number
				System.out.print(j+" ");//will not give print ln otherwise it will print number  next line
			}
			System.out.println(); //just to print next row
		}
	}
	//Second by using parameterized constructor
	public void printHalfPyramid1(int row) {//non static method
		//int row = 7;//number of row
		for (int a = 0;a<=row;a++) {//outer loop for number of row
			for(int j = 0;j<=a;j++) {//inner loop for print number
				System.out.print(j+" ");//will not give print ln otherwise it will print number  next line
			}
			System.out.println(); //just to print next row
		}
	}
	public static void main(String[] args) {
		HalfPyramidUsingNumber obj = new HalfPyramidUsingNumber();//object creat to call nonstatic
		obj.printHalfPyramid();//call non static method.
		obj.printHalfPyramid1(7);//call second method n give parameter to it
	}
}
