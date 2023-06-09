package topInterview150;

import java.util.Arrays;

public class ProductExceptSelf {

	public static void main(String[] args) {
		int[] arr = { 5, 1, 4, 2, 3, 5 };
		System.out.println(Arrays.toString(productExceptSelf(arr)));
	}

	static int[] productExceptSelf(int[] nums) {
		int result[] = new int[nums.length];
		result[0] = 1;
		for (int i = 1; i < nums.length; i++) {
			result[i] = result[i - 1] * nums[i - 1];
		}
		int suffix = 1;
		for (int i = nums.length - 2; i >= 0; i--) {
			suffix *= nums[i + 1];
			result[i] *= suffix;
		}
		return result;
	}

}
