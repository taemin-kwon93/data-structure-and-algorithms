package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.util.TreeTestUtils;

import static org.junit.jupiter.api.Assertions.*;

class ValidateBinarySearchTreeTest {
    private ValidateBinarySearchTree validateBinarySearchTree;
    @BeforeEach
    void setUp() {
        validateBinarySearchTree = new ValidateBinarySearchTree();
    }

    @Test
    void isValidBST() {
        TreeNode root1 = TreeTestUtils.buildTree(new Integer[] {5,1,8,null,null,7,10, 4, 9});
        TreeNode root2 = TreeTestUtils.buildTree(new Integer[] {2,1,3});

        boolean result1 = validateBinarySearchTree.isValidBST(root1);
        boolean result2 = validateBinarySearchTree.isValidBST(root2);

        assertFalse(result1, "The tree should not be a valid BST because 4 is in the left subtree of 5 but greater than 1.");
        assertTrue(result2, "The tree should be a valid BST because all nodes satisfy the BST property.");
    }
}