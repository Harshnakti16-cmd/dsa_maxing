
public class ContainerWithMostWater {

    public static int maximum(int[] arr) {

        int left = 0;
        int right = arr.length - 1;
        int maxArea = 0;

        while (left < right) {

            int height = Math.min(arr[left], arr[right]);
            int width = right - left;
            int area = height * width;

            if (area > maxArea) {
                maxArea = area;
            }

            if (arr[left] < arr[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {

        int[] arr = { 7, 1, 2, 3, 9 };
        System.out.println(maximum(arr));
    }
}
