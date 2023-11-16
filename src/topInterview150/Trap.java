package topInterview150;

public class Trap {

//	Given n non-negative integers representing an elevation map 
//	where the width of each bar is 1, compute how much water it can trap after raining.

	public static void main(String[] args) {
		System.out.println(trap(new int[] { 3, 1, 2, 1, 0, 4 }));
	}

	public static int trap(int[] height) {
		int ans = 0;
		int lmax = 0;
		int rmax = 0;
		int left = 0;
		int right = height.length - 1;
		while (left < right) {
			if (height[left] > lmax)
				lmax = height[left];
			if (height[right] > rmax)
				rmax = height[right];
			rmax = Math.max(rmax, height[right]);
			if (lmax < rmax) {
				ans += lmax - height[left];
				left++;
			} else {
				ans += rmax - height[right];
				right--;
			}
		}
		return ans;
	}

}
