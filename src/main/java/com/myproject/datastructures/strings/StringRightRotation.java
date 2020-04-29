package com.myproject.datastructures.strings;

public class StringRightRotation {

    public static void main(String args[]) {

        String str1 = "abcde";
        String str2 = "deabc";

        boolean b = isStrExist(str1,str2);
        if(b){
            System.out.println("string is exist");
        } else{
            System.out.println("string not exist");
        }
    }

    public static boolean isStrExist(String str1,String str2){
        boolean b = false;

        char[]  ch = str1.toCharArray();

        for(int i = 0;i<str1.length();i++){
            char temp = ch[str1.length()-1];

            for(int j = str1.length()-1;j>0;j--){
                ch[j] = ch[j-1];
            }

            ch[0] = temp;

            if(str2.equals(String.valueOf(ch))){
                b = true;
                break;
            }
        }

        return b;
    }


}
