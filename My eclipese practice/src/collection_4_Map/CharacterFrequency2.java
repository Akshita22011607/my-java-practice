package collection_4_Map;

import java.util.HashMap;

public class CharacterFrequency2 {
	public static void main(String[] args) {
		String str = "Akshita Ishwar Meshram";

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (int a = 0; a < str.length(); a++) {
			char c = str.charAt(a);
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		for(Character c1 : map.keySet()) {
			System.out.println(c1 +" = "+map.get(c1));
		}
	}
}
