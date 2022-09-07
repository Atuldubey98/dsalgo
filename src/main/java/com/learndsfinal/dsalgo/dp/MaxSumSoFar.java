/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learndsfinal.dsalgo.dp;

/**
 *
 * @author atul
 */
public class MaxSumSoFar {
    // Kadane's Algorithm
    public static int maxSumSoFar(int nums[])
    {
        if(nums==null || nums.length == 0)
            return 0;
        int maxSum=Integer.MIN_VALUE;
        int currentMax = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int num=nums[i];
            int tempMax = currentMax+num;
            if(tempMax < num)
                currentMax = num;
            else
                currentMax+= num;
            maxSum=Math.max(currentMax, maxSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        System.out.println(maxSumSoFar(new int[]{4,3,-2,6,-12,7,-1,6}));
    }
}
