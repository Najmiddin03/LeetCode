package topInterview150;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

//	Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] 
//	such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
//	Notice that the solution set must not contain duplicate triplets.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> ans = new ArrayList<>();
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			if (i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}
			int j = i + 1;
			int k = nums.length - 1;
			while (j < k) {

				int sum = nums[i] + nums[j] + nums[k];
				if (sum > 0) {
					k--;
				} else if (sum < 0) {
					j++;
				} else {
					ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
					j++;
					while (nums[j] == nums[j - 1] && j < k) {
						j++;
					}
				}
			}
		}
		return ans;
	}

}
