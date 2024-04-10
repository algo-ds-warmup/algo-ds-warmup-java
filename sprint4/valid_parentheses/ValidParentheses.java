package valid_parentheses;

import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {
        String open = "({[";
        String close = ")}]";

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if(open.indexOf(s.charAt(i)) != -1){
                stack.push(s.charAt(i));
            } else if (close.indexOf(s.charAt(i)) != -1 && !stack.pop().equals(getOpen(s.charAt(i)))) {
                return false;
            }
        }


        return stack.empty();
    }

    private char getOpen (char c){
        switch (c){
            case ')' -> {
                return '(';
            }
            case '}' -> {
                return '{';
            }
            case ']' -> {
                return '[';
            }
        }
        return '1';
    }

}
