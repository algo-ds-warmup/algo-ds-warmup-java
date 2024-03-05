package contains_duplicate;

import java.util.HashMap;

public class DuplicateChecker {

    public static void main(String[] args) {
        int[] nums = {1, 1, 3, 3, 4, 5};
        System.out.println(findDuplication(nums));
    }

    public static boolean findDuplication(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if(map.get(num) != null) return true;
            map.put(num, 1);
        }

        return false;
    }

}
