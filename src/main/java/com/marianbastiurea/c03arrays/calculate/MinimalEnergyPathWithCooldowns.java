package com.marianbastiurea.c03arrays.calculate;

/*
Description:
You are a climber attempting to ascend a mountain, represented by an array heights of length n, where heights[i] indicates the height of the i-th platform.

You can move from platform i to any platform j > i, but each jump costs energy equal to abs(heights[j] - heights[i]). However, after making a jump, you must wait cooldown steps before you can jump again (i.e., you can only jump to j >= i + cooldown + 1).

Your goal is to reach the last platform (index n - 1) starting from platform 0 using any number of jumps, minimizing the total energy used.

Function Signature:
int minEnergyToReachEnd(int[] heights, int cooldown)
Example:
Input:
heights = [10, 30, 20, 40, 50], cooldown = 1

Output:
30

Explanation:
- Jump from 0 → 2 (energy = |20 - 10| = 10)
- Wait 1 step → jump from 2 → 4 (energy = |50 - 20| = 30)
- Total = 10 + 30 = 40

But better:
- Jump from 0 → 3 (energy = |40 - 10| = 30)
- Wait 1 → jump from 3 → 4 (|50 - 40| = 10)
- Total = **30 + 10 = 40**

But **best**:
- Jump from 0 → 4 (|50 - 10| = **40**) — can't be better

Hmm, in this example all paths give the same. Try:

```java
Input: heights = [10, 13, 12, 15, 10], cooldown = 1

Best: 0 → 2 (2), wait, 2 → 4 (2) → total = 4 ✅
Constraints:
2 ≤ heights.length ≤ 10^4
0 ≤ heights[i] ≤ 10^4
0 ≤ cooldown < heights.length
🧩 Hints:
Think of DP with a cooldown window.
A priority queue or segment tree can help optimize the minimum over sliding ranges.
Time complexity must ideally be O(n log n) or better — brute-force O(n²) is too slow.
 */


import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MinimalEnergyPathWithCooldowns {



    static int minEnergyToReachEnd(int[] heights, int cooldown) {
        int n = heights.length;
        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        PriorityQueue<int[]> heap = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        heap.add(new int[]{0, 0});

        while (!heap.isEmpty()) {
            int[] current = heap.poll();
            int cost = current[0];
            int i = current[1];

            if (cost > dp[i]) continue;

            for (int j = i + cooldown + 1; j < n; j++) {
                int jumpCost = Math.abs(heights[j] - heights[i]);
                int totalCost = dp[i] + jumpCost;

                if (totalCost < dp[j]) {
                    dp[j] = totalCost;
                    heap.add(new int[]{totalCost, j});
                }
            }
        }

        return dp[n - 1] == Integer.MAX_VALUE ? -1 : dp[n - 1];
    }

}
