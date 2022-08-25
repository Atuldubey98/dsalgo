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
    public int[][] getGraph() {
        return graph;
    }
    private int E;
    private int V;
    public int getV() {
        return V;
    }
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
    
}
