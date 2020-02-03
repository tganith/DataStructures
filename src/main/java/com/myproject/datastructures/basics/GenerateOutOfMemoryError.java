package com.myproject.datastructures.basics;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class GenerateOutOfMemoryError {

    public static void main (String[] args) {

        Map<Integer,String> map = new HashMap<>();
        Random random = new Random();
        System.out.println(random.nextInt());
        int count = 0;
        try {
            while (true) {

                map.put(random.nextInt(), "random value");
                count++;
            }
        }catch (Throwable th) {
            System.out.println(count);
            System.out.println(th.getMessage());
            th.printStackTrace();
        }

    }
}
