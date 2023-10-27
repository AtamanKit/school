package com.rodion;

import java.util.NoSuchElementException;

public class LinkedList {
    private Node first;

    private class Node {
        private int value;
        private Node next;

        private Node(int value) {
            this.value = value;
        }
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public int removeFirst() {
        if (isEmpty()) 
            throw new NoSuchElementException("Queue is empty!");
        
        int result = first.value;

        if (first.next != null)
            first = first.next;
        else 
            first = null;

        return result;
    }

    public int addLast(int value) {
        Node node = new Node(value);

        if (isEmpty())
            first = node;
        else {
            Node current = first;
            while (current.next != null)
                current = current.next;

            current.next = node;
        }

        return value;
    }

    public int showFirst() {
        if (isEmpty())
            throw new NoSuchElementException("Queue is empty!");

        return first.value;
    }

    public String display() {
        String text;
        if (isEmpty())
            text = "Queue is empty!";
        else if (first.next == null)
            text = "[" + first.value + "]";
        else {
            text = "[";
            Node current = first;
            while (current.next != null) {
                text += current.value + ", ";
                current = current.next;
            }

            text += current.value + "]";
        }

        return text;
    }
}