/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learndsfinal.dsalgo.hashtable;

/**
 *
 * @author atul
 */
public class HashTable {
    private HashNode[] buckets;
    private int noOfBuckets;//capacity
    private int size;
    public HashTable()
    {
        this(10);
    }
    public HashTable(int capacity)
    {
        this.noOfBuckets=capacity;
        this.buckets=new HashNode[capacity];
    }

    private int getBucketIndex(Integer key) {
         // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
         return key%noOfBuckets;
    }
    private class HashNode{
        private Integer key;
        private String value;
        private HashNode next;
        public HashNode(Integer key, String value)
        {
            this.key=key;
            this.value=value;
        }
    }
    public int size()
    {
        return this.size;
    }
    public boolean isEmpty()
    {
        return this.size==0;
    }
    public void put(Integer key, String value)
    {
        // At bucketIndex newNode is placed and head at that index is attached to next of that node
        if (key == null || value == null) {
            throw new IllegalArgumentException("Either key or value is null");
        }
        int bucketIndex = getBucketIndex(key);
        HashNode head = this.buckets[bucketIndex];
        while(head != null)
        {
            if (head.key.equals(key)) {
                head.value=value;
                return;
            }
            head=head.next;
        }
        size++;
        head = this.buckets[bucketIndex];
        HashNode newNode = new HashNode(key, value);
        newNode.next=head;
        this.buckets[bucketIndex]=newNode;
    }
    public String get(Integer key)
    {
        if (key == null) {
            throw new IllegalArgumentException("Key is null enter a key");
        }
        int bucketIndex = getBucketIndex(key);
        HashNode head = this.buckets[bucketIndex];
        while (head != null) {            
            if (head.key.equals(key)) {
                return head.value;
            }
            head=head.next;
        }
        return null;
    }
    public String remove(Integer key)
    {
        if (key == null) {
            throw new IllegalArgumentException("Key is null");
        }
        int bucketIndex = getBucketIndex(key);
        HashNode head = this.buckets[bucketIndex];
        HashNode prev = null;
        
        while(head != null)
        {
            if (head.key.equals(key)) {
                break;
            }
            prev=head;
            head=head.next;
        }
        if (head == null) {
            return null;
        }
        size--;
        if (prev != null) {
            prev.next=head.next;
        }else{
            this.buckets[bucketIndex]=head.next;
        }
        return head.value;
    }
    public static void main(String[] args) {
        HashTable hashTable = new HashTable(10);
        hashTable.put(105, "Tom");
        hashTable.put(21, "Sana");
        hashTable.put(55, "Hello");
        System.out.println(hashTable.size());
    }
}
