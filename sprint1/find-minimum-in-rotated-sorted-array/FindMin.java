public class FindMin {
    public static void main(String[] args) {
        System.out.println(findMin(new int[]{4,5,6,7,0,1,2}));
    }

    public static int findMin(int[] nums) {
        return binarySearch(nums);
    }

    public static int binarySearch(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return nums[low];
    }
}