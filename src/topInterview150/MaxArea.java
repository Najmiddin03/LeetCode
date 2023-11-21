package topInterview150;

public class MaxArea {

//	You are given an integer array height of length n. 
//	There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
//	Find two lines that together with the x-axis form a container, such that the container contains the most water.
//	Return the maximum amount of water a container can store.
//	Notice that you may not slant the container.

	public static void main(String[] args) {
		System.out.println(maxArea(new int[] { 8, 5, 6, 3, 4, 5, 6, 7, 3, 5, 4, 2, 3 }));
	}

	public static int maxArea(int[] height) {
		int ans = 0;
		int left = 0;
		int right = height.length - 1;
		while (left < right) {
			int h = Math.min(height[left], height[right]);
			ans = Math.max(ans, h * (right - left));
			while (height[left] <= h && left < right)
				left++;
			while (height[right] <= h && left < right)
				right--;
		}
		return ans;
	}
}
