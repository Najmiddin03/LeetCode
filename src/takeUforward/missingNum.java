package takeUforward;

import java.util.HashSet;

public class missingNum {
//	Given an array nums containing n distinct numbers in the range [0, n], 
//	return the only number in the range that is missing from the array.
//			
//	https://leetcode.com/problems/missing-number/description/

	public static void main(String[] args) {
		int[] arr = { 3, 0, 1 };
		System.out.println(missingNumber(arr));

	}

	static int missingNumber(int[] nums) {
		HashSet<Integer> h = new HashSet<>();
		for (int x : nums) {
			h.add(x);
		}
		for (int i = 0; i <= nums.length; i++) {
			if (!h.contains(i)) {
				return i;
			}
		}
		return 10;
	}

}
