/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learndsfinal.dsalgo.arrays;

import java.util.Arrays;

/**
 *
 * @author atul
 */
public class ArraysImplementation {
    private int[] arr;
    private int length;
    public ArraysImplementation(int length)
    {
        this.arr=new int[length];
        this.length=length;
    }
    public void setArray(int pass[])
    {
        if (this.length > pass.length) {
            return;
        }
        for(int i=0;i<pass.length;i++)
        {
            this.arr[i]=pass[i];
        }
    }
    public int [] getAllWithoutEvenNumber()
    {
        int oddCount=0;
        for(int i=0;i<arr.length;i++)
        {
            oddCount+=this.arr[i]%2 != 0 ? 1 : 0;
        }
        int odds[]=new int[oddCount];
        int j = 0;
        for(int i=0;i<this.length;i++)
        {
            if(this.arr[i] % 2 != 0)
                odds[j++]=this.arr[i];
        }
        return odds;
    }
    public int secondMax()
    {
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        for(int i=0;i<length;i++)
        {
            if(this.arr[i] > max)
            {
          
                secMax=max;
                max = this.arr[i];
            }else if(this.arr[i] > secMax && this.arr[i] != max)
            {
                secMax=this.arr[i];
            }
        }
        return secMax;
    }
    public void display(int a[])
    {
        System.out.print(Arrays.toString(a));
    }
    public int[] moveZerotoEnd()
    {
        int temp[]=new int [length];
        int j = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(this.arr[i] !=0)
                temp[j++]=this.arr[i];
        }
        for(int i=j;i<temp.length;i++)
        {
            temp[i]=0;
        }
        return temp;
    }
    public static void main(String[] args) {
        ArraysImplementation array = new ArraysImplementation(5);
        int pass[]={0,5,6, 0 , 8};
        array.setArray(pass);
        array.display(array.moveZerotoEnd());
    }
}
