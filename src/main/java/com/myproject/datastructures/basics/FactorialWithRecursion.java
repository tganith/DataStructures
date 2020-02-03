package com.myproject.datastructures.basics;

public class FactorialWithRecursion {

    public static void main (String[] args) {

        int n = 5;
        System.out.println(factorial(n));
    }

    private static int factorial(int n) {
        if(n == 1){
            return 1;
        }
        return factorial(n-1)*n;
    }
}


