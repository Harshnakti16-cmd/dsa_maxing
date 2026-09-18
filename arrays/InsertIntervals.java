import java.util.*;

public class InsertIntervals {

    public static int[][] insertIntervals(int[][] intervals, int[] newInterval) {

        ArrayList<int[]> result = new ArrayList<>();
        int i = 0;

        while (i < intervals.length && intervals[i][1] < newInterval[0]) {
            result.add(intervals[i]);
            i++;
        }
        while (i < intervals.length && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }

        result.add(newInterval);
        while (i < intervals.length) {

            result.add(intervals[i]);
            i++;
        }
        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {

        int[][] intervals = {
                { 1, 2 },
                { 3, 5 },
                { 6, 7 },
                { 8, 10 }
        };

        int[] newInterval = { 4, 8 };

        int[][] result = insertIntervals(intervals, newInterval);

        for (int[] interval : result) {
            System.out.println(
                    "[" + interval[0] + ", " + interval[1] + "]");
        }
    }
}
