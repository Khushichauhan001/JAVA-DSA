import java.util.*;
public class AlienDictionary {
    
    public String findOrder(String[] words) {
        int n = words.length;
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 26; i++) adj.add(new ArrayList<>());

        for (int i = 0; i < n - 1; i++) {
            String s1 = words[i];
            String s2 = words[i + 1];
            if (s1.length() > s2.length() && s1.startsWith(s2)) return "";
            int len = Math.min(s1.length(), s2.length());
            for (int j = 0; j < len; j++) {
                if (s1.charAt(j) != s2.charAt(j)) {
                    adj.get(s1.charAt(j) - 'a').add(s2.charAt(j) - 'a');
                    break;
                }
            }
        }

        List<Integer> topo = topoSort(adj, 26);
        StringBuilder ans = new StringBuilder();
        boolean[] present = new boolean[26];
        for (String w : words)
            for (char c : w.toCharArray())
                present[c - 'a'] = true;

        for (int it : topo)
            if (present[it]) ans.append((char) (it + 'a'));

        if (ans.length() == 0) return "";
        int countPresent = 0;
        for (boolean b : present) if (b) countPresent++;
        if (ans.length() < countPresent) return "";
        return ans.toString();
    }

    private List<Integer> topoSort(List<List<Integer>> adj, int V) {
        int[] indegree = new int[V];
        for (int i = 0; i < V; i++)
            for (int it : adj.get(i))
                indegree[it]++;

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < V; i++)
            if (indegree[i] == 0)
                q.add(i);

        List<Integer> topo = new ArrayList<>();
        while (!q.isEmpty()) {
            int node = q.poll();
            topo.add(node);
            for (int it : adj.get(node)) {
                indegree[it]--;
                if (indegree[it] == 0) q.add(it);
            }
        }
        return topo;
    }
}
