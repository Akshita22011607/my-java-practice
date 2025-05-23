package predefindclass_StringClass;
//This class is for reversing a string
public class MyReverseString {
 public String ulataKaro(String input) {//  This is a custom method to reverse any string you give
     String result = "";// Step 1: Start with an empty string where we will store the reversed result
     // Step 2: Use a for loop to go from the last letter of input to the first
     // input.length() - 1 gives the last index (because index starts at 0)
     for (int i = input.length() - 1; i >= 0; i--) {
         // Step 3: Each time, pick the character at position i
         // and add it to the result (old result + new character from back)
         result = result + input.charAt(i);
     }
     return result;// Step 4: After the loop ends, we return the reversed result
 }
 public static void main(String[] args) {// This is the main method where execution starts
     // Step 5: Create object of the class to call the method
     MyReverseString obj = new MyReverseString();
     // Step 6: Declare the original string
     String name = "Akshita";
     // Step 7: Call the ulataKaro() method with original string and store result
     String ultaNaam = obj.ulataKaro(name);
     // Step 8: Print original and reversed string
     System.out.println("Original Name: " + name);     // Output: Akshita
     System.out.println("Ulta Name: " + ultaNaam);      // Output: atihskA
 }
}