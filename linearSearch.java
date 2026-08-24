public class linearSearch {

    public static int search(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = { 2, 1, 3, 4, 5, 7, 8 };

        int target = 7;
        System.out.println("Target found at index: " + search(arr, target));
    }
}
