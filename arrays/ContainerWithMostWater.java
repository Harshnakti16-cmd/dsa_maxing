/**
 * Problem: Container With Most Water (LeetCode #11)
 * Difficulty: Medium
 * 
 * Description:
 * Given an integer array `arr` where `arr[i]` represents the height of the i-th vertical line,
 * find two lines that together with the x-axis form a container that stores the maximum amount of water.
 * 
 * Approach:
 * Uses a Two-Pointer technique (`left = 0`, `right = arr.length - 1`).
 * 1. Calculate the area between `left` and `right`: `Math.min(arr[left], arr[right]) * (right - left)`.
 * 2. Update `maxArea` if the current area is greater.
 * 3. Move the pointer pointing to the shorter line (`left++` if `arr[left] < arr[right]` else `right--`),
 *    since the area is limited by the shorter height and moving the taller line cannot increase area.
 * 
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */
public class ContainerWithMostWater {

    public static int maximum(int[] arr) {

        int left = 0;
        int right = arr.length - 1;
        int maxArea = 0;

        while (left < right) {

            int height = Math.min(arr[left], arr[right]);
            int width = right - left;
            int area = height * width;

            if (area > maxArea) {
                maxArea = area;
            }

            if (arr[left] < arr[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {

        int[] arr = { 7, 1, 2, 3, 9 };
        System.out.println(maximum(arr));
    }
}
