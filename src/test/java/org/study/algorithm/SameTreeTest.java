package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SameTreeTest {
    private SameTree sameTree;

    @BeforeEach
    void setUp() {
        sameTree = new SameTree();
    }

    @Test
    void shouldReturnTrueWhenItsSame() {
        TreeNode root1 = new TreeNode(4);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(6);
        root1.left.left = new TreeNode(1);
        root1.left.right = new TreeNode(3);
        root1.right.left = new TreeNode(5);
        root1.right.right = new TreeNode(7);

        TreeNode root2 = new TreeNode(4);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(6);
        root2.left.left = new TreeNode(1);
        root2.left.right = new TreeNode(3);
        root2.right.left = new TreeNode(5);
        root2.right.right = new TreeNode(7);

        boolean result = sameTree.isSameTree(root1, root2);
        assertTrue(result);
    }

    @Test
    void shouldReturnTrueWhenBothAreNull() {
        boolean result = sameTree.isSameTree(null, null);
        assertTrue(result);
    }

    @Test
    void shouldReturnFalseWhenItsNotSame() {
        TreeNode root1 = new TreeNode(4);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(6);
        root1.left.left = new TreeNode(1);
        root1.left.right = new TreeNode(3);
        root1.right.left = new TreeNode(5);
        root1.right.right = new TreeNode(9);

        TreeNode root2 = new TreeNode(4);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(6);
        root2.left.left = new TreeNode(1);
        root2.left.right = new TreeNode(3);
        root2.right.left = new TreeNode(5);
        root2.right.right = new TreeNode(7);

        boolean result = sameTree.isSameTree(root1, root2);
        assertFalse(result);
    }
    @Test
    void isSameTree() {
    }
}