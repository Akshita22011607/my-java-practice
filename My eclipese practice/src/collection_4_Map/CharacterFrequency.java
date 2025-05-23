package collection_4_Map;
//mostly asked interview question
//Write program to count frequency of occurrence of digits in the 
import java.util.HashMap;//step 2 need to import HashMap package to access methods
public class CharacterFrequency {
    public static void main(String[] args) {
        String str = "Hello Java";  // The input string

        // Creating a HashMap to store characters and their frequencies
        HashMap<Character, Integer> frequencyMap = new HashMap<>();//step 1..creat object of HashMap with generic(key,value)
 //frequencyMap is refrance variable,<Character(frequency of char chaiye), Integer(want frequency in integer)> is generics,

        // Convert the string to a character array and loop using a for loop
        for (int i = 0; i < str.length(); i++) {
//str.length() returns the length of the string, which is 11 in this case (since "Hello Java" has 11 characters). 
        	
            char c = str.charAt(i);  // Get each character at position i
//Inside the loop, str.charAt(i) retrieves the character at index i in the string. i starts from 0 and goes up to str.length() - 1.
            
            // If the character is already in the map, increment its frequency
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
/* frequencyMap.getOrDefault(c, 0):This checks if the character c is already in the HashMap.
getOrDefault(c, 0) returns the current frequency of c if it's present in the map, or 0 if c is not found.*/ 
//+ 1:We increment the frequency by 1 because we have encountered the character c one more time.
/*frequencyMap.put(c, ...):We update the map by adding or updating the frequency of character c.If c is already present in the map, 
it updates the value (frequency). If c is not present, it adds the character c with an initial frequency of 1.     */      
        }
        // Print the frequency of each character
        for (Character c : frequencyMap.keySet()) {
            System.out.println(c + " : " + frequencyMap.get(c));
/*After the loop has completed and the frequency map has been updated for all characters, we print the frequencies.
The keySet() method returns a Set of the keys (characters) in the HashMap.
We then use a for-each loop to iterate through the keys and print each character along with its corresponding frequency from the map.       */     
        }
    }
}