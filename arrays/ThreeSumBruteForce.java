/**
 * Problem : 3sum
 * 
 */
public class ThreeSumBruteForce {

    public static int[] threeSum(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        return new int[] { arr[i], arr[j], arr[k] };
                    }
                }
            }
        }
        return new int[] { -1, -1, -1 };
    }

    public static void main(String[] args) {

        int[] arr = { 1, -2, 3, 4, -6, 2 };

        int[] result = threeSum(arr);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i] + " ");
        }
    }
}
