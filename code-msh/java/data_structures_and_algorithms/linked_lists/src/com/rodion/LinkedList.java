/**
 * A 'LinkedList' class that contains the 'Node' class
 * a private class that will store our Linked List
 * elements. Then we will add the 'addFirst()',
 * 'addLast()', 'contains()', 'display()' classes that
 * will allow us to make manipulations with 
 * our linked list
 */
package com.rodion;


import java.util.Arrays;


public class LinkedList {
    private class Node {
        private int value;
        private Node next;

        private Node(int value) {
            this.value = value;
        };
    }


    private Node first;
    private Node last;

    private int size = 0;


    // Verifying if Linked List is empty
    private boolean isEmpty() {
        return first == null;
    }


    // Adding first element
    public void addFirst(int value) {
        Node node = new Node(value);

        if (isEmpty()) {
            first = last = node;
        } else {
            node.next = first;
            first = node;
        };

        size++;

    };


    // Adding last element
    public void addLast(int value) {
        Node node = new Node(value);

        if (isEmpty()) {
            first = last = node;
        } else {
            last.next = node;
            last = node;
        };

        size++;
    }


    // Checking if Linked List contains given 'value' element
    public void contains(int value) {
        // Messages that will be included as 
        // a response of 'contains' method
        String noMessage = String.format("None of the Linked List elements contains %s", value);
        String yesMessage = String.format("Linked List contains element: %s", value);

        // Booleans that will check if after iterating
        // the elements with While Loop
        // Linked List contains or not the given 'value'
        boolean checkWhile = false;
        boolean checkYes = false;

        Node current = first;

        if (current == null) {
            System.out.println("There is no element in the Linked List ");
        } else if (current.value == value) {
            System.out.println(yesMessage);
        } else if (current.next == null) {
            System.out.println(noMessage);
        } else {
            while (current.next != null) {
                checkWhile = true;
                current = current.next;
                if (current.value == value) {
                    checkYes = true;
                    System.out.println(yesMessage);
                    break;
                }
            };
        };

        if (checkWhile && !checkYes) {
            System.out.println(noMessage);
        };
    };


    // Deleting the first element
    public void deleteFirst() {
        if (isEmpty()) {
            System.out.println("There are no elements in the Linked List");
        } else if (first.next == null) {
            System.out.println("Deleted the first element");
            first = null;
        } else {
            System.out.println("Deleted the first elelemt");
            Node current = first;
            first = current.next;
            current = null;
        };

        size--;
    };


    // Deleting the last element
    public void deleteLast() {
        if (isEmpty()) {
            System.out.println("There are no elements in the Linked List");
        } else if (first == last) {
            System.out.println("Deleted the last element");
            first = null;
        } else {
            Node current = first;

            while (current.next != null) {
                if (current.next == last) {
                    last = current;
                    System.out.println("Deleted the first elelemt");
                    current.next = null;
                    break;
                };

                current = current.next;
            };
        };

        size--;
    }


    // Transform Linked List into Array
    private int[] createArray() {
        int[] array = new int[size];

        if (!isEmpty()) {
            Node current = first;
            array[0] = current.value;
            int index = 0;
            while (current.next != null) {
                current = current.next;
                array[index++] = current.value;
            };
        };

        return array;
    };


    // Displaying Array based on 'createArray()' method
    public void toArray() {
        String array = Arrays.toString(this.createArray());
        System.out.println("Linked List to Array: " + array);
    };


    //Reversing Linked List
    public void reverse() {
        /**
         * First way with 'node' creation
         * more memory consuming
            // Node current = first;
            // Node previous = first;
            // Node subsequent;
        // if (!isEmpty()) {
            // while (current.next != null) {
            //     Node node = new Node(current.next.value);
            //     node.next = previous;
            //     subsequent = current.next;
            //     previous = node;
            //     current = subsequent;
            // };

            // last = first;
            // last.next = null;
            // first = previous;
        //};
        */
         
        // Second way, less memory consuming
        if (!isEmpty() && first != last) {
            Node previous = first;
            Node current = previous.next;
            Node subsequent = current.next;
        
            while (current.next != null) {
                current.next = previous;
                previous = current;
                current = subsequent;
                subsequent = current.next;
            };

            current.next = previous;
            last = first;
            last.next = null;
            first = current;
        }
    };


    // Get the element of K value starting with the end 
    public void kthValue(int value){
        if (isEmpty()) {
            System.out.println("No elements in Linked List");
        } else if (first == last && value != 1) {
            System.out.println("Value can receive only \"1\"");
        } else if (first == last && value == 1) {
            System.out.println("Value of Linked List elements when K = " + value);
        } else if (value <= 0) {
            System.out.println("\"K\" can not be the given value");
        } else {
            try {
                Node firstPoint = first;
                Node secondPoint = first;

                for (int i = 1; i < value; i++) {
                    secondPoint = secondPoint.next;
                };

                while (secondPoint.next != null) {
                    firstPoint = firstPoint.next;
                    secondPoint = secondPoint.next;
                }

                System.out.println("If \"K\" = " + value + " the element will be: " + firstPoint.value);
            } catch (NullPointerException e) {
                System.out.println("\"K\" is out of range");
            }
        }


    }


    // Displaying the elements
    public void display() {
        System.out.println("Linked List values:");

        Node current = first;

        if (current == null) {
            System.out.println("None");
        } else {
            System.out.println(current.value);
            while (current.next != null) {
                current = current.next;
                System.out.println(current.value);
            }
        }
    }
};