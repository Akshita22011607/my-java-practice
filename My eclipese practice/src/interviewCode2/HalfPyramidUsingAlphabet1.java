package interviewCode2;

public class HalfPyramidUsingAlphabet1 {//diff char in each row
	public void printHalfPyramidUsingAlphabet1(int row) {
		char ch ='A';
			for (int a = 0;a<=row;a++) {//outer loop for number of row
				for(int j = 0;j<=a;j++) {//inner loop for print number
					System.out.print(ch+" ");//will not give print ln otherwise it will print number  next line
					//ch in print statement because we want character in our console tab
				}
					System.out.println(); //just to print next row
					ch++;//Increment row value like first a then b then c then d till we parameter it
				//mujhe each row me alg char chaiye is liye row vale outer loop ko me increment de dungi
				//and then it will print next char acording to ASCII value till number or row we want to print
				}
			}
	public static void main(String[] args) {
		HalfPyramidUsingAlphabet1 obj = new HalfPyramidUsingAlphabet1();
		obj.printHalfPyramidUsingAlphabet1(7);
	}
}
