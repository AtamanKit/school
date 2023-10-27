package com.rodion;

import java.util.Stack;

public class Queue {
    private Stack<Integer> stackFirst = new Stack<>();
    private Stack<Integer> stackSecond =new Stack<>();

    public int add(int input) {
        stackFirst.push(input);
        
        return input;
    }

    public int remove(){
        if (stackFirst.isEmpty()) {
            throw new IllegalAccessError("Queue is empty!");
        }

        int element = 0;
        
        while (!stackFirst.isEmpty()) {
            element = stackFirst.pop();
            stackSecond.push(element);
        }

        stackSecond.pop();

        while (!stackSecond.isEmpty()) {
            stackFirst.push(stackSecond.pop());
        }

        return element;
    }

    @Override
    public String toString() {
        if (stackFirst.isEmpty()) {
            throw new IllegalAccessError("Queue is empty!");
        }

        return stackFirst.toString();
    }
}