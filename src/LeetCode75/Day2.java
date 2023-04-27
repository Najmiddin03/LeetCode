package LeetCode75;

public class Day2 {

	public static void main(String[] args) {
		System.out.println(isIsomorphic("bebo", "dadu"));
		System.out.println(isSubsequence("abc", "agfbnmce"));
	}

//	Given two strings s and t, determine if they are isomorphic.
//	Two strings s and t are isomorphic if the characters in s can be replaced to get t.
//	All occurrences of a character must be replaced with another character while preserving 
//	the order of characters. No two characters may map to the same character, 
//	but a character may map to itself.
	public static boolean isIsomorphic(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		int map1[] = new int[200];
		int map2[] = new int[200];
		for (int i = 0; i < s.length(); i++) {
			if (map1[s.charAt(i)] != map2[t.charAt(i)]) {
				return false;
			}
			map1[s.charAt(i)] = i;
			map2[t.charAt(i)] = i;
		}
		return true;
	}

//	Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
//	A subsequence of a string is a new string that is formed from the original string by 
//	deleting some (can be none) of the characters without disturbing the relative positions of 
//	the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
	public static boolean isSubsequence(String s, String t) {
		if (s.isEmpty()) {
			return false;
		}
		int j = 0;
		for (int i = 0; i < t.length(); i++) {
			if (s.charAt(j) == t.charAt(i)) {
				j++;
				if (j == s.length()) {
					return true;
				}
			}
		}
		return false;
	}

}
