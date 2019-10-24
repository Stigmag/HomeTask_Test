package com.A_Level.test;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TaskBTest {

    private TaskB taskBInstance;
    @Before
    public void before()
    {
        System.out.println("Before running...");
        taskBInstance = new TaskB();

    }

    @Test
    public void sortArray() {
        int[] arr={1,6,8,-3,5,6,-23};
        int[] result= taskBInstance.SortArray(arr);
        int[] arr1={-23,-3,1,5,6,6,8};
        assertArrayEquals(arr1,result);
    }
    @Test
        public void sortArray1() {
            int[] arr={0,-8,8,0,5,0,-7};
            int[] result= taskBInstance.SortArray(arr);
            int[] arr1={-8,-7,0,0,0,5,8};
            assertArrayEquals(arr1,result);

    }
    @Test
    public void sortArray2() {
        int[] arr={12,793,-683,0,7};
        int[] result= taskBInstance.SortArray(arr);
        int[] arr1={-683,0,7,12,793};
        assertArrayEquals(arr1,result);
}
}