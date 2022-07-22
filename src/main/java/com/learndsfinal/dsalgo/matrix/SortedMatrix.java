package com.learndsfinal.dsalgo.matrix;

public class SortedMatrix {
    public static void search(int matrix[][], int x) {
        int i = 0;
        int j = matrix.length-1;
        while (i < matrix.length && j >= 0) {
            if (matrix[i][i] == x) {
                System.out.println("The element found at " + i + " " + j);
                return;
            }
            if (matrix[i][j] > x) {
                j--;
            }else{
                i++;
            }
        }
    }
    public void spiralPrint(int matrix[][], int r, int c) {
        int i,l=0,k=0;
        while (k < r && l < c) {
            for (i = l; i < c; i++) {
                System.out.print(matrix[k][i] + " ");
            }
            k++;
            for(i=k;i<r;i++)
            {
                System.out.print(matrix[i][c-1] + " ");
            }
            c--;
            if (k < r) {
                for(i=c-1;i>=1;i--)
                {

                }
            }
        }
    }
    public static void main(String[] args) {
        int matrix [][]={
            {10,20,30,40,50},
            {60,70,80,90,100},
            {60,70,80,90,100},
            {60,70,80,90,100},
            {60,70,80,90,100},
        };
        new SortedMatrix().spiralPrint(matrix, matrix.length, matrix.length);   
    }
}
