package org.study.algorithm;

public class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        return dfs(root, targetSum);
    }

    public boolean dfs(TreeNode node, int target) {
        if (node == null) return false;
        if (node.left == null && node.right == null)
            return (target - node.val) == 0;

        boolean left = false, right = false;
        if (node.left != null)
            left = dfs(node.left, target - node.val);
        if (node.right != null)
            right = dfs(node.right, target - node.val);

        return left || right;
    }
}
