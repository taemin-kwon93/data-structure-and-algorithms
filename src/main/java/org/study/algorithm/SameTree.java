package org.study.algorithm;

public class SameTree {
    boolean result;
    public boolean isSameTree(TreeNode p, TreeNode q) {
        result = true;
        helper(p, q);
        return result;
    }

    public void helper(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return;
        } else if (p == null || q == null) {
            result = false;
            return;
        }

        helper(p.left, q.left);
        if (p.val != q.val) {
            result = false;
            return;
        }
        helper(p.right, q.right);
    }
}
