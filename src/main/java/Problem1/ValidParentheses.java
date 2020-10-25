package Problem1;
/*
    Nam Nguyen
    October 25, 2020
    CSS 143B
    Homework_3
 */

public class ValidParentheses {
    // Do not change signature (function name, parameters, return type)
    public static boolean isValid(String str) {
        // homework
        // !!! must use ArrayStack or LinkedListStack from problem 1
        int matchCount = 0;
        int size = 0;

        //  filter the string
        if (str == null || str.length() == 0) {
            return true;
        } else if ((str.length() % 2) != 0) {
            return false;
        }

        char[] input = new char[str.length()];
        //  fill up the array with each char of str
        for (int i = 0; i < str.length(); i++) {
            if (size < input.length) {
                input[size] = str.charAt(i);
            }
            //  when input[tempIdx] contains a right side of a bracket than check if the left side is 1 index behind
            if (input[size] == ']') {
                if (i > 0 && input[size - 1] == '[') {
                    matchCount++;
                    size = size - 2;
                }
            } else if (input[size] == '}') {
                if (i > 0 && input[size - 1] == '{') {
                    matchCount++;
                    size = size - 2;
                }
            } else if (input[size] == ')') {
                if (i > 0 && input[size - 1] == '(') {
                    matchCount++;
                    size = size - 2;
                }
            }
            size++;
        }

        int expectedMatchCount = (str.length() / 2);
        if (matchCount > 0) {
            return (matchCount == expectedMatchCount);
        }
        return false;
    }
}
