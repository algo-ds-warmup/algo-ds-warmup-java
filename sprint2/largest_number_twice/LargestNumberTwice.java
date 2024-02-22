package largest_number_twice;

public class LargestNumberTwice {

    public static void main(String[] args) {
        int[] nums = {3, 6, 1, 0};
        System.out.println(dominantIndex(nums));
    }

    public static int dominantIndex(int[] nums) {
        int n = nums.length;
        int answer = findMaxIndex(nums);
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        if (nums[n - 1] >= 2 * nums[n - 2]) {
            return answer;
        }
        return -1;
    }

    public static int findMaxIndex(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int maxIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

}
