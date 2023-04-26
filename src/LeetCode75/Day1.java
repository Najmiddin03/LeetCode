package LeetCode75;

public class Day1 {

	public static void main(String[] args) {
		int[] arr = { 5, 8, 6, 9, 4 };
		for (int x : runningSum(arr)) {
			System.out.print(x + " ");
		}
		System.out.println();
		System.out.println(pivotIndex(arr));
	}

//	Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
//	Return the running sum of nums.
	static public int[] runningSum(int[] nums) {
		int sum = 0;
		int[] ans = new int[nums.length];
		int i = 0;
		for (int x : nums) {
			sum += x;
			ans[i] = sum;
			i++;
		}
		return ans;
	}

//	Given an array of integers nums, calculate the pivot index of this array.
//	The pivot index is the index where the sum of all the numbers strictly to the left of the index is 
//	equal to the sum of all the numbers strictly to the index's right.
//	If the index is on the left edge of the array, then the left sum is 0 
//	because there are no elements to the left. This also applies to the right edge of the array.
//	Return the leftmost pivot index. If no such index exists, return -1.
	static public int pivotIndex(int[] nums) {
		int sum = 0;
		for (int x : nums) {
			sum += x;
		}
		int leftSum = 0;
		for (int i = 0; i < nums.length; i++) {
			if (leftSum == ((sum - nums[i]) / 2.0)) {
				return i;
			}
			leftSum += nums[i];
		}
		return -1;
	}

}
