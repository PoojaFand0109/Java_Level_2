package com.level_2;

import java.util.Arrays;

public class ArrayReverse {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5}; // Replace with your desired elements

        System.out.println("Original Array: " + Arrays.toString(array));

        // Finding the reverse of the array
        int length = array.length;
        for (int i = 0; i < length / 2; i++) {
            int temp = array[i];
            array[i] = array[length - 1 - i];
            array[length - 1 - i] = temp;
        }

        System.out.println("Reversed Array: " + Arrays.toString(array));
    }
}
