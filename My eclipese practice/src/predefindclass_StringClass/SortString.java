package predefindclass_StringClass;
//arrange or sort the character of string in ascending order.
import java.util.Arrays;//once Arrays class written it will automatically import java.util package
//We import the Arrays class from Java's utility library to use its sort() method.
	public class SortString {//main class
	    // Method to sort characters of a string and print result (no return)
	    public void sortCharacters(String input) {
	        // Convert string to character array
	        char[] chars = input.toCharArray();//Convert the string into a character array using .toCharArray().
                                 //Why? Because we can't sort a string directly, but we can sort an array.
	      //  chars = ['B', 'a', 'n', 'g', 'a', 'l', 'o', 'r', 'e'] convert Strin to char
	        
	        // Sort the characters
	        Arrays.sort(chars);//Sort the character array in ascending order using Arrays.sort().
	       //by using Arrays.sort it will print --> chars = ['B','a', 'a', 'e', 'g', 'l', 'n', 'o', 'r'];
//B comes first that a ,becasue ASCII value of B is less than ASCII value of a
//A to Z ASCII value is less than a to z ASCII value.	        
	        
	        // Now you want to convert this sorted character array back into a string.
	        String sorted = new String(chars);//create a new String object using this char[] array.

	        // Print inside the method
	        System.out.println("Sorted string: " + sorted);
	    }
	    public static void main(String[] args) {
	        SortString ss = new SortString();   // Create object
	    //either =   ss.sortCharacters("Bangalore");     // Call method (no need to capture return)
	      String str =   "Bangalore";//intialize String seprate 
	      System.out.println("original String = "+str);
	      ss.sortCharacters(str);//call method with respect to orignal String
	    }
	}