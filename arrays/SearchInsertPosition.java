public class SearchInsertPosition {

    public static int searchIndex(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (target == arr[mid]) {
                return mid;
            }

            if (target > arr[mid]) {
                left = mid + 1;
            }
            if (target < arr[mid]) {
                right = mid - 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 3, 5, 6 };
        int target = 4;
        System.out.println(searchIndex(arr, target));
    }
}
