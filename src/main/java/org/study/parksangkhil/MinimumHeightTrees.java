package org.study.parksangkhil;

import java.util.*;

public class MinimumHeightTrees {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        if (n == 1) return new ArrayList<>(Arrays.asList(0));

        List<Integer> result = new ArrayList<>();
        List<List<Integer>> graph = new ArrayList<>();
        int[] indegree = new int[n];

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] ed : edges) {
            graph.get(ed[0]).add(ed[1]);
            graph.get(ed[1]).add(ed[0]);
            indegree[ed[0]]++;
            indegree[ed[1]]++;
        }

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (indegree[i] == 1) q.add(i);
        }

        while (n > 2){
            int size = q.size();
            n -= size;

            for (int i = 0; i < size; i++) {
                int leaf = q.poll();

                for (int x : graph.get(leaf)) {
                    indegree[x]--;
                    if (indegree[x] == 1) q.add(x);
                }
            }
        }

        while (!q.isEmpty()) {
            result.add(q.poll());
        }

        return result;
    }
}
