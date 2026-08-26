/**
 * Problem: Top K Frequent Elements (LeetCode #347)
 * Difficulty: Medium
 * 
 * Description:
 * Given an integer array `arr` and an integer `k`, return the `k` most frequent elements.
 * 
 * Approach:
 * Count frequencies using a `HashMap`. Use a Min-Heap (`PriorityQueue`) of size `k` to keep track of top frequent elements.
 * 
 * Time Complexity: O(N log K)
 * Space Complexity: O(N)
 */
import java.util.HashMap;
import java.util.PriorityQueue;

public class TopKFrequentElement {

    public static int[] frequent(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));

        for (int a : map.keySet()) {
            heap.offer(a);
            if (heap.size() > k) {
                heap.poll();
            }
        }

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = heap.poll();
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 2, 2, 3 };
        int k = 2;

        int[] result = frequent(arr, k);
        for (int i = 0; i < k; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
