package com.learndsfinal.dsalgo.queue;

import java.util.Arrays;

public class MaxPriorityQueue {
    //Max heap = Complete binary tree with parent greater than children
    //Opposite for maximum
    //Max Prioroty queue represented by arranging all the elements in a heap array inorder tranversal and element in the list at the index 1 is maximum.
    private int heap[];
    private int n;
    public MaxPriorityQueue(int c) {
        this.heap  = new int[c+1];
        this.n=0;
    }
    public boolean isEmpty() {
        return n==0;
    }
    public int size() {
        return n;
    }
    public void insert(int value) {
        if(n == heap.length-1)
        {
            System.out.println("Max heap full or resize the heap array by 2 * n. Resizing it");
            resize(2*this.heap.length);
        }
        n++;
        heap[n]=value;
        swim(n);
    }
    private void resize(int capacity) {
        int a[]=new int[capacity];
        for (int i = 0; i < heap.length; i++) {
            a[i]=heap[i];
        }
        this.heap=a;
    }
    // Use swim for MAX heap
    private void swim(int k) {
        while (k > 1 && this.heap[k/2] < this.heap[k]) {
            int temp=this.heap[n/2];
            this.heap[n/2]=this.heap[n];
            this.heap[n]=temp;
            k/=2;
        }
    }
    public static void main(String[] args) {
        MaxPriorityQueue maxPriorityQueue=new MaxPriorityQueue(3);
        maxPriorityQueue.insert(4);
        maxPriorityQueue.insert(5);
        maxPriorityQueue.insert(6);
        maxPriorityQueue.insert(1);
        maxPriorityQueue.insert(3);
        System.out.println(Arrays.toString(maxPriorityQueue.heap));
    }
}
