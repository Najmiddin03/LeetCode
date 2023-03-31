package takeUforward;

public class maxConsecutiveOnes {

//	Given a binary array nums, return the maximum number of consecutive 1's in the array.
//
//	https://leetcode.com/problems/max-consecutive-ones/description/

	public static void main(String[] args) {
		int[] arr = { 1, 1, 0, 1, 1, 1 };
		System.out.println(find(arr));

	}

	static int find(int[] nums) {
		int max = 0;
		int count = 0;
		for (int x : nums) {
			if (x == 1) {
				count++;
			} else {
				count = 0;
			}
			if (count > max) {
				max = count;
			}
		}
		return max;
	}

}
