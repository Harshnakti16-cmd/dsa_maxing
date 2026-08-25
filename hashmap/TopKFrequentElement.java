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
