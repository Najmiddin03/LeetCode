package topInterview150;

public class MaxProfit {

//	You are given an array prices where prices[i] is the price of a given stock on the ith day.
//	You want to maximize your profit by choosing a single day to buy one stock and 
//	choosing a different day in the future to sell that stock.
//	Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

	public static void main(String[] args) {
		int arr[] = { 7, 4, 3, 9, 1, 2, 5 };
		System.out.println(maxProfit(arr));
	}

	static int maxProfit(int nums[]) {
		int min = nums[0];
		int profit = 0;
		for (int i = 0; i < nums.length; i++) {
			if (min > nums[i]) {
				min = nums[i];
			}
			if ((nums[i] - min) > profit) {
				profit = nums[i] - min;
			}
		}
		return profit;
	}
}
