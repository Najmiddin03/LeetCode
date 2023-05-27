package topInterview150;

import java.util.Arrays;

public class H_index {

//	Given an array of integers citations where citations[i] is the number of citations a researcher received 
//	for their ith paper, return the researcher's h-index.
//	According to the definition of h-index on Wikipedia: The h-index is defined as the maximum value of h 
//	such that the given researcher has published at least h papers that have each been cited at least h times.

	public static void main(String[] args) {
		int arr[] = { 4, 2, 3, 6, 9, 8 };
		System.out.println(hIndex(arr));
	}

	static int hIndex(int[] citations) {
		int ans = 0;
		Arrays.sort(citations);
		for (int i = citations.length - 1; i >= 0; i--) {
			if ((citations.length - i) >= citations[i]) {
				ans++;
			}
		}
		return citations.length - ans;
	}

}
