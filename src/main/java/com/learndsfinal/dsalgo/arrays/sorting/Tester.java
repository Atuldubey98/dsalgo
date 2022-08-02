package com.learndsfinal.dsalgo.arrays.sorting;

import java.util.Arrays;

public class Tester {
    public static void printArray(int a[]) {
        System.out.println(Arrays.toString(a));
    }
    public static void main(String[] args) {
        int a[]= {0,1,2,1,0,1,2,0,2,1};
        DutchNationalFlagProblem dProblem=new DutchNationalFlagProblem();
        dProblem.sort(a);
        printArray(a);
    }
}
