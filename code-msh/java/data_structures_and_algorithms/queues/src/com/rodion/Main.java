/**
 * An algorithm that will reverse the
 * given 'queue'
 */
package com.rodion;

import java.util.Queue;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();

        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        System.out.println(queue);

        QueueReverse.reverse(queue);

        System.out.println(queue);
    }
}