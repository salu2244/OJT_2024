public class Question_3 {
    


    public static void rotate(int[] arr, int order) {
        if (arr == null || arr.length == 0 || order < 0) {
            throw new IllegalArgumentException("Illegal argument!");
        }
        
        int n = arr.length;
        order = order % n; // In case order > n
        
        // Length of first part
        int a = n - order;
        
        // Reverse first part
        reverse(arr, 0, a - 1);
        
        // Reverse second part
        reverse(arr, a, n - 1);
        
        // Reverse the whole array
        reverse(arr, 0, n - 1);
    }

    public static void reverse(int[] arr, int left, int right) {
        if (arr == null || arr.length <= 1) {
            return;
        }
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
        rotate(arr, order);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
