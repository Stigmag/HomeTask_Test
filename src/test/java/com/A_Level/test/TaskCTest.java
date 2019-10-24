package com.A_Level.test;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TaskCTest {

    private TaskC taskCInstance;
    @Before
    public void before()
    {
        System.out.println("Before running...");
        taskCInstance = new TaskC();

    }
    @Test
    public void newArray() {
        ArrayList<Integer> arr= new ArrayList<Integer> ();
            arr.add(1);
            arr.add(5);
            arr.add(9);
            arr.add(-23);
        int number=5;
        ArrayList<Integer>  result= taskCInstance.newArray(arr,number);
        ArrayList<Integer>  arr1=new ArrayList<Integer> ();
        arr1.add(5);
        assertArrayEquals(arr1.toArray(),result.toArray());
    }
}