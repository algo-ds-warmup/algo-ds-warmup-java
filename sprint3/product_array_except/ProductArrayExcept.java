package product_array_except;

import java.util.Arrays;
import java.util.HashMap;

public class ProductArrayExcept {

    public static void main(String[] args) {
        int[] nums = {-1,1,0,-3,3};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }

    public static int[] productExceptSelf(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] output = new int[nums.length];
        int count = 1;
        int zeroPosition = -1;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            map.merge(num, 1, Integer::sum);
            if (num != 0) {
                count *= num;
            } else {
                zeroPosition = i;
            }
        }

        if (map.get(0) == null) {
            for (int i = 0; i <= nums.length - 1; i++) {
                output[i] = count / nums[i];
            }
        } else if (map.get(0) == 1) {
            Arrays.fill(output, 0);
            output[zeroPosition] = count;
        } else {
            Arrays.fill(output, 0);
        }

        return output;
    }

}
