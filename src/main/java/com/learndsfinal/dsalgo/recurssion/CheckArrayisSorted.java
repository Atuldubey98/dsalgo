/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learndsfinal.dsalgo.recurssion;

/**
 *
 * @author atul
 */
public class CheckArrayisSorted {
    // Find if array is sorted
    public static void main(String[] args) {
        boolean check = check(new int []{1,2,4,4,4,2}, 0);
        System.out.println(check);
    }
    private static boolean check(int arr[], int i)
    {
        if(i+1 == arr.length)
            return true;
        return arr[i] <= arr[i+1] && check(arr, i+1);
    }
}
