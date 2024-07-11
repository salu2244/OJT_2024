package javaapplication3;

import java.util.Arrays;

public class JavaArray{

    // Method 1: Using an Extra Array
    public void rotateUsingExtraArray(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[(i + k) % n] = nums[i];
        }

        System.arraycopy(result, 0, nums, 0, n);
    }

    // Method 2: Using Reversal
    public void rotateUsingReversal(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    // Method 3: Rotate One by One
    public void rotateOneByOne(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        for (int i = 0; i < k; i++) {
            rotateOnce(nums);
        }
    }

    private void rotateOnce(int[] nums) {
        int n = nums.length;
        int temp = nums[n - 1];

        for (int i = n - 1; i > 0; i--) {
            nums[i] = nums[i - 1];
        }
        nums[0] = temp;
    }

    // Method 4: Using Cyclic Replacements
    public void rotateUsingCyclicReplacements(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int count = 0;

        for (int start = 0; count < n; start++) {
            int current = start;
            int prev = nums[start];

            do {
                int next = (current + k) % n;
                int temp = nums[next];
                nums[next] = prev;
                prev = temp;
                current = next;
                count++;
            } while (start != current);
        }
    }

    // Default rotate method using the extra array approach
    public void rotate(int[] nums, int k) {
        rotateUsingExtraArray(nums, k);
    }

    public static void main(String[] args) {
        JavaApplication3 app = new JavaApplication3();

        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        System.out.println("Original array: " + Arrays.toString(nums));

        app.rotate(nums, k);

        System.out.println("Rotated array: " + Arrays.toString(nums));
    }
}
