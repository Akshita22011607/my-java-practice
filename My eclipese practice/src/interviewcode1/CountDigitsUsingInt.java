package interviewcode1;

public class CountDigitsUsingInt {

	    // Method to count and display the total number of digits
	    public static void countAndDisplayDigits() {//for static
	        int num = 123456789; // Number to count digits
	        int count = 0;       // Initialize count

	        // For loop:
	        // - Initialization: No initialization needed (value already given)
	        // - Condition: num > 0
	        // - Update: num = num / 10
	        for (; num > 0; num = num / 10) {
	            count = count + 1; // Increase count for each digit
	        }
	        // Display result
	        System.out.println("Total number of digits: " + count);
	    }

	    public static void main(String[] args) {
	        // Call the method using class name for static
	        CountDigitsUsingInt.countAndDisplayDigits();
	    }
	}



