package topInterview150;

public class ZigzagConversion {

//	The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: 
//	(you may want to display this pattern in a fixed font for better legibility)
//
//	P   A   H   N
//	A P L S I I G
//	Y   I   R
//	
//	And then read line by line: "PAHNAPLSIIGYIR"
//	Write the code that will take a string and make this conversion given a number of rows

	public static void main(String[] args) {
		System.out.println(convert("HELLOWORLD", 3));
	}

	public static String convert(String s, int numRows) {
		if (numRows == 1) {
			return s;
		}

		int size = s.length();
		final char[] chars = new char[size];
		final int step = numRows * 2 - 2;
		int subStep = step;
		int row = 0;
		int index = row;
		for (int i = 0; i < size; i++) {
			chars[i] = s.charAt(index);

			if (0 < subStep && subStep < step && index + subStep < size) {
				chars[++i] = s.charAt(index + subStep);
			}

			index += step;
			if (index >= size) {
				index = ++row;
				subStep -= 2;
			}
		}

		return new String(chars);
	}

}
