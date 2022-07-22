/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learndsfinal.dsalgo.linkedlists;

/**
 *
 * @author atul
 */

/**
 * SinglyLinkedList
 */
public class SinglyLinkedList {

    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public int length() {
        int count = 0;
        if (head == null) {
            return 0;
        }
        ListNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public void insertFirst(ListNode newNode) {
        newNode.next = head;
        head = newNode;
    }

    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + "=>");
            current = current.next;
        }
        System.out.print("null");
    }

    public void insertEnd(ListNode newNode) {
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public ListNode deleteFirst() {
        if (head == null) {
            System.out.println("No elements in the list");
            return null;

        }
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    public ListNode deleteLast() {
        if (head == null || head.next == null) {
            System.out.println("No elements in the list");
            return null;
        }
        ListNode current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        ListNode temp = current.next;
        current.next = null;
        return temp;
    }

    public ListNode delete(int position) {
        if (head == null || position < 0) {
            System.out.println("The list is empty");
            return null;
        }
        if (position == 1) {
            ListNode temp = this.deleteFirst();
            return temp;
        }
        ListNode current = head;
        while (position-- > 0) {
            if (position == 1) {
                ListNode temp = current.next;
                current.next = current.next.next;
                temp.next = null;
                return temp;
            }
            current = current.next;
        }
        return null;
    }

    public int search(int key) {
        int index = 0;
        ListNode current = head;
        while (current != null) {
            if (key == current.data) {
                return index;
            }
            current = current.next;
            index++;
        }
        return index;
    }

    public void insert(ListNode newNode, int position) {
        if (head == null) {
            System.out.println("No list has been created !");
            return;
        }

        if (position == 1) {
            this.insertFirst(newNode);
            return;
        }
        ListNode current = head;
        while (position-- > 0) {
            if (position == 1) {
                // checks the previous node and attaches the node in between
                newNode.next = current.next;
                current.next = newNode;
                return;
            }

            current = current.next;
        }
    }

    public ListNode reverseLinkedList() {
        if (head == null) {
            System.out.println("The liked list is empty");
            return null;
        }
        ListNode previous = null;
        ListNode current = head;
        ListNode next = null;

        // The nodes from left will start to break and start making there own linked
        // list
        // 7->8->9->null
        // 7<-8-<9<-null
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    public ListNode getMiddleNode() {
        ListNode slowPtr = head;// Moves one at a time
        ListNode fastPtr = head;// Moves two at a time
        while (fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        // When loop ends slow will be pointing to the middle node
        return slowPtr;
    }

    public void displayByHead(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + "=>");
            current = current.next;
        }
    }

    // get nth node from end of linked list
    public ListNode getNthNodeFromLast(int n) {
        if (head == null) {
            System.out.println("The list is empty !");
            return null;
        }
        if (n <= 0) {
            System.out.println("Illegal argument exception");
            return null;
        }
        ListNode mainPtr = head;
        ListNode refPtr = head;
        int count = 0;
        while (count < n) {
            refPtr = refPtr.next;
            count++;
        }
        while (refPtr != null) {
            refPtr = refPtr.next;
            mainPtr = mainPtr.next;
        }
        return mainPtr;
    }

    // Remove duplocates from a sorted ll
    public void removeDuplicates() {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }

    public ListNode insertInSortedOrder(ListNode newNode) {
        ListNode current = head;
        ListNode temp = null;
        while (current != null && current.data < newNode.data) {
            temp = current;
            current = current.next;
        }
        newNode.next = current;
        temp.next = newNode;
        return head;
    }

    public void removeByKey(int key) {
        ListNode current = head;
        ListNode temp = null;
        if (current != null && current.data == key) {
            head = current.next;
            return;
        }
        while (current != null && current.data != key) {
            temp = current;
            current = current.next;
        }
        if (current != null) {
            temp.next = current.next;
        }
    }

    public boolean detectLoop() {
        if (head == null) {
            return false;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    public ListNode getLoopStart() {
        ListNode fast = head;
        ListNode slow = head;
        if (head == null) {
            return null;
        }
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return getFirstNode(slow);
            }
        }
        return null;
    }

    private SinglyLinkedList.ListNode getFirstNode(ListNode slow) {
        ListNode current = head;
        while (slow != current) {
            slow = slow.next;
            current = current.next;
        }
        return current;
    }

    public void removeLoopsIfAny() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                removeLoop(slow);
                return;
            }
        }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;
        int carry = 0;
        while(l1 != null || l2!= null)
        {
            int a = l1 != null ? l1.data : 0;
            int b = l2 != null ? l2.data : 0;
            int sum = carry + a + b;
            carry = sum/10;
            tail.next=new ListNode(sum%10);
            if (l1 != null) {
                l1 = l1.next;
            }
            if(l2 != null)
            {
                l2 = l2.next;
            }
            tail = tail.next;
        }
        return dummy.next;
    }
    private void removeLoop(SinglyLinkedList.ListNode slow) {
        if (slow == null) {
            return;
        }
        ListNode current = head;
        while (slow.next != current.next) {
            slow = slow.next;
            current = current.next;
        }
        slow.next = null;
    }
    
    public ListNode mergeSortedLinkedList(ListNode a, ListNode b)
    {
        ListNode temp = new ListNode(0);
        ListNode tail = temp;
        
        while(a != null && b != null)
        {
            if (a.data <= b.data) {
                tail.next=a;
                a = a.next;
            }else{
                tail.next = b;
                b=b.next;
            }
            tail = tail.next;
        }
        if (a == null) {
            tail.next = b;
        }else{
            tail.next=a;
        }
        
        return temp.next;
    }
    public ListNode mergeKLists(ListNode[] lists)
    {
        if (lists == null || lists.length <= 0) {
            return null;
        }
        int interval = 1;
        while(interval < lists.length)
        {
            for(int i=0; i +interval < lists.length ; i = i+interval * 2)
            {
                lists[i] = this.mergeSortedLinkedList(lists[i], lists[i+interval]);
            }
            interval*=2;
        }
        return lists[0];
    }
    public ListNode swapPairs() {
        ListNode dummy_head = new ListNode(0);
        dummy_head.next = head;
        ListNode pointer = dummy_head;
        while (pointer.next != null) {
            ListNode b = pointer.next;
            ListNode c = pointer.next.next;
			// if only one node left, stop swaping and return result
            if (c == null) {
                return dummy_head.next;
            }
            pointer.next = c;
            ListNode cNext = c.next;
            c.next = b;
            b.next = cNext;
                            // set the pointer to node b (for the first node in the next swapping  set)
            pointer = b;
        } 
        return dummy_head.next;
    }
   
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertFirst(new ListNode(4));
        list.insertFirst(new ListNode(3));
        list.insertFirst(new ListNode(2));
        list.insertFirst(new ListNode(1));
        list.swapPairs();
    }
}