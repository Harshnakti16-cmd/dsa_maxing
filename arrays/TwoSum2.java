public class TwoSum2 {

    public static int[] sum(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] + arr[right] > target) {
                right--;
            } else if (arr[left] + arr[right] < target) {
                left++;
            } else {
                return new int[] { left + 1, right + 1 };
            }
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int arr[] = { 3, 4, 5, 7, 8 };
        int target = 9;
        int result[] = sum(arr, target);
        System.out.println(result[0] + " " + result[1]);
    }
}
