import java.util.*;

public class ContainsDuplicate {

    public static boolean containsDupli(int[] arr) {

        HashSet<Integer> set = new HashSet<>();

        for (int a : arr) {
            if (set.contains(a)) {
                return true;
            }
            set.add(a);
        }
        return false;

    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 2 };
        System.out.println(containsDupli(arr));
    }
}
