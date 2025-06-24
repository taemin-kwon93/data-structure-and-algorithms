package org.study.algorithm;

public class SumOfTwoIntegers {
    public String solution(String a, String b) {
        StringBuilder result = new StringBuilder();

        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0 || carry != 0) {
            int digitA = i >= 0 ? a.charAt(i) - '0' : 0;
            int digitB = j >= 0 ? b.charAt(j) - '0' : 0;

            int sum = digitA + digitB + carry;
            carry = sum / 10;
            result.append(sum % 10);

            i--;
            j--;
        }

        return result.reverse().toString();
    }
}
