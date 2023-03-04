package Graph;

import java.util.Scanner;

public class GraphMatrix {
    int vertices;
    int[][] matrix;
    public GraphMatrix(int vertices){
        this.vertices=vertices;
        this.matrix=new int[vertices][vertices];
    }
    public  void addEdge(int src,int dist){
        matrix[src][dist]=1;
        matrix[dist][src]=1;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of vertices: ");
        int v=scan.nextInt();
        GraphMatrix object=new GraphMatrix(4);
        object.addEdge(0,2);
        object.addEdge(1,2);
        object.addEdge(1,3);
        object.addEdge(2,0);
        object.addEdge(2,1);
        object.addEdge(2,3);
        object.addEdge(3,1);
        object.addEdge(3,2);
        System.out.println("Adjacency Matrix is:");
        for(int i=0;i<v;i++){
            for(int j=0;j<v;j++){
                System.out.print(object.matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
