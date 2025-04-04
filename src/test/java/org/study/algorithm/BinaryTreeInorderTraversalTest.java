package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeInorderTraversalTest {
    private BinaryTreeInorderTraversal btit;

    @BeforeEach
    void setUp() {
        btit = new BinaryTreeInorderTraversal();
    }

    /**
     * If the tree is empty (root == null or no nodes inserted),
     * we expect an empty list (or however your code handles an empty tree).
     * For example:
     */
    @Test
    void inorderTraversal_emptyTree() {
        List<Integer> result = btit.inorderTraversal(null);
        assertNotNull(result);
        assertTrue(result.isEmpty(), "In-order of an empty tree should be empty.");
    }

    /**
     * Suppose we have a TreeNode-based API:
     * Build a tree manually:
     *         1
     *          \
     *           2
     *          /
     *         3
     * The in-order of this tree is [1, 3, 2].
     */
    @Test
    void inorderTraversal_smallTree() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        List<Integer> result = btit.inorderTraversal(root);
        assertEquals(Arrays.asList(1, 3, 2), result);
    }

    /**
     * Another example:
     *       4
     *      / \
     *     2   6
     *    / \ / \
     *   1  3 5  7
     *
     * In-order: [1, 2, 3, 4, 5, 6, 7]
     */
    @Test
    void inorderTraversal_balancedTree() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);

        List<Integer> result = btit.inorderTraversal(root);
        assertEquals(Arrays.asList(1, 2, 3, 4, 5, 6, 7), result);
    }

    @Test
    void inorderTraversalWithStackWithStack_emptyTree() {
        List<Integer> result = btit.inorderTraversalWithStack(null);
        assertNotNull(result);
        assertTrue(result.isEmpty(), "In-order of an empty tree should be empty.");
    }

    @Test
    void inorderTraversalWithStack_smallTree() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        List<Integer> result = btit.inorderTraversalWithStack(root);
        assertEquals(Arrays.asList(1, 3, 2), result);
    }

    @Test
    void inorderTraversalWithStack_balancedTree() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);
        List<Integer> result = btit.inorderTraversalWithStack(root);
        assertEquals(Arrays.asList(1, 2, 3, 4, 5, 6, 7), result);
    }
}