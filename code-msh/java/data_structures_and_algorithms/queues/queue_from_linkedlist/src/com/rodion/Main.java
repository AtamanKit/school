package com.rodion;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        System.out.println(queue);

        queue.dequeue();

        System.out.println(queue);

        System.out.println(queue.peek());
    }
}