/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learndsfinal.dsalgo.queue;

/**
 *
 * @author atul
 */
public class Queue<T> {
    private ListNode front;
    private ListNode rear;
    private int length;
    public int length()
    {
        return this.length;
    }
    private class ListNode{
        private ListNode next;
        private T data;
        public ListNode(T data){
            this.data=data;
        }
        
    }
    public Queue(){
        this.front=null;
        this.rear=null;
    }
    public boolean isEmpty()
    {
        return this.front==null;
    }
    public void enqueue(T data)
    {
        ListNode newNode = new ListNode(data);
        if(this.isEmpty())
        {
            front=newNode;
        }else{
            rear.next=newNode;
        }
        rear=newNode;
        this.length++;
    }
    public T dequeue()
    {
        if(this.isEmpty())
        {
            return null;
        }
        ListNode temp=front;
        front = front.next;
        if (front==null) {
            rear=null;
        }
        temp.next=null;
        length--;
        return temp.data;
    }
    public void print()
    {
        if(this.isEmpty())
            return;
        ListNode current=front;
        while(current!=null)
        {
            System.out.print(current.data + "---");
            current=current.next;
        }
        System.out.println("null");
    }
    
    public static void main(String[] args) {
        Queue<Integer> q = new Queue<>();
        q.enqueue(5);        
        q.enqueue(9);
        q.enqueue(6);
        q.enqueue(7);
        q.enqueue(8);
        q.print();
      
        q.print();
    }
}
