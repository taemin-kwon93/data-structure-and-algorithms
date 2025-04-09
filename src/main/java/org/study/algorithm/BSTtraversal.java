package org.study.algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BSTtraversal {
    // 1) DFS - Preorder (recursive)
    public void preorder(TreeNode root, List<Integer> list) {
        if (root == null) return;
        list.add(root.val);
        preorder(root.left, list);
        preorder(root.right, list);
    }

    // 2) DFS - Inorder (recursive)
    public void inorder(TreeNode root, List<Integer> list) {
        if (root == null) return;
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }

    // 3) DFS - Postorder (recursive)
    public void postorder(TreeNode root, List<Integer> list) {
        if (root == null) return;
        postorder(root.left, list);
        postorder(root.right, list);
        list.add(root.val);
    }

    // 4) BFS - Level Order
    public void levelOrder(TreeNode root) {
        if (root == null) return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.print(node.val + " ");
            if (node.left != null) queue.offer(node.left);
            if (node.right != null) queue.offer(node.right);
        }
    }

    // Sample usage
    public static void main(String[] args) {
        //        1
        //      /   \
        //     2     3
        //    / \   / \
        //   4   5 6   7

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        BSTtraversal ex = new BSTtraversal();
        List<Integer> preorderList = new ArrayList<>();
        System.out.print("Preorder   : ");
        ex.preorder(root, preorderList);      // 1 2 4 5 3 6 7
        System.out.print(preorderList);
        System.out.println();

        List<Integer> inorderList = new ArrayList<>();
        System.out.print("Inorder    : ");
        ex.inorder(root, inorderList);       // 4 2 5 1 6 3 7
        System.out.print(inorderList);
        System.out.println();

        List<Integer> postorderList = new ArrayList<>();
        System.out.print("Postorder  : ");
        ex.postorder(root, postorderList);     // 4 5 2 6 7 3 1
        System.out.print(postorderList);
        System.out.println();

        System.out.print("Level Order: ");
        ex.levelOrder(root);    // 1 2 3 4 5 6 7
        System.out.println();
    }

}
