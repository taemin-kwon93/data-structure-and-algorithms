package org.study.algorithm;

public class MinDepthBinTree {
    public int minDepth(TreeNode root) {
        return dfs(1, root, Integer.MAX_VALUE);
    }

    public int dfs(int level, TreeNode node, int min) {
        if (node == null) return min;
        if (node.left == null && node.right == null)
            return Math.min(level, min);

        if (node.left != null)
            min = dfs(level + 1, node.left, min);
        if (node.right != null)
            min = dfs(level + 1, node.right, min);

        return min;
    }
}