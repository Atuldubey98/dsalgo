/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learndsfinal.dsalgo.linkedlists;

/**
 *
 * @author atul
 */
public class CircularSinglyLinkedList {
    private ListNode last;
    private int length;
    private class ListNode
    {
        private int data;
        private ListNode next;
        public ListNode(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public CircularSinglyLinkedList()
    {
        this.last=null;
        this.length=0;
    }
    public int length()
    {
        return this.length;
    }
    public boolean isEmpty()
    {
        return length==0;
    }
    public void createCirularList()
    {
        ListNode first=new ListNode(1);        
        ListNode five=new ListNode(5);
        ListNode ten=new ListNode(10);
        ListNode fifteen=new ListNode(15);
        first.next=five;
        five.next=ten;
        ten.next=fifteen;
        fifteen.next=first;
        this.last=fifteen;
    }
    public void display()
    {
        ListNode first=this.last.next;
        while(first != last)
        {
            System.out.println(first.data);
            first=first.next;
        }
        System.out.print(first.data);
    }
    public static void main(String[] args) {
        CircularSinglyLinkedList cll=new CircularSinglyLinkedList();
        cll.createCirularList();
        cll.display();
    }
}
