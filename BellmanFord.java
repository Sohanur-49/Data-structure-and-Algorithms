package Graph;

import java.util.ArrayList;
import java.util.Scanner;

public class BellmanFord {
    static class Edge{
        int src,dest,weight;
        public Edge(int src,int dest,int weight){
            this.src=src;
            this.dest=dest;
            this.weight=weight;
        }
    }
    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
            graph[0].add(new Edge(0,1,2));
            graph[0].add(new  Edge(0,2,4));
            graph[1].add(new Edge(1,2,-4));
            graph[2].add(new  Edge(2,3,2));
            graph[3].add(new Edge(3,4,4));
            graph[4].add(new  Edge(4,1,-1));
    }
    public static void bellmanFord(ArrayList<Edge>[] graph,int src){
        int[] distance=new int[graph.length];
        for(int i=0;i<distance.length;i++){
            if(i!=src){
                distance[i]=Integer.MAX_VALUE;
            }
        }
        for(int i=0;i< graph.length-1;i++){
            for(int j=0;j< graph.length;j++){
                for(int k=0;k<graph[j].size();k++){
                    Edge e=graph[j].get(k);
                    int u=e.src;
                    int v=e.dest;
                    if(distance[u]!=Integer.MAX_VALUE && (distance[u]+e.weight)<distance[v]){
                        distance[v]=distance[u]+e.weight;
                    }
                }
            }
        }
        for(int i=0;i<distance.length;i++){
            System.out.print(distance[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        //number of vertices is 5.
        System.out.print("Enter the number of vertices: ");
        int v=scan.nextInt();
        ArrayList<Edge>[] graph=new ArrayList[v];
        createGraph(graph);
        bellmanFord(graph,0);
    }
}
