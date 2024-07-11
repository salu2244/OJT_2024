import java.util.Arrays;

public class BubbleRotate {

    public static void rotate(int[] arr, int order) {
        if (arr == null || order < 0) {
            throw new IllegalArgumentException("Illegal argument!");
        }

        int length = arr.length;
        order = order % length; // Normalize order if it's larger than array length

        // Step 1: Reverse the entire array
        reverse(arr, 0, length - 1);

        // Step 2: Reverse the first 'order' elements
        reverse(arr, 0, order - 1);

        // Step 3: Reverse the remaining 'length - order' elements
        reverse(arr, order, length - 1);
    }

    private static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int order = 3;

        System.out.println("Original array: " + Arrays.toString(arr));
        rotate(arr, order);
        System.out.println("Rotated array: " + Arrays.toString(arr));
    }
}
