package com.psy888;

import org.junit.runner.manipulation.Sortable;

import java.util.Arrays;

public class Util {
    public <T> T[] sort(T[] arr){
        //quick sort
        Arrays.sort(arr);

        return arr;
    }
    //reload for primitives
    public <T> int[] sort(int[] arr){
        //quick sort
//        Arrays.sort(arr);

        return arr;
    }
    // byte, short, long ...
}
