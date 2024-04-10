// april2024/06_count-ways-to-nth-stair.java
/**
 * Date  : 06-Apr-24
 * Repo  : https://github.com/ankitsamaddar/daily-geeksforgeeks
 *
 * Problem   :  Count ways to Nth Stair
 * Difficulty:  🟢Easy
 *
 * GeeksforGeeks : https://www.geeksforgeeks.org/problems/count-ways-to-nth-stairorder-does-not-matter1322/1
 */

import java.util.*;

class Solution {
  // Function to count number of ways to reach the nth stair
  // when order does not matter.
  Long countWays(int n) {
    long[] dp = new long[n + 1];

    // initialize for 0th and 1th stair.
    dp[0] = 1;
    dp[1] = 1;

    // count ways to reach i-th stair
    for (int i = 2; i <= n; i++) {
      // we can only reach a even number stair by climbing two steps from a even number step
      // so we add an extra way for every even number steps
      dp[i] = dp[i - 1] + (i % 2 == 0 ? 1 : 0);
    }
    // ways to reach n-th stair
    return dp[n];
  }
}

//{ Driver Code Starts
class GFG {
  public static void main(String[] args) {
    // taking input using Scanner class
    Scanner sc = new Scanner(System.in);

    // taking total test cases
    int t = sc.nextInt();

    while (t-- > 0) {
      // taking total number of stairs
      int n = sc.nextInt();

      // creating an object of class DynamicProgramming
      Solution obj = new Solution();

      // calling method of class countWays()
      // of class DynamicProgramming
      System.out.println(obj.countWays(n));
    }
  }
}

// } Driver Code Ends
