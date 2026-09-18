import java.util.*;

/**
 * LeetCode 57: Insert Interval
 * Difficulty: Medium
 * 
 * Problem Description:
 * You are given an array of non-overlapping intervals intervals where intervals[i] = [start_i, end_i]
 * sorted in ascending order by start_i. You are also given an interval newInterval = [start, end]
 * that represents the start and end of another interval.
 * 
 * Insert newInterval into intervals such that intervals is still sorted in ascending order by
 * start_i and intervals still does not have any overlapping intervals (merge overlapping intervals if necessary).
 * Return intervals after the insertion.
 * 
 * Approach:
 * 1. Add all intervals ending before newInterval starts (no overlap).
 * 2. Merge all overlapping intervals by expanding newInterval:
 *    - newInterval[0] = Math.min(newInterval[0], intervals[i][0])
 *    - newInterval[1] = Math.max(newInterval[1], intervals[i][1])
 * 3. Add the merged newInterval.
 * 4. Add all remaining intervals that come after newInterval.
 * 
 * Time Complexity: O(N) where N is the number of intervals.
 * Space Complexity: O(N) to store the result list.
 */
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
