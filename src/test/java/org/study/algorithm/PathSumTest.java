package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.util.TreeTestUtils;

import static org.junit.jupiter.api.Assertions.*;

class PathSumTest {
    private PathSum pathSum;

    @BeforeEach
    void setUp() {
        pathSum = new PathSum();
    }

    @Test
    void hasPathSum() {
        TreeNode root1 = TreeTestUtils.buildTree(new Integer[] {5,4,8,11,null,13,4,7,2,null,null,null,1});
        int targetSum1 = 22;

        TreeNode root2 = TreeTestUtils.buildTree(new Integer[] {1,2,3});
        int targetSum2 = 5;

        TreeNode root3 = TreeTestUtils.buildTree(new Integer[] {1, 2});
        int targetSum3 = 2;

        boolean result1 = pathSum.hasPathSum(root1, targetSum1);
        boolean result2 = pathSum.hasPathSum(root2, targetSum2);
        boolean result3 = pathSum.hasPathSum(root3, targetSum3);

        assertTrue(result1);
        assertFalse(result2);
        assertFalse(result3);
    }
}