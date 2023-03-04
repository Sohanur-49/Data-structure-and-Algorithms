package Graph;

import java.util.ArrayList;
import java.util.Scanner;

public class DFS {
    static class Edge{
        int src,dest;
        public Edge(int src,int dest){
            this.src=src;
            this.dest=dest;
        }
    }
    public static void createGraph(ArrayList<Edge> [] graph){
        for(int i=0;i< graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(0,4));
        graph[0].add(new Edge(0,3));
        graph[1].add(new Edge(2,0));
        graph[2].add(new Edge(4,0));
        graph[2].add(new Edge(4,3));
        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,1));
        graph[4].add(new Edge(1,3));
    }
    public static void dfs(ArrayList<Edge>[] graph,int curr,boolean visited[]){
        if(visited[curr]){
            return;
        }
        System.out.print(curr+" ");
        visited[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            dfs(graph,e.dest,visited);
        }
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of vertices: ");
        int v=scan.nextInt();
        ArrayList<Edge> [] graph=new ArrayList[v];
        createGraph(graph);
        dfs(graph,0,new boolean[v]);
    }
}
