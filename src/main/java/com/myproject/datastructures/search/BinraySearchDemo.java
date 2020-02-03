package com.myproject.datastructures.search;

public class BinraySearchDemo {

    public static void main(String args[]) {

        int[] list = {10,20,30,40,50,60,70,80,90};

        int n = list.length;
        int low = 0;
        int high = n -1;
        boolean isFound = false;
        int key = 900;
        int mid = -1;


        while(low <= high) {
            mid = (low+high)/2;
            if(key == list[mid]){
                System.out.println("element found on "+mid+"th index");
                isFound = true;
                break;
            } else if(list[mid] < key){
                low = mid + 1;
            } else if(list[mid]>key){
                high = mid - 1;
            }
        }

        if(!isFound){
            System.out.println("element not found");
        }

    }
}
