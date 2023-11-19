package topInterview150;

public class ReverseWords {

//	Given an input string s, reverse the order of the words.
//	A word is defined as a sequence of non-space characters. 
//	The words in s will be separated by at least one space.
//	Return a string of the words in reverse order concatenated by a single space.
//	Note that s may contain leading or trailing spaces or multiple spaces between two words. 
//	The returned string should only have a single space separating the words. Do not include any extra spaces.

	public static void main(String[] args) {

	}

	public static String reverseWords(String s) {
		String[] str = s.trim().split(" ");
		s = "";
		for (int i = str.length - 1; i >= 0; i--) {
			if (str[i] == "") {
				continue;
			}
			System.out.println(str[i]);
			s += str[i];
		}
		s = s.trim();
		System.gc();
		return s;
	}

}
