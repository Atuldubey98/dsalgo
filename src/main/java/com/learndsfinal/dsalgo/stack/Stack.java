/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learndsfinal.dsalgo.stack;

/**
 *
 * @author atul
 */
public class Stack<T> {
    private ListNode top;
    private int length;
    private class ListNode{
        private T data;
        private ListNode next;
        public ListNode(T data)
        {
            this.data=data;
        }
    }
    public Stack()
    {
        this.top=null;
        this.length= 0;
    }
    public int length()
    {
        return this.length;
    }
    public boolean isEmpty()
    {
        return this.top == null;
    }
    public void push(T data)
    {
        ListNode newNode = new ListNode(data);
        newNode.next=top;
        top=newNode;
        length++;
    }
    public T pop()
    {
        if(this.isEmpty())
        {
            System.out.println("The stack is empty");
            return null;
        }
        ListNode temp = this.top;
        top=top.next;
        length--;
        return temp.data;
    }
    public T peek()
    {
        return this.isEmpty() ? null : this.top.data;
    }
   
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5); 
        stack.push(4);
        stack.push(6);
        
        stack.pop();
        stack.peek();
    }
}
