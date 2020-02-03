package com.myproject.datastructures.strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindStringLengthWithoutLengthMethod {

    public static void main(String args[]) {
        String str = "easiest";

        char[] c = str.toCharArray();

        int count = 0;
        for(char n:c){
            ++count;
        }
        System.out.println("string count is "+count);

    }

}
