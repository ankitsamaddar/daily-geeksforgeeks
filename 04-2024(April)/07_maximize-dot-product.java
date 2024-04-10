// april2024/07_maximize-dot-product.java
/**
 * Date  : 07-Apr-24
 * Repo  : https://github.com/ankitsamaddar/daily-geeksforgeeks
 *
 * Problem   :  Maximize dot product
 * Difficulty:  🟡Medium
 *
 * GeeksforGeeks : https://www.geeksforgeeks.org/problems/maximize-dot-product2649/1
 */

import java.util.*;

// User function Template for Java
class Solution {
  public int maxDotProduct(int n, int m, int a[], int b[]) {
    // Initialize dp array
    long dp[][] = new long[n + 1][m + 1];
    for (long[] row : dp) {
      Arrays.fill(row, Integer.MIN_VALUE);
    }

    // Fill the dp table iteratively
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= m; j++) {
        // If there are more elements left in the first array than in the second array
        // we take max of the two options
        if (n - i >= m - j) {
          // We have two options:
          // 1. Ignore the current element of the first array and move to the next element
          // 2. Pair up the current element of both arrays and add the result to the best of the
          // rest of the elements
          dp[i][j] = Math.max(dp[i - 1][j], // step 1
                              (long) a[i - 1] * b[j - 1] + (j > 1 ? dp[i - 1][j - 1] : 0));
        }

        // If the number of elements left in both arrays is the same
        else {
          // We must pair up the current element of both arrays and add the result to the best of
          // the rest of the elements
          dp[i][j] = (long) a[i - 1] * b[j - 1] + (j > 1 ? dp[i - 1][j - 1] : 0);
        }
      }
    }

    // The last cell of the dp table will hold the maximum dot product
    return (int) dp[n][m];
  }
}

//{ Driver Code Starts
// Initial Template for Java
class GfG {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int t      = sc.nextInt();
    while (t-- > 0) {
      int n   = sc.nextInt();
      int m   = sc.nextInt();
      int a[] = new int[n];
      int b[] = new int[m];
      for (int i = 0; i < n; i++)
        a[i] = sc.nextInt();
      for (int i = 0; i < m; i++)
        b[i] = sc.nextInt();
      Solution ob = new Solution();
      System.out.println(ob.maxDotProduct(n, m, a, b));
    }
  }
}

// } Driver Code Ends
