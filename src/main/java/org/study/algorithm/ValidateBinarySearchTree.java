package org.study.algorithm;

public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        // Use Long.MIN_VALUE and Long.MAX_VALUE to avoid overflow
        return dfs(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean dfs(TreeNode node, long min, long max) {
        if (node == null) {
            return true;
        }
        // Must satisfy min < node.val < max
        if (node.val <= min || node.val >= max) {
            return false;
        }
        // Left subtree: values must be < node.val
        if (!dfs(node.left, min, node.val)) {
            return false;
        }
        // Right subtree: values must be > node.val
        if (!dfs(node.right, node.val, max)) {
            return false;
        }
        return true;
    }
}
