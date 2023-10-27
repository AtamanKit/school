package com.rodion;

/**
 * Class of creating arrays and making
 * possible of exclude and insert elements
 */
public class Array {
    // Defining "numbers" array and size of it
    private int size;
    private int[] numbers;
    private boolean successRemoved=true;

    // Cunstructor, first we will create an empty array
    public Array() {
        size = 0;
        numbers = new int[size];
    };

    // Inserting elements into array
    public void insert(int item) {
        size++;
        int[] newNumbers = new int[size];
        System.arraycopy(numbers, 0, newNumbers, 0, size -1);
        newNumbers[size - 1] = item;
        numbers = newNumbers;
    };

    // Removing elements from array
    public void remove(int index){
        try {
            int[] newNumbers = new int[size - 1];
            for (int i = 0; i < index; i++) {
                    newNumbers[i] = numbers[i];
            };

            for (int i = index; i < newNumbers.length; i++) {
                newNumbers[i] = numbers[i + 1];
            };

            numbers = newNumbers;
            size--;
        } catch (Exception e) {
            successRemoved = false;
            System.out.println("Index out of range");
        }
    }

    // Visualizing the array
    public void visualize() {
        if (successRemoved) {
            System.out.print("[");
            for (int i = 0; i < size; i++) {
                System.out.print(numbers[i]);
                if (i != size - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }
}