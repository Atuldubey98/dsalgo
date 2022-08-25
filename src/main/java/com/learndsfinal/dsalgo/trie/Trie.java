package com.learndsfinal.dsalgo.trie;

public class Trie {
    private TrieNode root;
    public TrieNode getRoot() {
        return root;
    }
    public void setRoot(TrieNode root) {
        this.root = root;
    }
    public Trie()
    {
        this.root=new TrieNode();
    }
    public int getIndex(char c) {
        return c - 'a';
    }
    public void insert(String word)
    {
        if (word.length() <= 0) {
            return;
        }
        TrieNode current = root;
        word = word.toLowerCase();
        for (char c : word.toCharArray()) {
            int index = getIndex(c);
            if (current.getChildrens()[index] == null) {
                TrieNode node = new TrieNode();
                current.getChildrens()[index]=node;
                current=node;
            }else{
                current = current.getChildrens()[index];
            }
        }
        current.setWord(true);
    }
    public boolean search(String word) {
        if (word == null || word.length() == 0) {
            return false;
        }
        TrieNode current = root;
        word=word.toLowerCase();
        for (char c : word.toCharArray()) {
            int index = this.getIndex(c);
            if (current.getChildrens()[index] == null) {
                return false;
            }
            current=current.getChildrens()[index];
        }
        return current.getIsWord();
    }
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("Hello");
        trie.insert("Hell");
        trie.insert("fuck");
    }
}
