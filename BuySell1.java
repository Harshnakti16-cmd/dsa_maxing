/**
 * Problem: Best Time to Buy and Sell Stock (LeetCode #121)
 * 
 * Description:
 * Given an array `arr` where `arr[i]` represents the stock price on day `i`, find the maximum profit
 * achievable by buying stock on one day and selling it on a future day. If no profit can be made, return 0.
 * 
 * Approach:
 * Single pass tracking the minimum purchase price seen so far (`minimum`) and calculating the potential
 * profit at each step (`arr[i] - minimum`), updating `maxProfit` whenever a higher profit is found.
 * 
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */
public class BuySell1 {

    public static int profit(int[] arr) {

        int minimum = arr[0];
        int maxProfit = 0;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < minimum) {
                minimum = arr[i];

            } else {
                int profit = arr[i] - minimum;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {

        int[] arr = { 7, 1, 5, 3, 6, 4 };

        int result = profit(arr);
        System.out.println(result);
    }
}
