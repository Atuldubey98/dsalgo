/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learndsfinal.dsalgo.graph;

import java.util.Arrays;

/**
 *
 * @author atul
 */
public class GraphMatrix {
    private int[][] graph;
    private int E;
    private int V;
    public GraphMatrix(int nodes)
    {
        this.V=nodes;
        graph = new int[nodes][nodes];
    }
    public void addEdge(int u, int v)
    {
        graph[u][v]=1;
        graph[v][u]=1;
        this.E++;
    }
    public void display()
    {
        for(int a[] : graph)
            System.out.println(Arrays.toString(a));
    }
    public static void main(String[] args) {
        GraphMatrix graph = new GraphMatrix(4);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 1);
        graph.addEdge(3, 2);
        graph.display();
    }
}
