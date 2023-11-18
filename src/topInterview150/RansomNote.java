package topInterview150;

public class RansomNote {

//	Given two strings ransomNote and magazine, return true if ransomNote 
//	can be constructed by using the letters from magazine and false otherwise.
//	Each letter in magazine can only be used once in ransomNote.

	public static void main(String[] args) {
		System.out.println(canConstruct("aaabbda", "aaaaaabbbbbbaaaaddd"));
	}

	public static boolean canConstruct(String ransomNote, String magazine) {
		int f[] = new int[128];
		for (char ch : ransomNote.toCharArray()) {
			int i = magazine.indexOf(ch, f[ch]);
			if (i == -1) {
				return false;
			}
			f[ch] = i + 1; 
		}
		return true;
	}

}
