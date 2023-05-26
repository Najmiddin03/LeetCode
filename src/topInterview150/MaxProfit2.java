package topInterview150;

public class MaxProfit2 {

//	You are given an integer array prices where prices[i] is the price of a given stock on the ith day.
//	On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time. 
//	However, you can buy it then immediately sell it on the same day.
//	Find and return the maximum profit you can achieve.

	public static void main(String[] args) {
		int arr[] = { 7, 4, 3, 9, 1, 2, 5 };
		System.out.println(maxProfit(arr));
	}

	static int maxProfit(int nums[]) {
		int profit = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			if ((nums[i + 1] - nums[i]) > 0) {
				profit += nums[i + 1] - nums[i];
			}
		}
		return profit;
	}
}
