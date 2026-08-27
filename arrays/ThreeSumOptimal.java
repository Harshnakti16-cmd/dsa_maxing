import java.util.*;

public class ThreeSumOptimal {

    public static List<List<Integer>> threeSum(int[] arr) {

        Arrays.sort(arr);

        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < arr.length - 2; i++) {

            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = arr.length - 1;
            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (sum > 0) {
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    list.add(Arrays.asList(arr[i], arr[left], arr[right]));
                    left++;
                    right--;

                }
            }

        }
        return list;
    }

    public static void main(String[] args) {

        int[] arr = { 1, -2, 3, 4, -6, 2, -1 };
        System.out.println(threeSum(arr));
    }
}
