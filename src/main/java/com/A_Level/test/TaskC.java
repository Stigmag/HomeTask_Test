package com.A_Level.test;



import java.util.ArrayList;


public class TaskC {
    public ArrayList<Integer> newArray(ArrayList<Integer> arr, int number) {

        ArrayList<Integer> newArr = new ArrayList<Integer>();
        for (Integer i : arr) {
            if (i % number == 0)

                newArr.add(i);
        }

        return newArr;
    }
}

