package org.study.algorithm;

import java.util.*;

public class RomanToInteger {
    /**
     * I: 1, V: 5, X: 10, L: 50, C: 100, D: 500, M: 1000
     * IV => W: 4
     * IX => Y: 9
     * XL => N: 40
     * XC => O: 90
     * CD => E: 400
     * CM => F: 900
     */
    public int romanToInt(String s) {

        Map<String, String> mapTransfer = new HashMap<>();
        Map<String, Integer> map = new HashMap<>();

        mapTransfer.put("IV", "W");
        mapTransfer.put("IX", "Y");
        mapTransfer.put("XL", "N");
        mapTransfer.put("XC", "O");
        mapTransfer.put("CD", "E");
        mapTransfer.put("CM", "F");

        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);

        map.put("W", 4);
        map.put("Y", 9);
        map.put("N", 40);
        map.put("O", 90);
        map.put("E", 400);
        map.put("F", 900);


        for (Map.Entry<String, String> entry : mapTransfer.entrySet()) {
            String x = entry.getKey();
            String y = entry.getValue();
            s = s.replaceAll(x, y);
        }
        String[] strs = s.split("");
        int sum = 0;
        for (String c : strs)
            sum += map.get(c);

        return sum;
    }
}
