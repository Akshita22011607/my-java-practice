package interviewCode2;

public class FullPyramid3 {
	public void printFullPyramid() {
		for (int a =0;a <6;a++) {//for number of row outer loop
			for (int s = 6-a;s>1;s--) {//creating black space for outer loop first star ke pehele vala space
				System.out.print(" ");//this is to print space thats why it is black it will print space only
			}
			for(int j = 0;j<=a;j++) {//inner loop to print star and it gives sequence also to star
				System.out.print("* ");//print star in one line
			}
			System.out.println();//to switch to next row
		}
	}
	/*public static void printFullPyramid1() {// static method
		for(int i = 0;i<5;i++) {//for row
			for(int s = 5-i;s>0;s++ ) {
				System.out.print(" ");
			}
			for(int j = 0;j<i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}*/
	public static void main(String[] args) {
		FullPyramid3 obj = new FullPyramid3();//creat object for non static method
		obj.printFullPyramid();//call method
		//FullPyramid3.printFullPyramid1();//call static method
	}
}
