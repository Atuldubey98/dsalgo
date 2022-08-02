package com.learndsfinal.dsalgo.arrays.sorting;

public class SquresofSortedArray {
    public int[] solution(int a[]) {
        int[] result=new int[a.length];
        int i=0;
        int j=a.length-1;
        for (int k = result.length-1; k >= 0; k--) {
            if (Math.abs(a[i]) < Math.abs(a[j])) {
                result[k]=a[j]*a[j];
                j--;
            }else{
                result[k]=a[i]*a[i];
                i++;
            }
        }
        return result;
    }
}
