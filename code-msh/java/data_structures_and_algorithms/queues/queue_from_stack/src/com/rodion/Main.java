/**
 * An algorithm that makes a Queue from a Stack
 */
package com.rodion;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.add(20);
        queue.add(30);
        queue.add(40);

        System.out.println(queue);

        queue.remove();

        System.out.println(queue);
    }
}