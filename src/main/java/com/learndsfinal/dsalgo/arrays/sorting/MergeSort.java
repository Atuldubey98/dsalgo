package com.learndsfinal.dsalgo.arrays.sorting;

public class MergeSort {
    public int[] mergeSortedArray(int a[], int b[], int low, int high) {
        int result[] = new int[a.length + b.length];
        int k = 0;
        int i = 0;
        int j = 0;
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                result[k++] = a[i++];
            } else {
                result[k++] = b[j++];
            }
        }
        while (i < a.length) {
            result[k++] = a[i++];
        }
        while (j < b.length) {
            result[k++] = b[j++];
        }
        return result;
    }
    public void merge(int a[], int temp[], int low, int mid, int high) {
        for (int i = low; i <= high; i++) {
            temp[i]=a[i];
        }
        int i=low;
        int j=mid+1;
        int k=low;
        while (i<mid && j<=high) {
            if (temp[i] < temp[j]) {
                a[k++]=temp[i++];
            }else{
                a[k++]=temp[j++];
            }
        }
        while (i<mid) {
            a[k++]=temp[i++];
        }
        while (j<=high) {
            a[k++]=temp[j++];
        }
    }
    // Divide and conquer problem
    // We divide the array and merge the array
    public void sort(int a[], int[] temp, int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;
            sort(a, temp, low, mid);
            sort(a, temp, mid + 1, high);
            merge(a, temp, low, mid, high);
        }
    }
}
