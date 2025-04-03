package org.study.algorithm;

public class ReverseInteger {
    public int reverse(int x) {
        boolean negative = x < 0;
        long val = Math.abs((long)x); // Using a long here just temporarily
        String s = new StringBuilder(String.valueOf(val)).reverse().toString();

        long reversedLong = Long.parseLong(s);
        if (negative) reversedLong = -reversedLong;

        if (reversedLong < Integer.MIN_VALUE || reversedLong > Integer.MAX_VALUE)
            return 0;

        return (int) reversedLong;
    }

    public int reverse2(int x) {
        boolean isNegative = x < 0;
        if (isNegative) x = -x;

        int s = 0;
        int r;
        while (x > 0) {
            r = x % 10;
            x = x / 10;
            if (s > Integer.MAX_VALUE / 10 || (s == Integer.MAX_VALUE / 10 && r > 7))
                return 0;
            s = s * 10 + r;
        }

        return isNegative ? -s : s;
    }
}
