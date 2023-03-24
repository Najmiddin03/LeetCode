package reverseInteger;

public class Main {

//	Given a signed 32-bit integer x, return x with its digits reversed. 
//	If reversing x causes the value to go outside the signed 32-bit integer 
//	range [-231, 231 - 1], then return 0.
//
//	https://leetcode.com/problems/reverse-integer/

	public static void main(String[] args) {
		System.out.println(reverse(1534236469));
	}

	public static int reverse(int x) {
		if (x == 0) {
			return 0;
		}
		long result = 0;
		Boolean isMinus = false;
		if (x < 0) {
			x = x * -1;
			isMinus = true;
		}
		while (x >= 1) {
			result *= 10;
			result += x % 10;
			x /= 10;
		}
		if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
			return 0;
		}
		if (isMinus) {
			return (int) result * -1;
		} else {
			return (int) result;
		}
	}

}
