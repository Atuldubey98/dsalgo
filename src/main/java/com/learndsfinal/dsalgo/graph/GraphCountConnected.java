package com.learndsfinal.dsalgo.graph;

public class GraphCountConnected extends GraphMatrix{
    private boolean visited[];
    private int compId[];
    public GraphCountConnected(int nodes) {
        super(nodes);
        this.compId=new int[nodes];
        this.visited= new boolean[nodes];
    }
    private int getNumberOfConnections() {
        int count=0;
        for (int v = 0; v < super.getV(); v++) {
            if (!visited[v]) {
                dfs(v, count);
                count++;
            }
        }
        return count;
    }
    private void dfs(int v, int count) {
        visited[v]=true;
        compId[v]=count;
        for(int w:this.getGraph()[v])
        {
            if (!visited[w]) {
                dfs(w, count);
            }
        }
    }
    public static void main(String[] args) {
        GraphCountConnected graph = new GraphCountConnected(4);
        graph.addEdge(0, 1);
        graph.addEdge(0, 0);
        graph.addEdge(0, 3);
        graph.addEdge(2, 4);
        graph.display();
        System.out.println(graph.getNumberOfConnections());
    }
}
