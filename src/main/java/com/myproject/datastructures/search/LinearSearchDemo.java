package com.myproject.datastructures.search;

public class LinearSearchDemo {


    // Time Complexity for Linear Search - O(n) time

    public static void main(String args[]) {

        int[] list = {10,70,60,40,30,20,80};
        int searchElement =  80;
        boolean isElementFound = false;

        for(int i=0;i<list.length;i++) {
            if(list[i] == searchElement) {
                   System.out.println("search element found in "+i+ "th index");
                   isElementFound = true;
                   break;
            }
        }

        if(!isElementFound){
            System.out.println("search element not found");
        }

    }
}
