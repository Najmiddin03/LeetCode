package topInterview150;

public class LongestCommonPrefix {

//	Write a function to find the longest common prefix string amongst an array of strings.
//	If there is no common prefix, return an empty string "".

	public static void main(String[] args) {
		System.out.println(longestCommonPrefix(new String[] { "flower", "flight", "flow" }));
	}

	public static String longestCommonPrefix(String[] strs) {
		String ans = strs[0];
		for (String x : strs) {
			while (x.indexOf(ans) != 0) {
				ans = ans.substring(0, ans.length() - 1);
			}
		}
		return ans;
	}

}
