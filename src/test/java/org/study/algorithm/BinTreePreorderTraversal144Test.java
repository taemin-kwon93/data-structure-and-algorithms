package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.util.TreeTestUtils;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class BinTreePreorderTraversal144Test {
    private BinTreePreorderTraversal144 binTreePreorderTraversal144;

    @BeforeEach
    void setUp() {
        binTreePreorderTraversal144 = new BinTreePreorderTraversal144();
    }

    @Test
    void preorderTraversal() {
        TreeNode root1 = TreeTestUtils.buildTree(new Integer[] {1,null,2,3});
        TreeNode root2 = TreeTestUtils.buildTree(new Integer[] {1,2,3,4,5,null,8,null,null,6,7,9});

        List<Integer> result1 = binTreePreorderTraversal144.preorderTraversal(root1);
        List<Integer> result2 = binTreePreorderTraversal144.preorderTraversal(root2);

        List<Integer> expected1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> expected2 = new ArrayList<>(Arrays.asList(1, 2, 4, 5, 6, 7, 3, 8, 9));

        assertArrayEquals(expected1.toArray(new Integer[0]), result1.toArray(new Integer[0]));
        assertArrayEquals(expected2.toArray(new Integer[0]), result2.toArray(new Integer[0]));
    }
}