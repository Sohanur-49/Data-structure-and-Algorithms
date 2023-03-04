package Graph;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class TopologicalSort {
    static class Edge{
        int src,dest;
        public Edge(int src,int dest){
            this.src=src;
            this.dest=dest;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[],int v){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,1));
        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));
        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));
    }
    public static void topoSortUtil(ArrayList<Edge>[] graph, int curr, boolean[] visited, Stack<Integer> stack){
        visited[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!visited[e.dest]){
                topoSortUtil(graph,e.dest,visited,stack);
            }
        }
        stack.push(curr);
    }
    public static void topoSort(ArrayList<Edge>[] graph){
        boolean visited[]=new boolean[graph.length];
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<graph.length;i++){
            if(!visited[i]){
                topoSortUtil(graph,i,visited,stack);
            }
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter number of vertices: ");
        int v=scan.nextInt();
        ArrayList<Edge> graph[]=new ArrayList[v];
        createGraph(graph,v);
        topoSort(graph);
    }
}
