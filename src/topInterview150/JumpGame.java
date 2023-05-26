package topInterview150;

public class JumpGame {

//	You are given an integer array nums. You are initially positioned at the array's first index, 
//	and each element in the array represents your maximum jump length at that position.
//	Return true if you can reach the last index, or false otherwise.

	public static void main(String[] args) {
		int arr[] = { 2, 4, 3, 3, 1, 0, 0, 6 };
		System.out.println(jumpGame(arr));
	}

	static boolean jumpGame(int nums[]) {
		int boundary = 0;
		for (int i = 0; i <= boundary; i++) {
			boundary = Math.max(boundary, i + nums[i]);
			if (boundary >= nums.length - 1)
				return true;
		}
		return false;
	}
}
