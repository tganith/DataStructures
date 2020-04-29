package com.myproject.datastructures.practice.search;

public class LinearSearch {

    public static void main(String args[]) {

        int[] arr = {10,20,50,30,70};

        int search = 1;

        boolean b = false;

        for(int x:arr){
            if(x == search){
                b = true;
            }
        }

        if(b){
            System.out.println("element found");
        } else {
            System.out.println("Elment not found");
        }
    }
}
