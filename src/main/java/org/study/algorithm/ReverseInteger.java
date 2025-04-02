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
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;   // pop the last digit
            x /= 10;            // remove the last digit from x

            // Check for overflow: if rev * 10 + pop overflows 32-bit int
            // 1) For positive overflow check:
            //    if rev > Integer.MAX_VALUE / 10
            //    or (rev == Integer.MAX_VALUE / 10 && pop > 7)
            //    => return 0
            if (rev > Integer.MAX_VALUE / 10
                    || (rev == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0;
            }

            // 2) For negative overflow check:
            //    if rev < Integer.MIN_VALUE / 10
            //    or (rev == Integer.MIN_VALUE / 10 && pop < -8)
            //    => return 0
            if (rev < Integer.MIN_VALUE / 10
                    || (rev == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0;
            }

            // push
            rev = rev * 10 + pop;
        }
        return rev;
    }
}
