package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.util.TreeTestUtils;

import static org.junit.jupiter.api.Assertions.*;

class MinDepthBinTreeTest {
    private MinDepthBinTree minDepthBinTree;

    @BeforeEach
    void setUp() {
        minDepthBinTree = new MinDepthBinTree();
    }

    @Test
    void shouldReturnMinDepth() {
        TreeNode root1 = TreeTestUtils.buildTree(new Integer[] {3,9,20,null,null,15,7});
        TreeNode root2 = TreeTestUtils.buildTree(new Integer[] {2,null,3,null,4,null,5,null,6});

        int result1 = minDepthBinTree.minDepth(root1);
        int result2 = minDepthBinTree.minDepth(root2);

        assertEquals(2, result1);
        assertEquals(5, result2);
    }
}