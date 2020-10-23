package Problem1;
/*
    Nam Nguyen
    October 24, 2020
    CSS 143B
    Homework_3
 */

import javax.xml.stream.events.Characters;

public class ValidParentheses {
    // Do not change signature (function name, parameters, return type)
    public static boolean isValid(String str) {
        // homework
        // !!! must use ArrayStack or LinkedListStack from problem 1
        int rightCircleBracketCount = 0;
        int leftCircleBracketCount = 0;
        int rightSquareBracketCount = 0;
        int leftSquareBracketCount = 0;
        int rightCurlyBracketCount = 0;
        int leftCurlyBracketCount = 0;
        int expectedMatchCount = (str.length() / 2);
        int matchCount = 0;
        int filterCount = 0;

        //  filter the string
        if(str.length() == 0 || str == null){
            return false;
        } else {
            for(int i = 0; i < str.length(); i ++){
                if(str.charAt(i) == '('){
                    filterCount++;
                } else  if(str.charAt(i) == ')'){
                    filterCount++;
                } else  if(str.charAt(i) == '['){
                    filterCount++;
                } else  if(str.charAt(i) == ']'){
                    filterCount++;
                } else  if(str.charAt(i) == '{'){
                    filterCount++;
                } else  if(str.charAt(i) == '}'){
                    filterCount++;
                }
            }

            if(filterCount != str.length()){
                return false;
            }
        }

        char[] input = new char[str.length()];
        //  fill up the array with each char of str
        for(int i = 0; i < str.length(); i ++){
            input[i] = str.charAt(i);
        }

        //  adding up each BracketCount
        for(int i = 0; i < str.length(); i ++){
            if(input[i] == '('){
               leftCircleBracketCount++;
            } else  if(input[i] == ')'){
               rightCircleBracketCount++;
            } else  if(input[i] == '['){
                leftSquareBracketCount++;
            } else  if(input[i] == ']'){
                rightSquareBracketCount++;
            } else  if(input[i] == '{'){
                leftCurlyBracketCount++;
            } else  if(input[i] == '}'){
                rightCurlyBracketCount++;
            }

            if((leftCircleBracketCount + rightCircleBracketCount) != 0){
                if(((leftCircleBracketCount + rightCircleBracketCount) % 2) == 0){
                    matchCount++;
                }
            } else if((leftSquareBracketCount + rightSquareBracketCount) != 0){
                if(((leftSquareBracketCount + rightSquareBracketCount) % 2) == 0){
                    matchCount++;
                }
            } else if((leftCurlyBracketCount + rightCurlyBracketCount) != 0){
                if(((leftCurlyBracketCount + rightCurlyBracketCount) % 2) == 0){
                    matchCount++;
                }
            }
        }

        return (matchCount == expectedMatchCount);
    }
}
