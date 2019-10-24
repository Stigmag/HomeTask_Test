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
}