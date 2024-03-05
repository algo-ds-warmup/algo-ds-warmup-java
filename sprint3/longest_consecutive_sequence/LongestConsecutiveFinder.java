package longest_consecutive_sequence;

import java.util.Arrays;
import java.util.HashMap;

public class LongestConsecutiveFinder {

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        System.out.println(longestConsecutive(nums));
    }

    public static int longestConsecutive(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxSequenceLength = 0;

        for (int num : nums) {
            if (!map.containsKey(num)) {
                int left = map.getOrDefault(num - 1, 0);
                int right = map.getOrDefault(num + 1, 0);
                int currentSequenceLength = 1 + left + right;

                maxSequenceLength = Math.max(maxSequenceLength, currentSequenceLength);

                map.put(num, currentSequenceLength);
                if (left > 0) {
                    map.put(num - left, currentSequenceLength);
                }
                if (right > 0) {
                    map.put(num + right, currentSequenceLength);
                }
            }
        }
        return maxSequenceLength;
    }

}
