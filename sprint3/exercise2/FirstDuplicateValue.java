package exercise2;

import java.util.HashMap;

public class FirstDuplicateValue {

    public static void main(String[] args) {
        String[] array1 = {"a", "b", "c", "d", "c", "e", "f"};
        System.out.println(findDuplication(array1));
    }

    public static String findDuplication(String[] array1) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : array1) {
            if(map.get(s) != null) return s;
            map.put(s, 1);
        }

        return "";
    }

}
