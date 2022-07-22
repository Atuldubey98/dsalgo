/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learndsfinal.dsalgo.binaryTree;

import com.learndsfinal.dsalgo.queue.Queue;
import com.learndsfinal.dsalgo.stack.Stack;

/**
 *
 * @author atul
 */
public class BinaryTree {
    private TreeNode root;
    private class TreeNode{
        private int data;
        private TreeNode left;
        private TreeNode right;
        public TreeNode(int data)
        {
            this.data=data;
        }
    }
    public void createBinaryTree()
    {
        TreeNode nine = new TreeNode(9);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        nine.left=second;
        second.left=fourth;
        nine.right=third;
        this.root=nine;
    }
    public void preOrderTraversal(TreeNode root)
    {
        // First root
        // Second left
        // Third right
        if(root == null)
            return;
        System.out.print(root.data + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
    public void iterativePreOrder()
    {
        if(this.root==null)
            return;
        Stack<TreeNode> stack = new Stack<>();
        System.out.println();
        System.out.println("Iterative Pre Order : ");
        // Pushed right first because of LIFO DS
        stack.push(root);
        while(!stack.isEmpty())
        {
            TreeNode current = stack.pop();
            System.out.println(current.data);
            if(current.right != null)
                stack.push(current.right);
            if(current.left != null)
                stack.push(current.left);
           
        }
    }
    public void recursiveInorder(TreeNode root)
    {
        if (root == null) {
            return ;
        }
        recursiveInorder(root.left);
        System.out.print(root.data + " ");
        recursiveInorder(root.right);
    }
    public void iterativeInOrder()
    {
        if(root == null)
        {
            System.out.println("The binary tree not found");
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp=root;
        while(!stack.isEmpty() || temp !=null)
        {
            if(temp != null)
            {
                stack.push(temp);
                temp=temp.left;
            }else{
                temp=stack.pop();
                System.out.print(temp.data + " ");
                temp=temp.right;
            }
        }
    }
    public void recursivePostorder(TreeNode root)
    {
        if (root == null) {
            return ;
        }
        recursiveInorder(root.left);
        recursiveInorder(root.right);
        System.out.print(root.data + " ");
    }
    public void iterativePostOrder()
    {
        if(this.root==null)
            return;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current=root;
        //First left
        //Second right
        //Third root
        while(current != null || !stack.isEmpty())
        {
            if(current != null)
            {
                stack.push(current);
                current=current.left;
            }else{
                TreeNode temp = stack.peek().right;
                if(temp == null)
                {
                    temp = stack.pop();
                    System.out.print(temp.data + " ");
                    while(!stack.isEmpty() && stack.peek().right == temp)
                    {
                        temp = stack.pop();
                        System.out.print(temp.data + " ");
                    }
                }else{
                    current=temp;
                }
            }
        }
    }
    public void levelOrderTraversal()
    {
        if(root==null)
            return;
        Queue<TreeNode> q=new Queue<>();
        q.enqueue(root);
        while(!q.isEmpty())
        {
            TreeNode temp = q.dequeue();
            System.out.print(temp.data + " ");
            if(temp.left != null) q.enqueue(temp.left);
            if(temp.right != null) q.enqueue(temp.right);
        }
    }
    public int getMax(TreeNode root)
    {
        if(root==null)
            return Integer.MIN_VALUE;
        int result = root.data;
        int left = getMax(root.left);
        int right = getMax(root.right);
        if(left > result)
            result=left;
        if(right > result)
            result = right;
        return result;
    }
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.createBinaryTree();
        System.out.println(binaryTree.getMax(binaryTree.root));
    }
}
