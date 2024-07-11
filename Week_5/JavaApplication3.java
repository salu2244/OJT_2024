package javaapplication3;

import java.util.Arrays;

public class JavaApplication3 {

    public void rotate(int[] nums, int k) {
        if (k > nums.length) {
            k = k % nums.length;
        }

        int[] result = new int[nums.length];

        for (int i = 0; i < k; i++) {
            result[i] = nums[nums.length - k + i];
        }

        int j = 0;
        for (int i = k; i < nums.length; i++) {
            result[i] = nums[j];
            j++;
        }

        System.arraycopy(result, 0, nums, 0, nums.length);
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
