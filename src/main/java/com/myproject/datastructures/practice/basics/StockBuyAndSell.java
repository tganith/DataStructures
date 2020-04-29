package com.myproject.datastructures.practice.basics;

public class StockBuyAndSell {


    public static void main(String args[]){

        int[] arr = {100, 180, 260, 310, 40, 535, 695};


        int max = 0;

        for(int i = 1;i<arr.length;i++){
            int j = i-1;
            while(j>=0 && arr[i]>arr[j]){
                int diff = arr[i] - arr[j];
                if(diff > max){
                    max = diff;
                }
                j--;
            }
        }

        System.out.println(max);


    }

}
