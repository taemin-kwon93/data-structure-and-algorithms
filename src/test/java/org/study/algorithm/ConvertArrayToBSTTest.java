package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertArrayToBSTTest {
    private ConvertArrayToBST convertArrayToBST;

    @BeforeEach
    void setUp() {
        convertArrayToBST = new ConvertArrayToBST();
    }

    @Test
    void sortedArrayToBST() {
        int[] nums = {-10,-3,0,5,9};
        TreeNode result = convertArrayToBST.sortedArrayToBST(nums);

        assertEquals(0, result.val);
        assertEquals(-10, result.left.val);
        assertEquals(-3, result.left.right.val);
        assertEquals(5, result.right.val);
        assertEquals(9, result.right.right.val);
    }
}