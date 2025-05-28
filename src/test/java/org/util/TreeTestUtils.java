package org.util;

import org.study.algorithm.TreeNode;

import java.util.*;

public class TreeTestUtils {
    private TreeTestUtils() {
        throw new AssertionError("Cannot instantiate utility class");
    }

    /**
     * Builds a binary tree from a level-order array representation.
     * Null entries indicate missing nodes.
     */
    public static TreeNode buildTree(Integer[] arr) {
        if (arr == null || arr.length == 0 || arr[0] == null) {
            return null;
        }

        TreeNode root = new TreeNode(arr[0]);
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        int i = 1;

        while (i < arr.length) {
            TreeNode node = queue.poll();
            if (node == null) {
                break;
            }

            if (arr[i] != null) {
                node.left = new TreeNode(arr[i]);
                queue.offer(node.left);
            }
            i++;

            if (i < arr.length && arr[i] != null) {
                node.right = new TreeNode(arr[i]);
                queue.offer(node.right);
            }
            i++;
        }

        return root;
    }

    /**
     * Determines if two binary trees are structurally identical with equal values.
     */
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
