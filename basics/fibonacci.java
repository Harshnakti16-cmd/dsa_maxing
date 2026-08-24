/**
 * Problem: Fibonacci Series Generator
 * Difficulty: Easy
 * 
 * Description:
 * Print the first `num` terms of the Fibonacci sequence where each number is the sum of the two preceding ones.
 * 
 * Approach:
 * Iterative approach maintaining two variables `first = 0` and `second = 1`, printing `first` and updating variables.
 * 
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */
public class fibonacci {

    public static void fibo(int num) {

        int first = 0;
        int second = 1;

        for (int i = 0; i < num; i++) {

            System.out.println(first);

            int fibo = first + second;

            first = second;
            second = fibo;
        }
    }

    public static void main(String[] args) {

        int num = 2;
        fibo(num);
    }
}
