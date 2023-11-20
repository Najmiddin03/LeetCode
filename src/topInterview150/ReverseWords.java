package topInterview150;

public class ReverseWords {

//	Given an input string s, reverse the order of the words.
//	A word is defined as a sequence of non-space characters. 
//	The words in s will be separated by at least one space.
//	Return a string of the words in reverse order concatenated by a single space.
//	Note that s may contain leading or trailing spaces or multiple spaces between two words. 
//	The returned string should only have a single space separating the words. Do not include any extra spaces.

	public static void main(String[] args) {
		System.out.println(reverseWords(" hello my    good neighbour        "));
	}

	public static String reverseWords(String s) {
		s = s.trim();
		char[] charArr = s.toCharArray();
		char[] ans = new char[charArr.length];
		int i = charArr.length - 1;
		int ind = 0;

		while (i >= 0) {
			int j = i;
			while (i >= 0 && charArr[i] != ' ')
				i--;
			if (ind > 0)
				ans[ind++] = ' ';
			for (int k = i + 1; k <= j; k++)
				ans[ind++] = charArr[k];
			while (i >= 0 && charArr[i] == ' ')
				i--;
		}
		return new String(ans, 0, ind);
	}
}
