package DataStructure;

public class Day2 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 0, 0, 0 };
		int[] arr2 = { 2, 5, 6 };
		merge(arr, 3, arr2, 3);
		for (int x : arr) {
			System.out.print(x + " ");
		}
	}

//	You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, 
//	and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
//	Merge nums1 and nums2 into a single array sorted in non-decreasing order.
//	The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
//	To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements 
//	that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
	public static void merge(int[] nums1, int m, int[] nums2, int n) {

		int i = 0;
		int j = 0;
		int arr[] = new int[m + n];
		for (int x = 0; x < arr.length; x++) {
			if (j < n) {
				if (i < m) {
					if (nums1[i] < nums2[j]) {
						arr[x] = nums1[i];
						i++;
					} else {
						arr[x] = nums2[j];
						j++;
					}
				} else {
					arr[x] = nums2[j];
					j++;
				}

			} else {
				arr[x] = nums1[i];
				i++;
			}

		}
		for (int x = 0; x < m + n; x++) {
			nums1[x] = arr[x];
		}

	}

}
