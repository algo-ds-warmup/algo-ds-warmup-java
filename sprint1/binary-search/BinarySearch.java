public class BinarySearch {

    public static void main(String[] args) {
        System.out.println(search(new int[]{3,6,7,11}, 7));
    }

    public static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] < target) {
                low = ++mid;
            } else {
                high = --mid;
            }
        }

        return -1;
    }

}
