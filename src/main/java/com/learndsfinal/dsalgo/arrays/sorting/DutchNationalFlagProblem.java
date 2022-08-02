package com.learndsfinal.dsalgo.arrays.sorting;

public class DutchNationalFlagProblem {
    // Sort array with 0s, 1s, 2s
    // three pointers and i,j,k
    // i starting
    // j starting , k at last
    public void sort(int a[]) {
        int i = 0;
        int j = 0;
        int k = a.length-1;
        while (i <= k) {
            if (a[i]==0) {
                swap(a, i, j);
                i++;
                j++;
            }
            else if (a[i]==1) {
                i++;
            }else{
                swap(a, i, k);
                k--;
            }
        }   
    }

    public void swap(int a[], int i, int index) {
        int temp = a[i];
        a[i] = a[index];
        a[index] = temp;
    }
}
