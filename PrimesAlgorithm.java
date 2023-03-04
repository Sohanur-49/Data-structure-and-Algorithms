package Graph;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class PrimesAlgorithm {
    public static class Edge{
        int src,dest,weight;
        public Edge(int src,int dest,int weight){
            this.src=src;
            this.dest=dest;
            this.weight=weight;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0,1,10));
        graph[0].add(new Edge(0,2,15));
        graph[0].add(new Edge(0,3,30));
        graph[1].add(new Edge(1,0,10));
        graph[1].add(new Edge(1,3,40));
        graph[2].add(new Edge(2,0,15));
        graph[2].add(new Edge(2,3,50));
        graph[3].add(new Edge(3,0,30));
        graph[3].add(new Edge(3,1,40));
        graph[3].add(new Edge(3,2,50));
    }
    public static class Pair implements Comparable<Pair>{
        int node,weight;
        public Pair(int node,int weight){
            this.node=node;
            this.weight=weight;
        }
        public int compareTo(Pair p2){
            return this.weight-p2.weight;
        }
    }
    public static void primsAlgorithms(ArrayList<Edge> graph[]){
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        boolean visited[]=new boolean[graph.length];
        pq.add(new Pair(0,0));
        int mstCost=0;
        while(!pq.isEmpty()){
            Pair current= pq.remove();
            if(!visited[current.node]){
            visited[current.node]=true;
            mstCost=mstCost+ current.weight;
            for(int i=0;i<graph[current.node].size();i++) {
                Edge e = graph[current.node].get(i);
                if (!visited[e.dest]) {
                    pq.add(new Pair(e.dest, e.weight));
                }
             }
            }
        }
        System.out.println("Minimum weight is: "+mstCost);
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number of vertices: ");
        int v=scan.nextInt();
        ArrayList<Edge> graph[]=new ArrayList[v];
        createGraph(graph);
        primsAlgorithms(graph);

    }
}
