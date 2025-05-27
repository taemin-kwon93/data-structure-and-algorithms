package org.study.parksangkhil;

import java.util.*;

public class MinimumHeightTrees {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        if (n == 1) return new ArrayList<>(Arrays.asList(0));

        List<Integer> result = new ArrayList<>();
        int[] indegree = new int[n];

        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for(int[] ed:edges){
            adj.get(ed[0]).add(ed[1]);
            adj.get(ed[1]).add(ed[0]);
            indegree[ed[0]]++;
            indegree[ed[1]]++;
        }

        Queue<Integer> q = new LinkedList<>();

        for(int i = 0; i < n; i++){
            if(indegree[i] == 1){
                q.add(i);
            }
        }

        while(n > 2){
            int size = q.size();
            n = n - size;

            for(int i = 0; i < size; i++){
                int leaf = q.poll();

                for(int x : adj.get(leaf)) {
                    indegree[x]--;
                    if(indegree[x] == 1) q.add(x);
                }
            }
        }

        while (!q.isEmpty()) {
            result.add(q.poll());
        }

        return result;
    }
}
