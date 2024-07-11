public class ArrayRotation {

    public void rotate(int[] nums, int k) {
        if (k > nums.length)
            k = k % nums.length;

        // Helper function to reverse an array or subarray
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        ArrayRotation solution = new ArrayRotation();

        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        System.out.println("Original array: " + java.util.Arrays.toString(nums));
        solution.rotate(nums, k);
        System.out.println("Rotated array: " + java.util.Arrays.toString(nums));
    }
}
