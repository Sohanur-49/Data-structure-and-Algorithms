package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS {
    static class Edge{
        int src;
        int dest;
        public Edge(int src,int dest){
            this.src=src;
            this.dest=dest;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        graph[1].add(new Edge(1,0));
        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,2));
    }
    public static void bfs(ArrayList<Edge> graph[],int v){
        Queue<Integer> q=new LinkedList <>();
        boolean visited[]=new boolean[v];
        q.add(0);
        while(!q.isEmpty()) {
            int curr = q.remove();
            if (!visited[curr]) {
                System.out.print(curr + " ");
                visited[curr] = true;

                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter number of vertices: ");
        int v=scan.nextInt();
        ArrayList<Edge> graph[]=new ArrayList[v];
        createGraph(graph);
            /*for(int j=0;j<graph[j].size();j++){
                Edge e=graph[0].get(j);
                System.out.print(e.dest+" ");

        }*/
        bfs(graph,v);

    }
}
