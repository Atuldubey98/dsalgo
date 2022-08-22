/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learndsfinal.dsalgo.graph;

import java.util.LinkedList;

/**
 *
 * @author atul
 */
public class GraphLinkedList {
    private LinkedList<Integer> [] graph;
    private int V;
    private int E;
    public GraphLinkedList(int nodes)
    {
        this.graph = new LinkedList[nodes];
        for (int i = 0; i < graph.length; i++) {
            graph[i]=new LinkedList<>();
        }
        this.V=nodes;
        this.E=0;
    }
    public void addEdge(int u, int v)
    {
        this.graph[u].add(v);
        this.graph[v].add(u);
        this.E++;
    }
    @Override
    public String toString()
    {
        StringBuilder sb=new StringBuilder();
        sb.append("Vertices " + this.V + " Edges " + this.E + "\n");
        for(int i=0;i<V;i++)
        {
            sb.append(i).append(" : ");
            for(int val : this.graph[i])
                sb.append(val + " ");
            sb.append("\n");
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        GraphLinkedList graphLinkedList=new GraphLinkedList(4);
        graphLinkedList.addEdge(0, 1);
        graphLinkedList.addEdge(1, 2);
        graphLinkedList.addEdge(2, 3);
        System.out.println(graphLinkedList);
    }
}
