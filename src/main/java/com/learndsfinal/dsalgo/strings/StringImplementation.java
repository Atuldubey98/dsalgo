/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learndsfinal.dsalgo.strings;
import com.learndsfinal.dsalgo.stack.Stack;
/**
 *
 * @author atul
 */
public class StringImplementation {
    private String s;
    public StringImplementation(String s)
    {
        this.s=s;
    }
    public int len()
    {
        return s.length();
    }
    public String reverse()
    {
        Stack<String> stack = new Stack<>();
        for(char c : s.toCharArray())
        {
            stack.push(String.valueOf(c));
        }
        String ans = "";
        while(!stack.isEmpty())
        {
            ans=ans.concat(stack.pop());
        }
        return ans;
    }
    public boolean checkPalindrome()
    {
        int i = 0;
        int j = this.len()-1;
        while(i < j)
        {
            if(s.charAt(i) != s.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        StringImplementation stringImplementation = new StringImplementation("fjgjh");
        System.out.println(stringImplementation.reverse());
    }
}
