package interviewCode2;

public class FullPyramid1 {//print 1,2,3,4,5 star in diffrent row
	// Method to print Full Pyramid
	void printFullPyramid() {//non static method
		for (int i = 0; i < 5; i++) { // Outer loop for rows
			for (int s = 5 - i; s > 1; s--) { //1st inner Loop for spaces// Printing spaces for alignment
				// creating black space for outer loop first star ke pehele vala space
				System.out.print(" "); // Print spaces
				// this is to print space thats why it is black it will print space only
			}
			for (int j = 0; j <= i; j++) {//2nd inner loop to print star and it gives sequence also to star 
				System.out.print("* "); // Print stars
			}
			System.out.println(); // Move to the next line
		}
	}
	// Main method to run the program
	public static void main(String[] args) {
		FullPyramid1 obj = new FullPyramid1(); // Create object of class
		obj.printFullPyramid(); // Call method to print pyramid
	}
}

/*for (int a = 0;a<6;a++) {
	for(int s = (row or 6)-a;s>0;s--) {
		System.out.print(" ");
	}
	for (int j = 0;j<a;j++) {
		System.out.print("* ");
	}
	System.out.println();
	
}*/