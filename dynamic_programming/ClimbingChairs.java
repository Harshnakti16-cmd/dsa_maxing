/**
 * LeetCode 70: Climbing Stairs (Climbing Chairs)
 * Difficulty: Easy
 * 
 * Problem Description:
 * You are climbing a staircase/chairs. It takes `n` steps to reach the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * 
 * Approach: Space-Optimized Dynamic Programming (Iterative Fibonacci)
 * - Base cases: if n <= 2, return n ways.
 * - For n >= 3, number of ways to reach step i = ways(i-1) + ways(i-2).
 * - Keep track of previous two steps using variables `onestep` and `twostep`.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class ClimbingChairs {

    public static int climb(int n) {

        if (n <= 2) {
            return n;
        }

        int onestep = 1;
        int twostep = 2;

        for (int i = 3; i <= n; i++) {

            int current = onestep + twostep;
            onestep = twostep;
            twostep = current;
        }
        return twostep;

    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Distinct ways to climb " + n + " stairs: " + climb(n));
    }
}
