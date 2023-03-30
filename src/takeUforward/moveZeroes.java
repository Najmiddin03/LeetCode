package takeUforward;

public class moveZeroes {
//	Given an integer array nums, move all 0's to the end of it 
//	while maintaining the relative order of the non-zero elements.
//	Note that you must do this in-place without making a copy of the array.
//	
//	https://leetcode.com/problems/move-zeroes/description/

	public static void main(String[] args) {
		int[] arr = { 0, 1, 0, 3, 12 };
		move(arr);
		for (int x : arr) {
			System.out.println(x);
		}

	}

	static void move(int[] nums) {
		int count = 0;
		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[j++] = nums[i];
			} else {
				count++;
			}
		}
		for (int i = nums.length - count; i < nums.length; i++) {
			nums[i] = 0;
		}
	}

}
