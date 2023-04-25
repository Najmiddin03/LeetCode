package LeetCode75;

public class Main {

	public static void main(String[] args) {
		int[] arr = { 5, 8, 6, 9, 4 };
		for (int x : runningSum(arr)) {
			System.out.print(x + " ");
		}
		System.out.println();
		System.out.println(pivotIndex(arr));
	}

	//Day 1
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
