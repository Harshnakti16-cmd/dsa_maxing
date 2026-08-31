public class MoveZeros {

    public static int[] move(int[] arr) {

        int slow = 0;

        for (int fast = 0; fast < arr.length; fast++) {

            if (arr[fast] != 0) {
                arr[slow] = arr[fast];
                slow++;
            }
        }
        while (slow < arr.length) {
            arr[slow] = 0;
            slow++;
        }
        return arr;

    }

    public static void main(String[] args) {

        int[] arr = { 0, 1, 0, 3, 12 };
        int[] result = move(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
