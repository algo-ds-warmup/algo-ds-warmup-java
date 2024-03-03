package exercise1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class IntersectionOfArrays {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {0, 2, 4, 6, 8};
        System.out.println(Arrays.toString(findIntersection(array1, array2)));
    }

    public static int[] findIntersection(int[] array1, int[] array2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : array1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> intersectionList = new ArrayList<>();
        for (int num : array2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                intersectionList.add(num);
                map.put(num, map.get(num) - 1);
            }
        }

        return intersectionList.stream().mapToInt(Number::intValue).toArray();
    }

}
