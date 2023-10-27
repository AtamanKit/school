<<<<<<< HEAD
package com.rodion;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
=======
/**
 * An algorithm that will convert
 * an array in stack by defining
 * .push(), .pop(), .peek(), .isEmpty()
 * methods
 */
package com.rodion;


public class Main {
    public static void main(String[] args) {
        ArrayToStack array = new ArrayToStack();

        array.push(2);
        array.push(3);
        // array.push(4);
        // array.push(5);
        // array.push(6);

        array.display();

        array.pop();

        array.display();

        int peek = array.peek();
        System.out.println(peek);

        boolean empty = array.isEmpty();
        System.out.println(empty);
>>>>>>> 580978dfd53925a7ef826eaf814e4a9f688092d7
    }
}