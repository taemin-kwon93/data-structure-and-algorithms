package org.study.algorithm;

import java.util.*;

public class CreatePrimeNumber {
    public int solution(int[] nums) {
        int answer = 0;
        Arrays.sort(nums);

        int len = nums.length;
        int x = nums[len - 1], y = nums[len - 2], z = nums[len - 3];
        int max = x + y + z;

        boolean[] isPrime = new boolean[max + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = true;
        isPrime[1] = true;

        setUpPrimeNums(isPrime, max);

        for (int i = 0; i < len - 2; i++) {
            for (int j = i + 1; j < len - 1; j++) {
                for (int k = j + 1; k < len; k++) {
                    if (isPrime[nums[i] + nums[j] + nums[k]]) answer++;
                }
            }
        }

        return answer;
    }

    public void setUpPrimeNums(boolean[] isPrime, int n) {
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }
}
