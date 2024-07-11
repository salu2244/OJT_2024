public class Question_2 {
    


    public static void rotate(int[] arr, int order) {
        if (arr == null || order < 0) {
            throw new IllegalArgumentException("Illegal argument!");
        }
        
        int n = arr.length;
        order = order % n; // In case order > n
        
        for (int i = 0; i < order; i++) {
            for (int j = n - 1; j > 0; j--) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
            }
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
