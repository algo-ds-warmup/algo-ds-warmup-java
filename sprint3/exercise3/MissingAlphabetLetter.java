package exercise3;

import java.util.HashMap;

public class MissingAlphabetLetter {

    public static void main(String[] args) {
        String input = "the quick brown box jumps over a lazy dog";
        System.out.println(findMissingLetter(input));
    }

    public static char findMissingLetter(String input) {
        HashMap<Character, Boolean> map = new HashMap<>();
        input = input.toLowerCase();

        for (char c : input.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                map.put(c, true);
            }
        }

        for (char c = 'a'; c <= 'z'; c++) {
            if (!map.containsKey(c)) {
                return c;
            }
        }

        return '-';
    }


}
