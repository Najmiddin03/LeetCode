package topInterview150;

public class LastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int lengthOfLastWord(String s) {
		s = s.trim();
		int ans = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) != ' ') {
				ans++;
			} else {
				break;
			}
		}
		return ans;
	}

}
