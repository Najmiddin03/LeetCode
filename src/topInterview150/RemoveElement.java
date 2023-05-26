package topInterview150;

import java.util.Arrays;

public class RemoveElement {

//	Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. 
//	The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
//	Consider the number of elements in nums which are not equal to val be k, to get accepted, 
//	you need to do the following things:
//	Change the array nums such that the first k elements of nums contain the elements which are not equal to val. 
//	The remaining elements of nums are not important as well as the size of nums.
//	Return k.

//	https://leetcode.com/problems/remove-element/

	public static void main(String[] args) {
		int[] arr = { 4, 2, 3, 5, 9, 6, 3, 5, 7, 2 };
		removeElement(arr, 5);
		System.out.println(Arrays.toString(arr));
	}

	static int removeElement(int[] arr, int n) {
		int i = 0;
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] != n) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
			}
		}
		return i;
	}
}
