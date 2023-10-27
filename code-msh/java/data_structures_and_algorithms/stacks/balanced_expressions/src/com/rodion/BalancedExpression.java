/**
 * A class that will create a 'stackParantesis',
 * 'stackCurly' and 'stackSquare' instance of
 * Stack class with what we can check if any
 * of paranthesis, curly brases or square bracket
 * remained opened
 */
package com.rodion;


import java.util.Stack;


public class BalancedExpression {
    // Defining stacks
    Stack<Character> stackParanthesis = new Stack<>();
    Stack<Character> stackCurly = new Stack<>();
    Stack<Character> stackSquare = new Stack<>();

    // Stack creating based on iterating 'input'
    public String checkBalancing(String input) {
        for (char c : input.toCharArray()) {
            if (c == '(') {
                stackParanthesis.push(c);
            } else if (c == ')' && !stackParanthesis.isEmpty()) {
                stackParanthesis.pop();
            } else if (c == '{') {
                stackCurly.push(c);
            } else if (c == '}' && !stackParanthesis.isEmpty()) {
                stackCurly.pop();
            } else if (c == '[') {
                stackSquare.push(c);
            } else if (c == ']' && !stackSquare.isEmpty()) {
                stackSquare.pop();
            }
        }

        // Defining strings that will show the
        // final result
        String stringParanthesis;
        String stringCurly;
        String stringSquare;
        
        if (stackParanthesis.isEmpty()) {
            stringParanthesis = "No paranthesis remain opened";
        } else {
            stringParanthesis = stackParanthesis.size() + " paranthesis remained opened";
        }

        if (stackCurly.isEmpty()) {
            stringCurly = "No curly brases remained opened";
        } else {
            stringCurly = stackCurly.size() + " curly brases remained opened";
        }

        if (stackSquare.isEmpty()) {
            stringSquare = "No square braket remained opened";
        } else {
            stringSquare = stackSquare.size() + " square bracket remained opened";
        }

        return stringParanthesis + "\n" + stringCurly + "\n" + stringSquare + "\n";
    }
}