package com.company;

public class Main {

    public static void main(String[] args) {
        int[] numberArray;

        numberArray = new int[10];

        // assign a value to each array element
        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = i;
        }

        // print a value from each array element
        for (int i = 0; i < numberArray.length; i++) {
            System.out.print(numberArray[i] + " ");
        }
        System.out.println();
    }
}
