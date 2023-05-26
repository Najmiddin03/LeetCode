package topInterview150;

import java.util.Arrays;
import java.util.HashMap;

public class MajorityElement {

//	Given an array nums of size n, return the majority element.
//	The majority element is the element that appears more than n / 2 times. 
//	You may assume that the majority element always exists in the array.

	public static void main(String[] args) {
		int arr[] = { 2, 854, 6, 45, 854, 854, 4, 854, 854, 514, 854, 54, 854, 854, 84, 854, 54, 854, 84, 854, 8 };
		int k = majorityElement(arr);
		System.out.println(k);
	}

	static int majorityElement(int[] nums) {
		HashMap<Integer, Integer> m = new HashMap<>();
		for (int x : nums) {
			if (m.containsKey(x)) {
				m.put(x, m.get(x) + 1);
				if (m.get(x) > nums.length / 2) {
					return x;
				}
			} else {
				m.put(x, 1);
			}
		}
		return 1;
	}

	static int majorityElement2(int[] nums) {
		Arrays.sort(nums);
		return nums[nums.length / 2];
	}
}
