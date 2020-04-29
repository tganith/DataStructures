package com.myproject.datastructures.search;

public class BinraySearchDemo {


    // Elements should be sorting order
    // Time complexity is O(logn)

    public static void main(String args[]) {

        int[] arr = {10,20,30,40,50,60,70,80,90};

        int n = arr.length;
        int lb = 0;
        int ub = n -1;

        boolean isFound = false;

        int key = 100;
        int mid = 0;


        while(lb <= ub) {
            mid = (lb+ub)/2;
            if(key == arr[mid]){
                System.out.println("element found on "+mid+"th index");
                isFound = true;
                break;
            } else if(arr[mid] < key){
                lb = mid + 1;
            } else if(arr[mid]>key){
                ub = mid - 1;
            }
        }

        if(!isFound){
            System.out.println("element not found");
        }

    }
}
