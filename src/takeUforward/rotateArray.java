package takeUforward;

public class rotateArray {
//	Given an integer array nums, 
//	rotate the array to the right by k steps, where k is non-negative.
//	
//	https://leetcode.com/problems/rotate-array/description/

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		rotate(arr, 3);
		for (int x : arr) {
			System.out.println(x);
		}

	}

	static void rotate(int nums[], int k) {
		k %= nums.length;
		int[] temp = new int[k];
		int j = 0;
		for (int i = nums.length - k; i < nums.length; i++) {
			temp[j++] = nums[i];
		}
		for (int i = nums.length - 1; i >= k; i--) {
			nums[i] = nums[i - k];
		}
		for (int i = 0; i < temp.length; i++) {
			nums[i] = temp[i];
		}
	}

}
