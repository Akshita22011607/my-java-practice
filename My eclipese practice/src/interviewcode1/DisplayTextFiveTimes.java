package interviewcode1;

public class DisplayTextFiveTimes {

    // Method to display text five times
    public static void displayText() {
        
        // 'for' loop structure: for(initialization; condition; increment)
        for (int i = 1; i <= 5; i++) {
            
            // Explanation:
            // int i = 1      → Initialization: Start the loop with i set to 1.
            // i <= 5         → Condition: Continue looping as long as i is less than or equal to 5.
            // i++            → Increment: After each loop, increase the value of i by 1.
            
            System.out.println("This is message number " + i);
        }
        
        // When i becomes 6, the condition (i <= 5) is false, so the loop stops.
    }

    public static void main(String[] args) {
        // Calling the method using the class name
    	DisplayTextFiveTimes.displayText();
    }
}

