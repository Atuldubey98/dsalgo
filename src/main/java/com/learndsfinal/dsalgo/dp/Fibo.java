package com.learndsfinal.dsalgo.dp;

public class Fibo{
    // this is bottom up approach
    public static int fibo(int n)
    {
    	int table[]=new int[n+1];
    	table[0]=0;
            
    	table[1]=1;
    	for(int i=2;i<n;i++)
    	{
    	    table[i]=table[i-1]+table[i-2];
    	}
    	return table[n];
    }
    // this is top down approach
    public static int fibo(int memo[], int n)
    {
        if(memo[n] == 0)
        {
            if(n < 2)
            {
                memo[n]=n;
            }else{
                int left = fibo(memo, n-1);
                int right= fibo(memo, n-2);
                memo[n]=left+right;
            }
        }
        return  memo[n];
    }
    public static void main(String args[])
    {
        System.out.println(fibo(5));
        int memo[]=new int[6];
        System.out.println(fibo(memo, 5));
    }
}
