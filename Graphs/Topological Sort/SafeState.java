import java.util.*;

class Solution {
    public static List<Integer> eventualSafeNodes(int V, List<List<Integer>> graph) {
        List<List<Integer>> adjRev = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adjRev.add(new ArrayList<>());
        }

        int[] indegree = new int[V];
        for (int i = 0; i < V; i++) {
            for (int it : graph.get(i)) {
                adjRev.get(it).add(i);
                indegree[i]++;
            }
        }

        Queue<Integer> q = new ArrayDeque<>(); // faster than LinkedList
        List<Integer> safenodes = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            if (indegree[i] == 0) q.add(i);
        }

        while (!q.isEmpty()) {
            int node = q.poll();
            safenodes.add(node);

            for (int it : adjRev.get(node)) {
                indegree[it]--;
                if (indegree[it] == 0) q.add(it);
            }
        }

        Collections.sort(safenodes);
        return safenodes;
    }

    public static void main(String[] args) {
        int V = 12;
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        adj.get(0).add(1);
        adj.get(1).add(2);
        adj.get(2).add(3);
        adj.get(2).add(4);
        adj.get(3).add(4);
        adj.get(3).add(5);
        adj.get(4).add(6);
        adj.get(5).add(6);
        adj.get(6).add(7);
        adj.get(8).add(1);
        adj.get(8).add(9);
        adj.get(9).add(10);
        adj.get(10).add(8);
        adj.get(11).add(9);

        List<Integer> safenodes = eventualSafeNodes(V, adj);

        System.out.println("Safe Nodes:");
        for (int node : safenodes) {
            System.out.print(node + " ");
        }
        System.out.println();
    }
}
