package longestPalindrome;

public class Main {

	public static void main(String[] args) {
		System.out.println(longestPalindrome(null));
		System.out.println("Done");
	}

	static public String longestPalindrome(String s) {
		if (s == null) {
			return null;
		}
		if (s.isEmpty()) {
			return "";
		}
		String ans = "";
		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s.length(); j++) {
				if (s.charAt(i) != s.charAt(j)) {
					continue;
				}
				if (isPalindrome(s.substring(i, j + 1)) && s.substring(i, j + 1).length() > ans.length()) {
					ans = s.substring(i, j + 1);
				}
			}
		}
		return ans;
	}

	static boolean isPalindrome(String s) {
		StringBuffer sb = new StringBuffer(s);
		if (s.equals(sb.reverse().toString())) {
			return true;
		}
		return false;
	}
}
