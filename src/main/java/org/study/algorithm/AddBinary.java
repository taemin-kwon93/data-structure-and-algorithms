package org.study.algorithm;

import java.math.BigInteger;

public class AddBinary {
    public String addBinary(String a, String b) {
        return new BigInteger(a, 2).add(new BigInteger(b, 2)).toString(2);
    }

    public String addBinaryB(String a, String b) {
        char[] chars = new char[Math.max(a.length(), b.length()) + 1];
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        for (int k = chars.length - 1; k >= 0; k--) {
            int sum = carry;
            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';
            chars[k] = (char) (sum % 2 + '0');
            carry = sum / 2;
        }

        if (chars[0] == '0')
            return new String(chars, 1, chars.length - 1);
        return new String(chars);
    }
}
