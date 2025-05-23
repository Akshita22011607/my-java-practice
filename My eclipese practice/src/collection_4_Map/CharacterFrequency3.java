package collection_4_Map;
//itna kiya to bhi ho jayenga usko single single line me karne ki jarurat nahi
import java.util.HashMap;
public class CharacterFrequency3 {

	public static void main(String[] args) {
		String str = "Akshita Meshram";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (int a = 0; a < str.length(); a++) {
			char c = str.charAt(a);
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		System.out.println(map);
	}
}
//output in single line {a=2, o=2, t=2, i=1, n=1, m=1, u=1}