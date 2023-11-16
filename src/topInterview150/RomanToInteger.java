package topInterview150;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

	public static void main(String[] args) {
		System.out.println(romanToInt("III"));
	}

	public static int romanToInt(String s) {
		Map<Character, Integer> m = new HashMap<>();
		m.put('I', 1);
		m.put('V', 5);
		m.put('X', 10);
		m.put('L', 50);
		m.put('C', 100);
		m.put('D', 500);
		m.put('M', 1000);
		int ans = 0;
		int prevNum = 0;
		for (int i = 0; i < s.length(); i++) {
			int currNum = m.get(s.charAt(i));
			if (i > 0 && prevNum < currNum) {
				ans -= 2 * prevNum;
			}
			ans += currNum;
			prevNum = currNum;
		}
		return ans;
	}
}
