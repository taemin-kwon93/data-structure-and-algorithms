package org.study.parksangkhil;

import java.util.*;

public class CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> map = new HashMap<>();

        // 그래프 생성
        for (int[] arr : prerequisites) {
            map.putIfAbsent(arr[1], new ArrayList<>());
            map.get(arr[1]).add(arr[0]);
        }

        boolean[] visited = new boolean[numCourses];
        boolean[] visiting = new boolean[numCourses];

        // 모든 과목에 대해 탐색
        for (int i = 0; i < numCourses; i++) {
            if (!dfs(map, i, visited, visiting)) return false;
        }

        return true;
    }

    public boolean dfs(Map<Integer, List<Integer>> map, int from, boolean[] visited, boolean[] visiting) {
        if (visited[from]) return true;
        if (visiting[from]) return false; // 사이클 발생

        visiting[from] = true;

        if (map.containsKey(from)) {
            for (int to : map.get(from)) {
                if (!dfs(map, to, visited, visiting)) return false;
            }
        }

        visiting[from] = false;
        visited[from] = true;

        return true;
    }
}
