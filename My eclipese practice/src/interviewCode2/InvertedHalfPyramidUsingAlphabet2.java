package interviewCode2;

public class InvertedHalfPyramidUsingAlphabet2 {
	public static void printInvertedHalfPyramidUsingAlphabet1(int row) {//static method
		char ch = 'E';
		for(int a = row;a>=1;a--) {//outer loop for row
			for(int j = 1;j<=a;j++) {//print char
				System.out.print(ch+" ");
			}
			System.out.println();
			ch++; //without ch it will print on E value in inverted half pyramid
			//need to give ch++ for outer loop to chang the value 
			//in char it will change char order according to ascii value
		}
	}
	public static void main(String[] args) {
		InvertedHalfPyramidUsingAlphabet2.printInvertedHalfPyramidUsingAlphabet1(5);
	}
}
