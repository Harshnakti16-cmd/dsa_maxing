import java.util.*;

public class ContainsDuplicate {

    public static int containsDuplicate(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            if (map.containsKey(num)) {
                return num;
            }
            map.put(num, 1);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1 };
        int result = containsDuplicate(arr);
        System.out.println(result);
    }
}
