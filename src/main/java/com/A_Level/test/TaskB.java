package com.A_Level.test;


public class TaskB {
    public int[] SortArray(int [] arr)
    { int temp;
    boolean checkSort=false;

       while(!checkSort)
       {
           checkSort=true;
           for (int i = 0; i < arr.length-1; i++) {

               if (arr[i] > arr[i+1]) {
                   checkSort=false;
                   temp = arr[i];
                   arr[i] = arr[i+1];
                   arr[i+1] = temp;

               }

           }
       }

        return arr;

    }
}
