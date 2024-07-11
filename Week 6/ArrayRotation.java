public class ArrayRotation {

    public void Question_1(int[] nums, int k) {
        if (k > nums.length)
            k = k % nums.length;
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
        ArrayRotation ar = new ArrayRotation();
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        ar.Question_1(nums, k);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
