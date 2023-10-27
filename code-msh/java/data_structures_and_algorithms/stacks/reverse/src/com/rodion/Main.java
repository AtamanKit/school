/**
 * Using Stacks to reverse a string "abcd"
 */
package com.rodion;


public class Main {
    public static void main(String[] args) {
        StringReverser str = new StringReverser();

        String strReversed = str.reverse("abcd");

        System.out.println(strReversed);
    }
}