/**
 * Using Stack and StringBuilder classes
 * to reverse the string.
 * StringBuilder (also StringBuffer class)
 * differs with String class, that both
 * StringBuilder and StringBuffer classes
 * are mutable while String not
 */
package com.rodion;


import java.util.Stack;


public class StringReverser {
    public String reverse(String input) {
        if (input == null) {
            throw new IllegalArgumentException();
        }

        Stack<Character> stack = new Stack<>();
        StringBuilder reverseInput = new StringBuilder();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        for (int i = 0; i < input.length(); i++) {
            char chr = stack.pop();
            reverseInput.append(chr);
        }

        return reverseInput.toString();
    }
}