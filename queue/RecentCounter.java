
/**
 * Problem: Number of Recent Calls (LeetCode #933)
 * 
 * Description:
 * You have a RecentCounter class which counts the number of recent requests within a certain time frame.
 * Implement the RecentCounter class:
 * - RecentCounter() Initializes the counter with zero recent requests.
 * - int ping(int t) Adds a new request at time t, where t represents some time in milliseconds,
 *   and returns the number of requests that happened in the past 3000 milliseconds (inclusive range [t - 3000, t]).
 * 
 * Approach:
 * Uses a Queue<Integer> to store timestamps. On each call to ping(t), add t to the queue.
 * Then remove timestamps from the front of the queue that are strictly less than (t - 3000).
 * Return the size of the queue.
 * 
 * Time Complexity: O(1) amortized per ping call
 * Space Complexity: O(W) where W is the number of pings within a 3000ms window
 */
import java.util.*;

public class RecentCounter {

    Queue<Integer> queue = new LinkedList<>();

    public int ping(int t) {

        queue.add(t);
        int boundary = t - 3000;
        while (queue.peek() < boundary) {
            queue.remove();
        }
        return queue.size();
    }

    public static void main(String[] args) {

        RecentCounter counter = new RecentCounter();

        System.out.print(counter.ping(100) + " ");
        System.out.print(counter.ping(200) + " ");
        System.out.print(counter.ping(300) + " ");
        System.out.print(counter.ping(3000) + " ");
        System.out.print(counter.ping(3500) + " ");
    }
}
