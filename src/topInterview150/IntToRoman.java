package topInterview150;

public class IntToRoman {

	public static void main(String[] args) {
		System.out.println(intToRoman(2300));

	}

	public static String intToRoman(int num) {
		String[] symbols = { "I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M" };
		int[] values = { 1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000 };

		StringBuilder result = new StringBuilder();
		int i = 12;

		while (num > 0) {
			int quotient = num / values[i];
			num %= values[i];
			for (int j = 0; j < quotient; j++) {
				result.append(symbols[i]);
			}
			i--;
		}
		return result.toString();
	}
}
