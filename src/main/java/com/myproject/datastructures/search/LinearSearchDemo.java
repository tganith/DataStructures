package com.myproject.datastructures.search;

public class LinearSearchDemo {

    public static void main(String args[]) {

        int[] list = {10,70,60,40,30,20,80};
        int searchElement =  8;
        boolean isElementFound = false;

        for(int i=0;i<list.length;i++) {
            if(list[i] == searchElement) {
                   System.out.println("search element exist in "+i+ "th index");
                   isElementFound = true;
                   break;
            }
        }

        if(!isElementFound){
            System.out.println("search element not found");
        }

    }
}
