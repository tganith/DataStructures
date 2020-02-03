package com.myproject.datastructures.basics;

public class InputStringNumberOrNot {

    public static void main(String[] args) {

        String num = "12345a";
        boolean isNumber = NumberOrNot(num);

        if(isNumber) {
            System.out.println("its number");
        } else {
            System.out.println("not a number");
        }

    }

    private static boolean NumberOrNot(String num) {
        try{
            Integer.parseInt(num);
        } catch(NumberFormatException ex){
            return false;
        }
        return true;
    }
}
