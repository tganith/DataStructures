package com.myproject.daastructres.arrays;

import com.myproject.datastructures.arrays.MaxNo;
import com.myproject.datastructures.arrays.MinMaxNo;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMaxNo {

    @BeforeEach
    public void beforeEach(){
        System.out.println("before each method executed");
    }

    @AfterEach
    public void afterEach(){
        System.out.println("after each method executed");
    }

    @BeforeAll
    public static void beforeAll(){
        System.out.println("before all method executed");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("after all method executed");
    }


    @Test
    @RepeatedTest(2)
    @Disabled
    void calcualteTest(){
        int[] arr = {10,20,30,40,50};
        assertEquals(50, MaxNo.calculation(arr));
        System.out.println("executed");
    }

    @Test
    void addTest(){
        assertEquals(30, MaxNo.add(10,20));
        System.out.println("sum executed");
    }
}
