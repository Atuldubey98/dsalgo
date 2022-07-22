/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learndsfinal.dsalgo.linkedlists;

/**
 *
 * @author atul
 */
public class DoublyLinkedList {
    private ListNode head;
    private ListNode tail;
    private int length;
    
    public DoublyLinkedList()
    {
        this.head=null;
        this.tail=null;
        this.length=0;
    }
    public int length()
    {
        return this.length;
    }
    public boolean isEmpty()
    {
        return head==null;
    }
    private class ListNode{
        private int data;
        private ListNode previous;
        private ListNode next;
        
        public ListNode(int data)
        {
            this.data=data;
            previous=null;
            next=null;
        }
    }
    public void display()
    {
        ListNode current=head;
        while(current!=null)
        {
            System.out.print(current.data + " => ");
            current=current.next;
        }
        System.out.println("null");
    }
    public void displayBackward()
    {
        ListNode current=tail;
        while(current!=null)
        {
            System.out.print(current.data + " => ");
            current=current.previous;
        }
        System.out.println("null");
    }
    public void insertAtStart(int data)
    {
        ListNode newNode = new ListNode(data);
        if (this.isEmpty()) {
            tail=newNode;
        }else{
            head.previous=newNode;
        }
        newNode.next=head;
        head=newNode;
    }
    public void insertAtLast(int data)
    {
        ListNode newNode = new ListNode(data);
        if (this.isEmpty()) {
            head=newNode;
        }else{
            tail.next=newNode;
            newNode.previous=tail;
        }
        tail=newNode;
    }
    public ListNode deletFirst()
    {
        if(this.isEmpty())
        {
            System.out.println("List is empty");
            return null;
        }
        ListNode temp=head;
        if (head == tail) {
            tail=null;
        }else{
            head.next.previous=null;
        }
        head=head.next;
        temp.next=null;
        return temp;
    }
    public ListNode deleteLast()
    {
        if (this.isEmpty()) {
            System.out.print("The list is empty");
            return  null;
        }
        ListNode temp=tail;
        if (head == tail) {
            head=null;
        }else{
            tail.previous.next=null;    
        }
        tail=tail.previous;
        temp.previous=null;
        return temp;
    }
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertAtLast(1);

        dll.deleteLast();
        dll.display();
        dll.displayBackward();
    }
}
