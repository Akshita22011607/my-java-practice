package interviewCode2;

public class HalfPyramidUsingAlphabet {// print same alphabet
	public void printHalfPyramidUsingAlphabet(int row) {
		char ch ='A';
			for (int a = 0;a<=row;a++) {//outer loop for number of row
				for(int j = 0;j<=a;j++) {//inner loop for print number
					System.out.print(ch+" ");//will not give print ln otherwise it will print number  next line
					//ch in print statement because we want character in our console tab
				}
					System.out.println(); //just to print next row
				}
			}
	public static void main(String[] args) {
		HalfPyramidUsingAlphabet obj = new HalfPyramidUsingAlphabet();
		obj.printHalfPyramidUsingAlphabet(6);
	}
}
