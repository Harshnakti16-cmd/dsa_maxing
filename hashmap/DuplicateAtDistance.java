import java.util.HashMap;

public class DuplicateAtDistance {

    public static boolean containsDupli(int[] arr, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            if (map.containsKey(arr[i])) {
                if (i - map.get(arr[i]) <= k) {
                    return true;
                }
            }
            map.put(arr[i], i);
        }
        return false;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 4, 1 };
        int k = 3;

        System.out.println(containsDupli(arr, k));
    }
}
