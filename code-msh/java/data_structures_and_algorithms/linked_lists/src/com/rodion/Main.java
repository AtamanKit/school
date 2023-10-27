/**
 * An algorithm that will create a Linked List
 * and make manipulation with it
 */
package com.rodion;


public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.addFirst(100);
        linkedList.addFirst(200);
        linkedList.addFirst(300);
        linkedList.addLast(400);
        linkedList.addLast(500);
        linkedList.addFirst(600);

        linkedList.display();

        System.out.println();

        linkedList.kthValue(0);

        // linkedList.reverse();

        // linkedList.display();

        // System.out.println();

        // linkedList.toArray();

        // System.out.println();
        
        // linkedList.contains(1000);

        // System.out.println();

        // linkedList.deleteFirst();

        // System.out.println();

        // linkedList.display();

        // System.out.println();

        // linkedList.deleteLast();

        // System.out.println();

        // linkedList.display();
    }
}
