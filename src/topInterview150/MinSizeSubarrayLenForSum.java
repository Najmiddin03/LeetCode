package topInterview150;

public class MinSizeSubarrayLenForSum {

//	Given an array of positive integers nums and a positive integer target, return the minimal length of a subarray
//	whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.

	public static void main(String[] args) {
		System.out.println(minSubArrayLen(16, new int[] { 2, 3, 4, 5, 6, 5, 3, 2 }));
	}

	public static int minSubArrayLen(int target, int[] nums) {
		int ans = Integer.MAX_VALUE;
		int left = 0;
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			while (sum >= target) {
				ans = Math.min(ans, i - left + 1);
				sum -= nums[left];
				left++;
			}
		}
		return ans == Integer.MAX_VALUE ? 0 : ans;
	}

}
