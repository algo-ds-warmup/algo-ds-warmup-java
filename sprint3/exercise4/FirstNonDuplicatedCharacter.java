package exercise4;

import java.util.HashMap;

public class FirstNonDuplicatedCharacter {

    public static void main(String[] args) {
        String input = "minimum";
        System.out.println(findFirstNonDuplicatedCharacter(input));
    }

    public static char findFirstNonDuplicatedCharacter(String input) {
        HashMap<Character, Integer> counts = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (counts.get(c) == 1) {
                return c;
            }
        }

        return '-';
    }

}
