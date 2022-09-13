/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learndsfinal.dsalgo.recurssion;

/**
 *
 * @author atul
 */
public class LinearSearch {
    public static void main(String[] args) {
        int index = linearSearch(new int[]{1,5,6,8,5,7,87,7},87 , 0);
        System.out.println(index);
    }
    static int linearSearch(int arr[], int target, int i)
    {
        if(i==arr.length)
            return -1;
        if(target==arr[i])
            return i;
        return linearSearch(arr, target, i+1);
    }
}
