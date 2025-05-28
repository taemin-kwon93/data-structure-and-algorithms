package org.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.study.algorithm.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("TreeTestUtils")
public class TreeTestUtilsTest {

    @Nested
    @DisplayName("buildTree method")
    class BuildTreeTests {

        @Test
        @DisplayName("should return null for empty or null-root array")
        void shouldReturnNullForEmptyOrNullRoot() {
            assertNull(TreeTestUtils.buildTree(new Integer[]{}));
            assertNull(TreeTestUtils.buildTree(new Integer[]{null}));
        }

        @Test
        @DisplayName("should build single-node tree")
        void shouldBuildSingleNodeTree() {
            TreeNode root = TreeTestUtils.buildTree(new Integer[]{42});
            assertAll("single node",
                    () -> assertNotNull(root),
                    () -> assertEquals(42, root.val),
                    () -> assertNull(root.left),
                    () -> assertNull(root.right)
            );
        }

        @Test
        @DisplayName("should build full binary tree")
        void shouldBuildFullBinaryTree() {
            Integer[] input = {3, 9, 20, null, null, 15, 7};
            TreeNode root = TreeTestUtils.buildTree(input);

            assertAll("tree structure",
                    () -> assertNotNull(root),
                    () -> assertEquals(3, root.val),
                    () -> assertEquals(9, root.left.val),
                    () -> assertEquals(20, root.right.val),
                    () -> assertNull(root.left.left),
                    () -> assertNull(root.left.right),
                    () -> assertEquals(15, root.right.left.val),
                    () -> assertEquals(7, root.right.right.val)
            );
        }
    }

    @Nested
    @DisplayName("isSameTree method")
    class IsSameTreeTests {

        @Test
        @DisplayName("should return true for identical trees")
        void shouldReturnTrueForIdenticalTrees() {
            TreeNode p = TreeTestUtils.buildTree(new Integer[]{1,2,3,4,5,6,7});
            TreeNode q = TreeTestUtils.buildTree(new Integer[]{1,2,3,4,5,6,7});
            assertTrue(TreeTestUtils.isSameTree(p, q));
        }

        @Test
        @DisplayName("should return false for different structures")
        void shouldReturnFalseForDifferentStructure() {
            TreeNode p = TreeTestUtils.buildTree(new Integer[]{1,2,3,4,5,6,7});
            TreeNode q = TreeTestUtils.buildTree(new Integer[]{1,3,2,4,5,6,7});
            assertFalse(TreeTestUtils.isSameTree(p, q));
        }
    }
}
