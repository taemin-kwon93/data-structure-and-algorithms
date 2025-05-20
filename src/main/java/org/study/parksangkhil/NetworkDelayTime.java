package org.study.parksangkhil;

import java.util.*;

public class NetworkDelayTime {
    public int networkDelayTime(int[][] times, int n, int k) {
        Map<Integer, List<int[]>> graph = new HashMap<>();
        for (int[] time : times) {
            // from 'u'(source vertex) to 'v'(destination vertex) and 'w'(weight)
            graph.computeIfAbsent(time[0], a -> new ArrayList<>()).add(new int[] {time[1], time[2]});
        }

        // distance values from k
        int[] dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[k] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.offer(new int[]{k, 0});

        // Dijkstra's algorithm
        // Using a priority queue to get the node with the smallest distance
        // and updating the distances to its neighbors
        // until all nodes are processed or the queue is empty
        // The time complexity is O((V + E) log V), where V is the number of vertices and E is the number of edges
        // The space complexity is O(V + E) for the graph and O(V) for the distance array
        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int node = curr[0], time = curr[1];

            if (!graph.containsKey(node)) continue;

            for (int[] neighbor : graph.get(node)) {
                int next = neighbor[0], cost = neighbor[1];
                if (dist[next] > time + cost) {
                    dist[next] = time + cost;
                    pq.offer(new int[]{next, dist[next]});
                }
            }
        }

        int max = 0;
        for (int i = 1; i <= n; i++) {
            if (dist[i] == Integer.MAX_VALUE) return -1;
            max = Math.max(max, dist[i]);
        }
        return max;
    }
}
