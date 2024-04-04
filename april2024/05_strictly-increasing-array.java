// april2024/05_strictly-increasing-array.java
/**
 * Date  : 05-Apr-24
 * Repo  : https://github.com/ankitsamaddar/daily-geeksforgeeks
 *
 * Problem   :  Strictly Increasing Array
 * Difficulty:  🔴Hard
 *
 * GeeksforGeeks : https://www.geeksforgeeks.org/problems/convert-to-strictly-increasing-array3351/1
 */

import java.io.*;
import java.util.*;

/*
EXPLANATION : Using Longest Increasing Subsequence (LIS)

Eg : 1 2 3 6 5 4
dp = [1, 1, 1, 1, 1, 1]
maxLIS is the max increasing subsequence till i

i = 1 ; nums[i] = 2 ; dp = [1, 2, 1, 1, 1, 1] -> maxLIS(=1) + 1
i = 2 ; nums[i] = 3 ; dp = [1, 2, 3, 1, 1, 1] -> maxLIS(=2) + 1
i = 3 ; nums[i] = 6 ; dp = [1, 2, 3, 4, 1, 1] -> max increasing sequence is 4 maxLIS(=3) + 1
i = 4 ; nums[i] = 5 ; dp = [1, 2, 3, 4, 4, 1] -> maxLIS(=3) + 1
i = 5 ; nums[i] = 4 ; dp = [1, 2, 3, 4, 4, 4] -> maxLIS(=3) + 1

So here the LIS is 4 so no. of elements to change to get strictly increasing order
num.length = 6
num.length - LIS = 6 - 4 = 2

*/

class Solution {
  public int min_operations(int[] nums) {
    int[] dp = new int[nums.length];
    Arrays.fill(dp, 1); // each element can be a subsequence of length 1

    // find Longest Increasing Subsequence (LIS)
    for (int i = 1; i < nums.length; i++) {
      int maxLIS = 0; // to store max LIS till i

      // get the max LIS till i
      for (int j = 0; j < i; j++) {
        // check if nums[i] can be a strict increasing subsequence that includes nums[j]
        // then get the max possible increasing number in the subsequence
        if (nums[j] < nums[i] && (nums[i] - nums[j] > i - j - 1)) {
          maxLIS = Math.max(maxLIS, dp[j]);
        }
      }
      // update dp[i] with 1 more than maxLIS, as it is increasing subsequence
      dp[i] = Math.max(dp[i], 1 + maxLIS);
    }
    // get the maximum number that is in sequence
    int lis = Arrays.stream(dp).max().getAsInt();
    // so only n-lis numbers need to be adjusted to keep the sequence
    return nums.length - lis;
  }
}

//{ Driver Code Starts
// Initial Template for Java
class GFG {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T             = Integer.parseInt(br.readLine().trim());
    while (T-- > 0) {
      int n       = Integer.parseInt(br.readLine().trim());
      String s    = br.readLine().trim();
      String[] s1 = s.split(" ");
      int[] nums  = new int[n];
      for (int i = 0; i < n; i++)
        nums[i] = Integer.parseInt(s1[i]);
      Solution ob = new Solution();
      long ans    = ob.min_operations(nums);
      System.out.println(ans);
    }
  }
}

// } Driver Code Ends
