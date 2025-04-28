package org.study.algorithm;

public class Convert1DArrayInto2DArray {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if ((m * n) != original.length) return new int[][] {};
        int[][] result = new int[m][n];
        int level = 0;

        for (int i = 0; i < original.length; i++) {
            if (i != 0 && i % n == 0)
                level++;
            result[level][i % n] = original[i];
        }

        return result;
    }
}
