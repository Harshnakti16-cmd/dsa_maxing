package arrays;

/**
 * Problem: Best Time to Buy and Sell Stock with Buy/Sell Details (LeetCode #121 variant)
 * 
 * Description:
 * Given an array `arr` of stock prices, determine the maximum profit from a single transaction
 * and also return the specific buying price and selling price that yielded the max profit.
 * 
 * Approach:
 * Single pass tracking minimum purchase price, max profit, and capturing the buy/sell price values.
 * Returns an array containing `[maximumProfit, buyPrice, sellPrice]`.
 * 
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */
public class BuySell2 {

    public static int[] profit(int[] arr) {
        int minimum = arr[0];
        int maximumProfit = 0;

        int buy = 0;
        int sell = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minimum) {
                minimum = arr[i];
            } else {
                int profit = arr[i] - minimum;

                if (profit > maximumProfit) {
                    maximumProfit = profit;
                    buy = minimum;
                    sell = arr[i];
                }
            }
        }
        return new int[] { maximumProfit, buy, sell };
    }

    public static void main(String[] args) {

        int[] arr = { 7, 1, 5, 3, 6, 4 };
        int[] result = profit(arr);
        System.out.println("Profit :- " + result[0]);
        System.out.println("Buy :- " + result[1]);
        System.out.println("Sell :- " + result[2]);

    }
}
