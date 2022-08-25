/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learndsfinal.dsalgo.graph;

import java.util.LinkedList;

import com.learndsfinal.dsalgo.queue.Queue;
import com.learndsfinal.dsalgo.stack.Stack;

/**
 *
 * @author atul
 */
public class GraphLinkedList {
    private LinkedList<Integer>[] graph;
    private int V;
    private int E;

    public GraphLinkedList(int nodes) {
        this.graph = new LinkedList[nodes];
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new LinkedList<>();
        }
        this.V = nodes;
        this.E = 0;
    }

    public void addEdge(int u, int v) {
        this.graph[u].add(v);
        this.graph[v].add(u);
        this.E++;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vertices " + this.V + " Edges " + this.E + "\n");
        for (int i = 0; i < V; i++) {
            sb.append(i).append(" : ");
            for (int val : this.graph[i])
                sb.append(val + " ");
            sb.append("\n");
        }
        return sb.toString();
    }

    public void bfs(int source) {
        boolean visited[] = new boolean[V];
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(source);
        visited[source] = true;
        while (!queue.isEmpty()) {
            int u = queue.dequeue();
            System.out.print(u + " === ");
            for (int links : this.graph[u]) {
                if (!visited[links]) {
                    queue.enqueue(links);
                    visited[links] = true;
                }
            }
        }
    }

    public void dfs(int source) {
        boolean visited[] = new boolean[V];
        Stack<Integer> stack = new Stack<>();
        stack.push(source);
        while (!stack.isEmpty()) {
            int u = stack.pop();
            if (!visited[u]) {

                visited[u] = true;
                System.out.print(u + "===");

                for (int ele : this.graph[u]) {
                    if (!visited[ele]) {
                        stack.push(ele);
                    }
                }
            }
        }
    }
    public void dfs() {
        boolean[]visited=new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                dfs(i, visited);
            }
        }
    }
    private void dfs(int i, boolean[] visited) {
        visited[i]=true;
        System.out.println(i + " ");
        for (int w : this.graph[i]) {
            dfs(w, visited);
        }
    }

    public static void main(String[] args) {
        GraphLinkedList graphLinkedList = new GraphLinkedList(5);
        graphLinkedList.addEdge(0, 1);
        graphLinkedList.addEdge(1, 2);
        graphLinkedList.addEdge(2, 3);
        graphLinkedList.addEdge(3, 0);
        graphLinkedList.addEdge(2, 4);
        System.out.println(graphLinkedList);
        graphLinkedList.dfs(0);
    }
}
