package com.learndsfinal.dsalgo.arrays.sorting;

import java.util.Arrays;

public class Tester {
    public static void printArray(int a[]) {
        System.out.println(Arrays.toString(a));
    }
    public static void main(String[] args) {
        int a[]= {-1,2};
        RearrangeMaxMinForm rearrangeMaxMinForm=new RearrangeMaxMinForm();
        printArray(rearrangeMaxMinForm.solution(a));
    }
}
