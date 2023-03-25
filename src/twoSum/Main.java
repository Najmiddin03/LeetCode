package twoSum;

import java.util.HashMap;

public class Main {

//	Given an array of integers nums and an integer target, 
//	return indices of the two numbers such that they add up to target.
//	You may assume that each input would have exactly one solution, 
//	and you may not use the same element twice.
//	You can return the answer in any order.

//	https://leetcode.com/problems/two-sum/

	public static void main(String[] args) {
		int[] arr = { 3, 3 };
		for (int x : twoSum(arr, 6)) {
			System.out.print(x + " ");
		}
	}

	public static int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> h = new HashMap<>();
		int[] arr = { 0, 0 };
		for (int i = 0; i < nums.length; i++) {
			if (h.containsKey(nums[i])) {
				arr[0] = h.get(nums[i]);
				arr[1] = i;
			}
			h.put(target - nums[i], i);
		}
		return arr;
	}

}
