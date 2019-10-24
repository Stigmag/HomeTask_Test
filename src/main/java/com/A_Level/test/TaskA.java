package com.A_Level.test;

public class TaskA {


    public int ArrayMin(int[] arr)
    {
        int min=9379279;

        for(int i=0; i<arr.length;i++)
        {
            if(min>arr[i])
                min=arr[i];

        }
        return min;
    }

    public int ArrayMax(int[] arr)
    {

        int max=-83685;
        for(int i=0; i<arr.length;i++)
        {

            if(max<arr[i])
                max=arr[i];
        }
        return max;
    }
}
