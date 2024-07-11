import java.util.Arrays;

public class BubbleArray {

    public static void rotate(int[] arr, int order) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }
        
        int n = arr.length;
        order = order % n; // Normalize rotation if order is larger than array length
        
        // Reverse the entire array
        reverse(arr, 0, n - 1);
        
        // Reverse the first 'order' elements
        reverse(arr, 0, order - 1);
        
        // Reverse the remaining elements
        reverse(arr, order, n - 1);
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
