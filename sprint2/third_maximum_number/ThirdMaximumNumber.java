package third_maximum_number;

public class ThirdMaximumNumber {

    public static void main(String[] args) {
        int[] nums = {2, 2, 3, 1};
        System.out.println(thirdMax(nums));
    }

    public static int thirdMax(int[] nums) {
        boolean swapped;
        for (int i = 0; i < nums.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] < nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }

        int distinctMaxCount = 1;
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                distinctMaxCount++;
                if (distinctMaxCount == 3) {
                    return nums[i];
                }
            }
        }

        return max;
    }

}
