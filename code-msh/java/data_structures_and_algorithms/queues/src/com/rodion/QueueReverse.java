package com.rodion;

import java.util.Queue;
import java.util.Stack;
import java.util.NoSuchElementException;

public class QueueReverse {
    private static Stack<Integer> stack = new Stack<>();
    
    public static void reverse(Queue<Integer> queue) {
        if (queue.isEmpty())
            throw new NoSuchElementException("Queue is empty");
        
        while(!queue.isEmpty())
            stack.push(queue.remove());

        while(!stack.isEmpty())
            queue.add(stack.pop());
    }
}