package com.learndsfinal.dsalgo.arrays.sorting;

public class BubbleSort {
    public void sort(int a[]) {
        boolean swapped=false;
        for (int i = 0; i < a.length-1; i++) {
            swapped=false;
            for (int j = 0; j < a.length-1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    swapped=true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
