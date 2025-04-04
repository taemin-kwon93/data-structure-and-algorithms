package org.study.algorithm;

import java.util.*;

public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode head) {
        List<Integer> result = new ArrayList<>();
        helper(head, result);
        return result;
    }

    public void helper(TreeNode node, List<Integer> list) {
        if (node == null) return;
        helper(node.left, list);
        list.add(node.val);
        helper(node.right, list);
    }

    public List<Integer> inorderTraversalWithStack(TreeNode head) {
        List<Integer> result = new ArrayList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode cur = head;
        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            result.add(cur.val);
            cur = cur.right;
        }

        return result;
    }
}
