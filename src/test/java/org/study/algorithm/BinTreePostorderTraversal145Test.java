package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.util.TreeTestUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinTreePostorderTraversal145Test {
    private BinTreePostorderTraversal145 binTreePostorderTraversal145;

    @BeforeEach
    void setUp() {
        binTreePostorderTraversal145 = new BinTreePostorderTraversal145();
    }

    @Test
    void preorderTraversal() {
        TreeNode root1 = TreeTestUtils.buildTree(new Integer[] {1,null,2,3});
        TreeNode root2 = TreeTestUtils.buildTree(new Integer[] {1,2,3,4,5,null,8,null,null,6,7,9});

        List<Integer> result1 = binTreePostorderTraversal145.postorderTraversal(root1);
        List<Integer> result2 = binTreePostorderTraversal145.postorderTraversal(root2);

        List<Integer> expected1 = new ArrayList<>(Arrays.asList(3,2,1));
        List<Integer> expected2 = new ArrayList<>(Arrays.asList(4,6,7,5,2,9,8,3,1));

        assertArrayEquals(expected1.toArray(new Integer[0]), result1.toArray(new Integer[0]));
        assertArrayEquals(expected2.toArray(new Integer[0]), result2.toArray(new Integer[0]));
    }
}