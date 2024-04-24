// 04-2024(April)/24_paths-to-reach-origin.java
/**
 * Date  : 24-Apr-24
 * Repo  : https://github.com/ankitsamaddar/daily-geeksforgeeks
 *
 * Problem   :  Paths to reach origin
 * Difficulty:  🟡Medium
 *
 * GeeksforGeeks : https://www.geeksforgeeks.org/problems/paths-to-reach-origin3850/1
 */

import java.io.*;

// User function Template for Java

class Solution {
  // DYNAMIC PROGRAMMING APPROACH
  public static int ways(int n, int m) {
    int mod    = 1000000007;
    int[][] dp = new int[n + 1][m + 1];

    // update the dp[]
    // there is only one way to reach first row and first column
    for (int i = 0; i <= n; i++) {
      dp[i][0] = 1;
    }
    for (int i = 0; i <= m; i++) {
      dp[0][i] = 1;
    }

    // fill rest of the array starting from second index
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= m; j++) {
        // number of ways to reach (i, j) is the,
        // sum of ways to reach left([i-1][j]) and above([i][j-1]) it
        dp[i][j] = (dp[i - 1][j] + dp[i][j - 1]) % mod;
      }
    }
    // number of ways to reach point (n, m)
    return dp[n][m];
  }
}

//{ Driver Code Starts.

// Driver class
class Array {
  // Driver code
  public static void main(String[] args) throws IOException {
    // Taking input using buffered reader
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int testcases = Integer.parseInt(br.readLine());
    // looping through all testcases
    while (testcases-- > 0) {
      String line       = br.readLine();
      String[] elements = line.trim().split("\\s+");
      int x             = Integer.parseInt(elements[0]);
      int y             = Integer.parseInt(elements[1]);
      Solution ob       = new Solution();
      System.out.println(ob.ways(x, y));
    }
  }
}

// } Driver Code Ends
