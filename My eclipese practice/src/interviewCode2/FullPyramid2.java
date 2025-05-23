package interviewCode2;

public class FullPyramid2 {
    void printFullPyramid() {
        int rows = 5; // Total number of rows
        for (int i = 0; i < rows; i++) { // Outer loop for number of rows
            // Loop for spaces (to align the pyramid)
            for (int s = rows - i; s > 1; s--) {//1st inner loop to creat space
                System.out.print(" ");
            }
            // Loop for stars (1, 3, 5, 7, 9 pattern)
            for (int j = 0; j < (2 * i) + 1; j++) {//2nd inner loop to print star
                System.out.print("*");
            }
            System.out.println(); // Move to the next line 
        }
    }
    public static void main(String[] args) {// Main method to execute the code
        FullPyramid2 obj = new FullPyramid2(); // Creating an object
        obj.printFullPyramid(); // Calling the method
    }
}