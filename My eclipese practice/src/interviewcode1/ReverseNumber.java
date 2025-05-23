package interviewcode1;

public class ReverseNumber {

	    // Non-static method to reverse and display the number
	    public void reverseAndDisplayNumber() {
	        int num = 123456789; // Number to reverse
	        int reverse = 0;     // Initialize reverse
	        // For loop:
	        // - Initialization: No initialization needed (value already given)
	        // - Condition: num > 0
	        // - Update: num = num / 10 //num = 12345678//this is for quotient
	        for (; num > 0; num = num / 10) {
	            int digit = num % 10;      //9//this is for remainder
	            reverse = reverse * 10 + digit; // Add digit to reversed number
	        }
	        // Display result
	        System.out.println("Reversed number: " + reverse);
	    }

	    public static void main(String[] args) {
	        // Create an object of the class
	    	ReverseNumber obj = new ReverseNumber();

	        // Call the non-static method using the object
	        obj.reverseAndDisplayNumber();
	    }
	}

