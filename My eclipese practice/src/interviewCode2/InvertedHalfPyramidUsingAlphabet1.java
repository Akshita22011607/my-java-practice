package interviewCode2;

public class InvertedHalfPyramidUsingAlphabet1 {
	public static void printInvertedHalfPyramidUsingAlphabet(int row) {//static method
		char ch = 'E';
		for(int a = row;a>=1;a--) {
			for(int j = 1;j<=a;j++) {
				System.out.print(ch+" ");
			}
			System.out.println();
			//ch++;without ch it will print on E value in inverted half pyramid
		}
	}
	public static void main(String[] args) {
		InvertedHalfPyramidUsingAlphabet1.printInvertedHalfPyramidUsingAlphabet(5);
	}
}
