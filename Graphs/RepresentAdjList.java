package Graphs;

import java.util.*;

class Graph {
    int V;
    ArrayList<ArrayList<Integer>> adj;

    // Constructor
    Graph(int V) {
        this.V = V;
        adj = new ArrayList<>();

        // Initialize adjacency list
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
    }

    // Add edge (Directed Graph)
    void addEdge(int u, int v) {
        adj.get(u).add(v);
          adj.get(v).add(u);
    }

    // Print adjacency list
    void printGraph() {
        System.out.println("\nAdjacency List:");
        for (int i = 0; i < V; i++) {
            System.out.print(i + " -> ");
            for (int node : adj.get(i)) {
                System.out.print(node + " ");
            }
            System.out.println();
        }
    }
}

public class RepresentAdjList  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input vertices and edges
        System.out.print("Enter number of vertices: ");
        int V = sc.nextInt();

        System.out.print("Enter number of edges: ");
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











// // weighted graph 


// static class Pair {
//     int node, weight;
//     Pair(int n, int w) {
//         node = n;
//         weight = w;
//     }
// }

// ArrayList<ArrayList<Pair>> adj;


// adj.get(u).add(new Pair(v, w));




// to print weighted graph

//   void printGraph() {
//         System.out.println("\nWeighted Adjacency List:");
//         for (int i = 0; i < V; i++) {
//             System.out.print(i + " -> ");
//             for (Pair p : adj.get(i)) {
//                 System.out.print("(" + p.node + ", " + p.weight + ") ");
//             }
//             System.out.println();
//         }
//     }