package org.study.parksangkhil;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class ValidParentheses {
    // 내 방식대로 처음 풀어본 stack 문제
    public boolean isValid(String s) {
        if (s.startsWith(")") || s.startsWith("]") || s.startsWith("}")) return false;

        Deque<String> dq = new ArrayDeque<>();
        for (String tmp : s.split("")) {
            if (tmp.equals("(") || tmp.equals("[") || tmp.equals("{")) {
                dq.push(tmp);
            } else if (tmp.equals(")") || tmp.equals("]") || tmp.equals("}")) {
                switch (tmp) {
                    case ")" -> tmp = "(";
                    case "]" -> tmp = "[";
                    case "}" -> tmp = "{";
                }

                try {
                    if (dq.getFirst().equals(tmp)) {
                        dq.pop();
                    } else {
                        return false;
                    }
                } catch (Exception e) {
                    return false;
                }
            }
        }

        return dq.isEmpty();
    }

    public boolean isValidB(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        Map<Character, Character> table = new HashMap<>() {{
            put(')','(');
            put('}', '{');
            put(']', '[');
        }};

        for (int i = 0; i < s.length(); i++) {
            if (!table.containsKey(s.charAt(i))) {
                stack.push(s.charAt(i));
            } else if (stack.isEmpty() || stack.pop() != table.get(s.charAt(i))) {
                return false;
            }
        }

        return stack.isEmpty();
    }

    // Runtime 이 가장 빠른 풀이
    public boolean isValidC(String s) {
        if (s.startsWith(")") || s.startsWith("]") || s.startsWith("}")) return false;
        Deque<Character> dq = new ArrayDeque<>();

        for (Character c : s.toCharArray()) {
            switch (c) {
                case '(', '[', '{' -> dq.push(c);
                case ')' -> {if (dq.isEmpty() || dq.pop() != '(') return false;}
                case '}' -> {if (dq.isEmpty() || dq.pop() != '{') return false;}
                case ']' -> {if (dq.isEmpty() || dq.pop() != '[') return false;}
            }
        }
        return dq.isEmpty();
    }
}
