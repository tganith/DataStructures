package com.myproject.datastructures.arrays;

public class SecondHighest {

    public static void main (String[] args) {

        int[] arr = {13, 4, 1, 2, 5, 6, 9, 100};
        int largest = 0;
        int secondLargest = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("largest value is " + largest);
        System.out.println("second largest value is " + secondLargest);
    }
}
