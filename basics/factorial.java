/**
 * Problem: Factorial of a Number
 * Difficulty: Easy
 * 
 * Description:
 * Calculate the factorial of a non-negative integer `num` ($n! = 1 \times 2 \times \dots \times n$).
 * 
 * Approach:
 * Iterative approach initializing `fact = 1` and multiplying numbers from 1 to `num`.
 * 
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */
public class factorial {

    public static int fact(int num) {

        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {

        int num = 6;
        System.out.println(fact(num));
    }
}
