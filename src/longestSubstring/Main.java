package longestSubstring;

import java.util.HashMap;

public class Main {

//	Given a string s, find the length of the longest 
//	substring without repeating characters.

//	https://leetcode.com/problems/longest-substring-without-repeating-characters/

	public static void main(String[] args) {
		System.out.println(longestSubstring(""));
	}

	public static int longestSubstring(String s) {
		HashMap<Character, Boolean> h = new HashMap<>();
		int count = 0;
		int max = 0;
		for (int j = 0; j < s.length(); j++) {
			for (int i = j; i < s.length(); i++) {
				if (h.containsKey(s.charAt(i))) {
					h.clear();
					if (count > max) {
						max = count;
					}
					count = 0;
					break;
				}
				h.put(s.charAt(i), true);
				count++;
			}
		}
		if (count > max) {
			max = count;
		}
		return max;
	}

}
