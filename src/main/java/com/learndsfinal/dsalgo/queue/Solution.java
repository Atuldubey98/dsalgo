/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learndsfinal.dsalgo.queue;

/**
 *
 * @author atul
 */
public class Solution {
    public static String[] generateBinNum(int n)
    {
        Queue<String> q = new Queue<>();
        String[] res=new String[n];
        q.enqueue("1");
        for(int i=0;i<n;i++)
        {
            res[i]=q.dequeue();
            String n1 = res[i]+"0";
            String n2=res[i]+"1";
            q.enqueue(n1);
            q.enqueue(n2);
        }
        return res;
    }
    public static void main(String[] args) {
        for(String bin: generateBinNum(6))
        {
            System.out.println(bin);
        }
    }
}
