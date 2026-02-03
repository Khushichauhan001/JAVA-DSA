package Graphs;

import java.util.*;

 class Graph {

    int V ;
    int[][] adjMatrix ;

    Graph(int V){
        this.V= V;
        adjMatrix = new int[V][V];
    }
    
    // for directed graph
    void addEdge(int u,int v ){
    adjMatrix[u][v] = 1 ;
    }

    // for undirected graph 
    void addEdge1(int u, int v) {
    adjMatrix[u][v] = 1;
    adjMatrix[v][u] = 1;
}

 
// for weighted graph 
void addEdge2(int u, int v, int w) {
    adjMatrix[u][v] = w;
}


    void printGraph(){
        System.out.println("Adjacency Matrix: ");
        for(int i=0;i<V ;i++){
            for(int j=0;j<V ;j++){
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public  class ReprestAdjMatrix
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of vertices: ");
        int V = sc.nextInt();
        System.out.println("Enter number of edges: ");
        int E = sc.nextInt();
        Graph g = new Graph(V);

          System.out.println("Enter edges (u v):");
        for (int i = 0; i < E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            g.addEdge(u, v);
        }
          g.printGraph();
        sc.close();
    }
}
