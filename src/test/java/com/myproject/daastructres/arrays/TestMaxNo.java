package com.myproject.daastructres.arrays;

import com.myproject.datastructures.arrays.MaxNo;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestMaxNo {

/*    @BeforeEach
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
    }*/


    @Test
    @RepeatedTest(1)
    void calcualteTest(){
        int[] arr = {10,20,30,40,50};
        assertEquals(50, MaxNo.calculation(arr));
    }

    @Test
     void addTest(){
        assertEquals(30, MaxNo.add(10,20));
        assertThrows(Exception.class,()->Integer.parseInt("one"));
    }

    @Test
    public void testThrowsException(){

        Throwable assertThrows= assertThrows(NullPointerException.class,()->{
            throw new NullPointerException("myexception");
        });

        assertEquals("myexception",assertThrows.getMessage());


    }
}
