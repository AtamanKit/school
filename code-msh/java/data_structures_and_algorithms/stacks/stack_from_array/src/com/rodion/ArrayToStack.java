/**
 * Class called ArrayToStack
 * that will operate with
 * .push(), .pop(), .peek(),
 * .isEmpty() methods
 */
package com.rodion;


import java.util.Arrays;


public class ArrayToStack {
    private int[] array = new int[5];
    private int top = -1;

    public int push(int input) {
        if (array.length - top == 1){
            int[] newArray = new int[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }

            array[++top] = input;

        return input;
    }

    public int pop() {
        if (isEmpty()) 
            return -1;

        // int result = array[top];
        // array[top] = 0;
        // top--;

        return array[top--];
    }

    public int peek() {
        if (isEmpty())
            return -1;

        return array[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void display() {
        String list = Arrays.toString(array);

        System.out.println(list);
    }
}
