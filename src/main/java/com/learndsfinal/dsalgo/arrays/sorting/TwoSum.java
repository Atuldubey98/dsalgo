/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learndsfinal.dsalgo.arrays.sorting;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
/**
 *
 * @author atul
 */
public class TwoSum {
    public static int[] twoSumQ(int nums[], int k)
    {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
            map.put(nums[i],i);
        for(int i=0;i<nums.length;i++)
        {
            int num = k-nums[i];
            if(map.containsKey(num))
                return new int[]{i, map.get(num)};
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSumQ(new int[]{2,7,11,15}, 9)));
    }
}
