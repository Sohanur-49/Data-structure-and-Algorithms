package Graph;

import java.util.ArrayList;
import java.util.Scanner;

public class GraphList {
    static class Edge{
        int src,dist;
        public Edge(int src,int dist){
            this.src=src;
            this.dist=dist;
        }
    }
    public static void createGraph(ArrayList<Edge>[]graph){
        for(int i=0;i< graph.length;i++){
            graph[i]= new ArrayList<>();
        }
        graph[0].add(new Edge(0,2));
        graph[1].add(new Edge(1,2));
        graph[1].add(new Edge(1,3));
        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,2));
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter The number of vertices: ");
        int v=scan.nextInt();
        ArrayList<Edge>[] graph =new ArrayList[v];
        createGraph(graph);
        for(int i=0;i<v;i++) {
            for (int j = 0; j < graph[i].size(); j++) {
                Edge e = graph[i].get(j);
                System.out.print(e.dist + " ");
            }
            System.out.println();
        }
    }
}
