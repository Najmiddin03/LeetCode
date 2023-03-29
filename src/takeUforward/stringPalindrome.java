package takeUforward;

public class stringPalindrome {

//	A phrase is a palindrome if, after converting all uppercase letters 
//	into lowercase letters and removing all non-alphanumeric characters, 
//	it reads the same forward and backward. 
//	Alphanumeric characters include letters and numbers.
//	Given a string s, return true if it is a palindrome, or false otherwise.
//			
//	https://leetcode.com/problems/valid-palindrome/

	public static void main(String[] args) {
		System.out.println(Palindrome("A man, a plan, a canal: Panama"));
	}

	static boolean Palindrome(String s) {
		s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
		int i = 0;
		int j = s.length() - 1;
		while (i <= j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;

	}

}
