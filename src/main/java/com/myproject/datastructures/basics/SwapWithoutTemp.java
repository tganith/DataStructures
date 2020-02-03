package com.myproject.datastructures.basics;

public class SwapWithoutTemp {

    public static void main(String args[]) {

        // method1
        int x = 10;
        int y = 20;

        x= x+y;
        y= x-y;
        x= x-y;

        System.out.println(x +" and "+y);

        // method2

        int a = 10;
        int b = 20;

        a = a*b;
        b = a/b;
        a = a/b;
        System.out.println(a +" and "+b);

    }

}

