package com.rodion;

public class Queue {
    LinkedList list = new LinkedList();

    // public String Queue() {
    //     return list.display();
    // }

    public int enqueue(int value) {
        return list.addLast(value);
    }

    public int dequeue(){
        return list.removeFirst();
    }

    public int peek() {
        return list.showFirst();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    // public String display() {
    //     return list.display();
    // }

    @Override
    public String toString() {
        return list.display();
    }
}