package com.learndsfinal.dsalgo.trie;

public class TrieNode {
    private TrieNode [] childrens;
    public TrieNode[] getChildrens() {
        return childrens;
    }
    public void setChildrens(TrieNode[] childrens) {
        this.childrens = childrens;
    }
    private boolean isWord;
    public boolean getIsWord() {
        return isWord;
    }
    public void setWord(boolean isWord) {
        this.isWord = isWord;
    }
    public TrieNode()
    {
        this.childrens=new TrieNode[26];
        this.isWord=false;
    }
}
