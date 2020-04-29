package com.myproject.datastructures.practice.search;

public class BinarySearch {

    public static void main(String args[]) {

        int[] arr = {10,20,30,50,70};

        int search = 500;
        boolean b = false;

        int lb = 0;
        int ub = arr.length -1;

        while(lb<=ub){
            int mid = (lb+ub)/2;

            if(arr[mid] == search){
                b = true;
                break;
            } else if(arr[mid] <search) {
                lb = mid+1;
            } else {
                ub = mid - 1;
            }
        }

        if(b){
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }
    }
}
