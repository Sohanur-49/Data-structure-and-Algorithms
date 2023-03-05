package Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

//Dijkstra's Algorithm is use for find the sort path in a graph.
/*Pseudocode:
1. First create a graph.
2.for create graph create Edge(src,dest)
3. Create pair(nodes and weight)
4. Create dijkstraAlgorithm method.
5.Call dijkstra method in main method.
*/
public class DijkstrasAlgorithm {
    static class Edge{
        int src,dest,weight;
        public Edge(int src,int dest,int weight){
            this.src=src;
            this.dest=dest;
            this.weight=weight;
        }
    }
    public static void createGraph(ArrayList<Edge>[] graph){
        for(int i=0;i< graph.length;i++) {
            graph[i] = new ArrayList<>();
        }
            graph[0].add(new Edge(0, 1, 2));
            graph[0].add(new Edge(0, 2, 4));
            graph[1].add(new Edge(1, 3, 7));
            graph[1].add(new Edge(1, 2, 1));
            graph[2].add(new Edge(2, 4, 3));
            graph[3].add(new Edge(3, 5, 1));
            graph[4].add(new Edge(4, 3, 2));
            graph[4].add(new Edge(4, 5, 5));
    }
    public static class Pair implements Comparable<Pair>{
        int node;
        int distance;
        public Pair(int node,int distance){
            this.node=node;
            this.distance=distance;
        }
        public int compareTo(Pair p2){
            return this.distance-p2.distance;
        }
    }
    public static void dijkstraAlgorithm(ArrayList<Edge>[] graph,int src){
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        int[] distance=new int[graph.length];
        boolean[] visited=new boolean[graph.length];
        for(int i=0;i<distance.length;i++){
            if(i!=src){
                distance[i]=Integer.MAX_VALUE;
            }
        }
        pq.add(new Pair(src,0));
        while(!pq.isEmpty()){
            Pair current=pq.remove();
            if(!visited[current.node]){
                visited[current.node]=true;

                for(int i=0;i<graph[current.node].size();i++){
                    Edge e=graph[current.node].get(i);
                    int u=e.src;
                    int v=e.dest;
                    if(!visited[v] && (distance[u]+e.weight)<distance[v]){
                        distance[v]=distance[u]+e.weight;
                        pq.add(new Pair(v,distance[v]));
                    }
                }
            }
        }
        System.out.println(Arrays.toString(distance));
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        //The number of vertices is 6.
        System.out.print("Enter the number of vertices: ");
        int v=scan.nextInt();
        ArrayList<Edge>[] graph=new ArrayList[v];
        createGraph(graph);
        dijkstraAlgorithm(graph,0);
    }
}
