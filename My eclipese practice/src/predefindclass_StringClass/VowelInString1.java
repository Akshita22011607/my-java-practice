package predefindclass_StringClass;
//Vowels in the string (AEIOU,aeiou)in string.
public class VowelInString1 {
	    public String getVowels(String input) {// Method to return vowels from the string
	    	//String input: You give it a string to work with
	    	//String before the method name means this method will return a string (the vowels).
	    	
	    String vowels = "";//Create an empty string to store the vowels we find.This is where we build our answer.
	    
	        // Loop through each character
	    for (int i = 0; i < input.length(); i++) {
	    	/*Start a for loop.i = 0: Start at the first character.
  i < input.length(): Loop until we’ve checked the whole string.input.length() gives total number of characters in the string.*/
	    char ch = input.charAt(i);//Use .charAt(i) to extract the character at position i.variable ch of type char.
             // Check if it's a vowel
	            
	    	if ("AEIOUaeiou".indexOf(ch) != -1){ /*Check if ch is a vowel:"AEIOUaeiou" is a string with all vowels.
                        .indexOf(ch) checks if ch exists in it.If yes, returns its position (0 or more).If not, returns -1.
                        So != -1 means the character is definitely a vowel.*/
	    		
	                vowels += ch;  // Add vowel to result string
	         //vowel = vowel+ch;//Add the vowel to the vowels string using concatenation.
	            }
	        }
	        return vowels;//After checking all characters, return the final vowel string.
	    }
	    public static void main(String[] args) {
	    	String s1 = "Akshita Ishwar Meshram";//original String
	    	System.out.println("Original String = "+s1);
	    	VowelInString1 vp = new VowelInString1();                    // Create object
	        String result = vp.getVowels(s1);            // Call method with respect to original String
	        System.out.println("Vowels in the string: " + result);   // Output: Aeaeio
	    }
	}