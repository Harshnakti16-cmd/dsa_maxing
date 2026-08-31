public class MajorityElement {

    public static int majority(int[] arr) {
        int count = 0;
        int candidate = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (count == 0) {
                candidate = arr[i];
            }

            if (candidate == arr[i]) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }

    public static void main(String[] args) {

        int[] arr = { 2, 2, 1, 1, 1, 2, 2 };
        System.out.println(majority(arr));
    }
}