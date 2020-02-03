package com.myproject.datastructures.arrays;

public class Largest3Numbers {


    public static void main(String args[]) {
        int[] arr = {100, 20, 50, 90,40,70,60};
        int top1 = 0;
        int top2 = 0;
        int top3 = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i] > top1) {
                top3 = top2;
                top2 = top1;
                top1 = arr[i];
            } else if(arr[i]>top2) {
                top3 = top2;
                top2 =  arr[i];
            } else if(arr[i]>top3){
                top3 = arr[i];
            }
        }

        System.out.println(top1+" "+top2+" "+top3);
    }
}
