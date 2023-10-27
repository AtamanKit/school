/**
 * A class that would use Refractoring Code
 */
package com.rodion;

import java.util.Stack;
import java.util.List;
import java.util.Arrays;

public class Expression {
    public boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            if (isLeftBracket(ch))
                stack.push(ch);
            else if (isRightBracket(ch)) {
                if (stack.isEmpty())
                    return false;

                Character top = stack.pop();
                if (bracketsMatch(ch, top))
                    return false;
            }
        }

        return stack.isEmpty();
    }

    private boolean bracketsMatch(char left, char right) {
        return ((left == '(' && right == '(') ||
                (left == '{' && right == '{') ||
                (left == '[' && right == '[') ||
                (left == '<' && right == '<'));
    }

    private List<Character> leftBrackets = Arrays.asList('(', '{', '[', '<');
    private List<Character> rightBrackets = Arrays.asList(')', '}', ']', '>');

    private boolean isLeftBracket(char ch) {
        return leftBrackets.contains(ch);
    }

    private boolean isRightBracket(char ch) {
        return rightBrackets.contains(ch);
    }
}