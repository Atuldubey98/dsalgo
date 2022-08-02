package com.learndsfinal.dsalgo.arrays.sorting;

public class RearrangeMaxMinForm {
    public int[] solution(int a[]) {
        if (a.length == 1) {
            return a;
        }
        int i=0;
        int k=0;
        int j=a.length-1;

        int[] result=new int [a.length];
        while (i<j) {
            result[k++]=a[j--];
            result[k++]=a[i++];
        }
        if (k < a.length) {
            result[k++]=a[j];
        }
        return result;
    }
}
