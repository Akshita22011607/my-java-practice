package predefindclass_StringClass;
//Goal: Add digits present in a string like "Th12is i5s g6ar54den"
//Expected Output: 1 + 2 + 5 + 6 + 5 + 4 = 23
public class DigitAdditionInString1 {
 public int addStringDigits(String str) {// Create method to add all digits from the string
     int sum = 0; // Step 1:give empty value to store sum, Initialize total sum variable
     for (int i = 0; i < str.length(); i++) {  // Step 2: Loop through each character of the string
  // Character.isDigit is predefine method in Character class which check char is digit or not
         if (Character.isDigit(str.charAt(i))) { 
        	 // Step 3: Check if current character is a digit (0–9) 
             // Step 4: Convert that digit character into actual number and add to sum
 // Character.getNumericValue is predefine method in Character class to convert digit to number 
        	 //means once we get digit it convert it to numeric value n add it to sum it
             sum = sum + Character.getNumericValue(str.charAt(i));
             //same as reverse string just replace with predefine method in String()
         }
     }
     // Step 5: Return the final sum of digits
     return sum;//because we gave return type to method
 }
 public static void main(String[] args) {
	 String original =  "Th12is i5s g6ar54den";
	 System.out.println("Original String = "+original);
     // Step 6: Create object to call the method
     DigitAdditionInString1 obj = new DigitAdditionInString1();

     // Step 7: Call the method and print the result
     System.out.println("Addition of num in String = "+obj.addStringDigits("Th12is i5s g6ar54den"));
 }
}