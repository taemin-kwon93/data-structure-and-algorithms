package org.study.algorithm;

public class CoinChangeII518 {
    public int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1; // 금액 0을 만드는 방법은 "아무것도 선택하지 않기" 한 가지

        for (int coin : coins)
            for (int i = coin; i <= amount; i++)
                dp[i] += dp[i - coin];

        return dp[amount];
    }
}
