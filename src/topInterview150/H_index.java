package topInterview150;

import java.util.Arrays;

public class H_index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	static int hIndex(int[] citations) {
//		if (citations.length == 1) {
//			return 1;
//		}
		int ans = 0;
		Arrays.sort(citations);
		for (int i = citations.length - 1; i >= 0; i--) {
			if ((citations.length - i) >= citations[i]) {
				ans++;
			}
		}
		return citations.length - ans;
	}

}
