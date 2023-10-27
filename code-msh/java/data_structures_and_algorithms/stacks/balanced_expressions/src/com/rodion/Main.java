/**
 * Algorithm that checks if is there any
 * open paranthesis, curly brases or
 * square bracket
 */
package com.rodion;

public class Main {
    public static void main(String[] args) {
        Expression exp = new Expression();

        boolean result = exp.isBalanced(
                "This (is)) a case expression");

        System.out.println(result);
    }
}