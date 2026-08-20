
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

        System.out.println(counter.ping(100));
        System.out.println(counter.ping(200));
        System.out.println(counter.ping(300));
        System.out.println(counter.ping(3000));
        System.out.println(counter.ping(3500));
    }
}
