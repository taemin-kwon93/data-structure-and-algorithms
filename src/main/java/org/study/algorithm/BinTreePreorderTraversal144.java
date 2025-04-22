package org.study.algorithm;

import java.util.*;

public class BinTreePreorderTraversal144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        dfs(result, root);
        return result;
    }

    public void dfs(List<Integer> result, TreeNode node) {
        if (node == null) return;
        result.add(node.val);
        dfs(result, node.left);
        dfs(result, node.right);
    }
}
