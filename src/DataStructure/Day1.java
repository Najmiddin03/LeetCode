package DataStructure;

import java.util.HashSet;

public class Day1 {

	public static void main(String[] args) {
		int[] arr = { 6, 5, 3, -4, 9, 9, 9, -5, -60 };
		System.out.println(containsDuplicate(arr));
		System.out.println(maxSubArray(arr));
	}

//	Given an integer array nums, return true if any value appears at least twice in the array, 
//	and return false if every element is distinct.
	public static boolean containsDuplicate(int[] nums) {
		HashSet<Integer> set = new HashSet<>();
		for (int x : nums) {
			if (set.contains(x)) {
				return true;
			}
			set.add(x);
		}
		return false;
	}

//	Given an integer array nums, find the 
//	subarray with the largest sum, and return its sum.
	public static int maxSubArray(int[] nums) {
		int currentSum = nums[0];
		int maxSum = nums[0];
		for (int i = 1; i < nums.length; i++) {
			currentSum = Math.max(currentSum + nums[i], nums[i]);
			if (currentSum > maxSum) {
				maxSum = currentSum;
			}
		}
		return maxSum;
	}

}
