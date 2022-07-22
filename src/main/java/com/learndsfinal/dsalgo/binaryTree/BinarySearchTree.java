package com.learndsfinal.dsalgo.binaryTree;

public class BinarySearchTree {
    // Left values < root
    // Right values > root
    // The main root element should be greater than all the nodes on left and less
    // than right
    private TreeNode root;

    private class TreeNode {
        private int data;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public void insert(int data) {
        root = insert(root, data);
    }

    public TreeNode insert(TreeNode root, int data) {
        if (root == null) {
            root = new TreeNode(data);
            return root;
        }
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }
        return root;
    }

    public void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public TreeNode search(int key) {
        return searchByKey(root, key);
    }

    public TreeNode searchByKey(TreeNode root, int key) {
        if (root.data == key || root == null) {
            return root;
        }
        return key < root.data ? searchByKey(root.left, key) : searchByKey(root.right, key);
    }

    public boolean isValidBST(TreeNode root, long min, long max) {
        if (root == null) {
            return true;
        }
        if (root.data < min || root.data > max) {
            return false;
        }
        boolean left = isValidBST(root.left, min, root.data);
        if (left) {
            boolean right = isValidBST(root.right, root.data, max);
            return right;
        }
        return false;
    }

    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(1);
        binarySearchTree.insert(2);
        binarySearchTree.insert(6);
        binarySearchTree.insert(1);
        binarySearchTree.inOrder(binarySearchTree.root);
        System.out.println(binarySearchTree.search(1));
    }
}
