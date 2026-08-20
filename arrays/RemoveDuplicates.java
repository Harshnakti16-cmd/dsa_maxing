
/**
 * Problem: Remove Duplicates from Sorted Array (LeetCode #26)
 * 
 * Description:
 * Given an integer array `arr` sorted in non-decreasing order, remove the duplicates in-place
 * such that each unique element appears only once. Return the number of unique elements `k`.
 * 
 * Approach:
 * Two Pointers (`i` pointing to last unique element, `j` scanning array). When `arr[j] != arr[i]`,
 * increment `i` and copy `arr[j]` to `arr[i]`. Returns `i + 1`.
 * 
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */
public class RemoveDuplicates {

    public static int remove(int[] arr) {
        int i = 0;

        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 1, 2, 2, 3, 4 };
        int result = remove(arr);
        System.out.println("The count of the unique elements is :- " + result);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
