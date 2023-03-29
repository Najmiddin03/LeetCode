package takeUforward;

public class isPalindrome {
//	Given an integer x, return true if x is a palindrome, and false otherwise.
//			
//	https://leetcode.com/problems/palindrome-number/
	
	public static void main(String[] args) {
		System.out.println(Palindrome(565));

	}

	static boolean Palindrome(int x) {
		if (x < 0) {
			return false;
		}
		int org=x;
		int reverse = 0;
		while (x >= 1) {
			reverse *= 10;
			reverse += x % 10;
			x /= 10;
		}
		System.out.println(reverse);
		if (reverse == org) {
			return true;
		} else {
			return false;
		}
	}

}
