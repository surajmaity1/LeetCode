package Practice;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        int V = 7;
        boolean[] vis = new boolean[V + 1];
        List<List<Integer>> adj = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        for (int node = 1; node <= 7; node++) {
            if (!vis[node]) {
                new Program().dfs(node, adj, vis, ans, V);
            }
        }
    }

    public void dfs(int node, List<List<Integer>> adj, boolean[] vis, List<Integer> ans, int V) {
        ans.add(node);
        vis[node] = true;
        for (Integer it : adj.get(node)) {
            if (!vis[it]) {
                dfs(it, adj, vis, ans, V);
            }
        }
    }
}