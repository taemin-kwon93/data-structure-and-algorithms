package org.study.parksangkhil;

import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.HashMap;

/**
 * Given a string s, remove duplicate letters so that every letter appears once and only once.
 * You must make sure your result is the smallest in lexicographical order among all possible results.
 */
public class RemoveDuplicateLetters {
    public String solution(String s) {
        // s의 글자 총 갯수를 세는 용도의 변수
        Map<Character, Integer> counter = new HashMap<>();
        // 이미 처리된 글자인지 판단하는데 사용
        Map<Character, Boolean> seen = new HashMap<>();
        Deque<Character> stack = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        // 문자별 개수 계산
        for (char c : s.toCharArray()) {
            counter.put(c, counter.getOrDefault(c, 0) + 1);
        }

        for (char c : s.toCharArray()) {
            // 현재 처리하는 문자는 카운터에서 -1 처리
            counter.put(c, counter.get(c) - 1);
            // 이미 처리한 문자는 건너뜀
            if (seen.get(c) != null && seen.get(c)) continue;

            // 스택에 있는 문자가 현재 문자보다 더 뒤에 붙여야 할 문자라면 스택에서 제거하고 처리하지 않은걸로 표시
            // 예시, dbacbd -> (db)acdb. (db)는 뒤에서 붙여도 되는 문자다.
            while (!stack.isEmpty() && stack.peek() > c && counter.get(stack.peek()) > 0)
                seen.put(stack.pop(), false);

            // 현재 문자를 스택에 삽입
            stack.push(c);
            // 현재 문자를 처리한 걸로 선언
            seen.put(c, true);
        }

        while (!stack.isEmpty())
            sb.append(stack.pollLast());

        return sb.toString();
    }

    // 개선된 메서드, 원시 자료형을 사용함으로 써 성능 개선
    public String removeDuplicateLetters2(String s) {
        int[] table = new int[26];
        Deque<Character> stack = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray())
            table[c - 97]++;

        for (char c : s.toCharArray()) {
            table[c - 97]--;
            if (stack.contains(c)) continue;
            while (!stack.isEmpty() && stack.peek() > c && table[stack.peek() - 97] > 0)
                stack.poll();

            stack.push(c);
        }

        while (!stack.isEmpty())
            sb.append(stack.pollLast());
        return sb.toString();
    }
}
