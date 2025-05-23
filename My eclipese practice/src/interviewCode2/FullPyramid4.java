package interviewCode2;

public class FullPyramid4 {
    // Method to print Full Pyramid
    void printFullPyramid() {
        int rows = 5; // Total number of rows//ham directly row na likhte hue number de skte hai
        for (int i = 0; i < rows; i++) { // Outer loop for number of rows//like i<6 is tarikese
        	for (int s = rows - i - 1; s > 0; s--) {// Loop for spaces (to align the pyramid)
                System.out.print(" ");
            }
            // Loop for stars (1, 3, 5, 7, 9 pattern)
            for (int j = 0; j < (2 * i) + 1; j++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }
    }

    // Main method to execute the code
    public static void main(String[] args) {
        FullPyramid4 obj = new FullPyramid4(); // Creating an object
        obj.printFullPyramid(); // Calling the method
    }
}