package org.study.parksangkhil;

import java.util.*;

public class Combinations {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), n, k, 0);
        return result;
    }

    public void backtrack(List<List<Integer>> result, List<Integer> path, int n, int k, int node) {
        if (path.size() == k) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int i = node; i < n; i++) {
            path.add(i + 1);
            backtrack(result, path, n, k, i + 1);
            path.remove(path.size() - 1);
        }
    }
}
