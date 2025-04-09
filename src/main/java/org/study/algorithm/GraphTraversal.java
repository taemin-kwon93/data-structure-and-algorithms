package org.study.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GraphTraversal {
    static Map<Integer, List<Integer>> graph = new HashMap<>();
    static boolean[] visited;
    static int count = 0;

    public static void main(String[] args) {
        int n = 5; // 노드 수 (0 ~ 4)
        visited = new boolean[n];

        // 그래프 초기화
        for (int i = 0; i < n; i++) {
            graph.put(i, new ArrayList<>());
        }

        // 간선 추가
        addEdge(0, 1);
        addEdge(0, 2);
        addEdge(1, 3);
        addEdge(1, 4);
        addEdge(2, 4);

        // DFS 실행
        dfs(0);
    }

    static void addEdge(int u, int v) {
        graph.get(u).add(v);
        graph.get(v).add(u); // 무방향 그래프일 경우 양쪽에 추가
    }

    static void dfs(int node) {
        visited[node] = true;
        System.out.println("Visiting: " + node + " | count = " + (count++));

        for (int neighbor : graph.get(node)) {
            System.out.println("  Checking edge: " + node + " → " + neighbor);
            if (!visited[neighbor]) {
                dfs(neighbor);
            }
        }
    }
}
