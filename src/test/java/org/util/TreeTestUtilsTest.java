package org.util;

import org.junit.jupiter.api.Test;
import org.study.algorithm.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

public class TreeTestUtilsTest {
    @Test
    void testBuildTree_fromArray() {
        Integer[] input = {3, 9, 20, null, null, 15, 7};

        TreeNode root = TreeTestUtils.buildTree(input);

        // 기본 검증
        assertNotNull(root);
        assertEquals(3, root.val);
        assertEquals(9, root.left.val);
        assertEquals(20, root.right.val);
        assertNull(root.left.left);
        assertNull(root.left.right);
        assertEquals(15, root.right.left.val);
        assertEquals(7, root.right.right.val);
    }

    @Test
    void testBuildTree_emptyArray() {
        TreeNode root = TreeTestUtils.buildTree(new Integer[]{});
        assertNull(root);
    }

    @Test
    void testBuildTree_nullRoot() {
        TreeNode root = TreeTestUtils.buildTree(new Integer[]{null});
        assertNull(root);
    }

    @Test
    void testBuildTree_singleNode() {
        TreeNode root = TreeTestUtils.buildTree(new Integer[]{42});
        assertNotNull(root);
        assertEquals(42, root.val);
        assertNull(root.left);
        assertNull(root.right);
    }
}
