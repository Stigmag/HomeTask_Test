package com.A_Level.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TaskATest {

    private TaskA taskAInstance;
    @Before
    public void before()
    {
        System.out.println("Before running...");
        taskAInstance = new TaskA();

    }



    @Test
    public void arrayMin() {
        int[] mas={1,6,8,-3,5,6,-23};
int result= taskAInstance.ArrayMin(mas);
        assertEquals( -23, result);
    }

    @Test
    public void arrayMin2() {
        int[] mas={-973747,0,0,0,0,-473,0};
        int result= taskAInstance.ArrayMin(mas);
        assertEquals( -973747, result);


    }

    @Test
    public void arrayMax() {
        int[] mas={1,6,8,-3,5,6,-23};
        int result= taskAInstance.ArrayMax(mas);
        assertEquals( 8,result);
    }

    @Test
    public void arrayMax2() {
        int[] mas={6,-0,9,0,0,0,0};
        int result= taskAInstance.ArrayMax(mas);
        assertEquals( 9,result);
    }
}