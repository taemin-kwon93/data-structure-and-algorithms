package org.study.algorithm;

public class SquareRoot {
    public int mySqrt(int x) {
        if (x <= 1) return x;
        long y = 2;
        while (y * y <= x) {
            y++;
        }
        return (int) y - 1;
    }
}
