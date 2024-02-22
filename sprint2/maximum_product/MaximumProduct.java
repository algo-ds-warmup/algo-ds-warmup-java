package maximum_product;

public class MaximumProduct {

    public static void main(String[] args) {
        int[] nums = {-10, -10, -2, 2};
        System.out.println(maximumProduct(nums));
    }

    public static int maximumProduct(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int key = nums[i];
            int j = i - 1;
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j = j - 1;
            }
            nums[j + 1] = key;
        }

        int n = nums.length;
        return Math.max(nums[n - 1] * nums[n - 2] * nums[n - 3], nums[0] * nums[1] * nums[n - 1]);
    }

}
