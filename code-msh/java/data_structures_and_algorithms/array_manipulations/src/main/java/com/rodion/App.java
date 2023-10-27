package com.rodion;

/**
 * Hello world!
 *
 */

import java.util.Random;

public class App 
{
    public static void main( String[] args )
    {
        Array array = new Array();
        
        Random random = new Random();

        // Creating an array with random values
        for (int i = 0; i < 10; i++) {
            array.insert(random.nextInt(100));
        }
        // Visualizing array until removing an element
        array.visualize();

        // Removing an element with index as arg in remove method
        array.remove(30);

        // Visualizing array after removing an element
        array.visualize();
    }
}
