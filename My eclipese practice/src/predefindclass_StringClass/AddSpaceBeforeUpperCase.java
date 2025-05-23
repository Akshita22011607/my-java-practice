package predefindclass_StringClass;
//Insert Space Before Capital Letters in String.
//Input String --> UnitedStatesOfAmerica
//Output,Add Space String --> United States Of America

public class AddSpaceBeforeUpperCase {
	    public String insertSpaces(String input) {
	    	     //Method that accepts a string and returns the modified version with spaces before uppercase letters.
	        String result = "";
	        		//Initialize an empty string where we’ll build the final output.
	        for (int i = 0; i < input.length(); i++) {//Loop through each character of the input string.
	        	/*Start a for loop.i = 0: Start at the first character.
	        i < input.length(): Loop until we’ve checked the whole string.input.length() gives total number of characters in the string.*/
	           char ch = input.charAt(i);
	           	 	//Get the character at position i and store it in ch.
	     // If capital letter and not the first letter, add a space
	            if (Character.isUpperCase(ch) && i != 0) {
	            	//Character.isUpperCase(ch) → is the character an uppercase letter?
	            		//i != 0 → is it not the first character?
	            			//We don’t add a space before the first capital letter, only others.
	                result += " ";//result = result+" "
	                //Add a space to the result before appending the capital letter.
	            }
	            result += ch;//final result = result+ch;//
	       // Whether it's uppercase or not, always add the current character to the result.
	        }
	        return result;//method has return types,After the loop ends, return the final result string.
	    }

	    public static void main(String[] args) {
	    	String s1 = "UnitedStatesOfAmerica";
	    	System.out.println("Original String = "+s1);
	    	AddSpaceBeforeUpperCase is = new AddSpaceBeforeUpperCase();  // Create object
	        String output = is.insertSpaces(s1);    // Call method
	        System.out.println("Modified string After Adding Space before uppercase: " + output);  // Output: United States Of America
	    }
	}
