/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learndsfinal.dsalgo.recurssion;

/**
 *
 * @author atul
 */
public class BinarySearch {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int target = 5;
        int search = search(arr, target, 0, arr.length - 1);
        System.out.println(search);
    }

    static int search(int arr[], int target, int start, int end) {
        if (start >= end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (target == arr[mid]) {
            return mid;
        }
        if (target < arr[mid]) {
            return search(arr, target, start, mid - 1);
        }
        return search(arr, target, mid + 1, end);
    }
}
