// april2024/08_optimal-strategy-for-a-game.java
/**
 * Date  : 08-Apr-24
 * Repo  : https://github.com/ankitsamaddar/daily-geeksforgeeks
 *
 * Problem   :  Optimal Strategy For A Game
 * Difficulty:  🟡Medium
 *
 * GeeksforGeeks : https://www.geeksforgeeks.org/problems/optimal-strategy-for-a-game-1587115620/1
 */


import java.util.*;

class solve {
  // Function to find the maximum possible amount of money we can win.
  static long countMaximum(int n, int arr[]) {
    long[][] dp = new long[n][n];

    // Traverse through all gaps
    for (int gap = 0; gap < n; gap++) {
      int i = 0;
      for (int j = gap; j < n; i++, j++) {
        // i+2 th coin, if opponent chooses i+1 th coin
        long x = ((i + 2) <= j) ? dp[i + 2][j] : 0;
        // i+1 to j-1 th coin, if opponent chooses i or j
        long y = ((i + 1) <= (j - 1)) ? dp[i + 1][j - 1] : 0;
        // j-2 th coin, if opponent chooses j-1 th coin
        long z = (i <= (j - 2)) ? dp[i][j - 2] : 0;

        // Two choices for first player
        // 1. Choose the i-th coin and min from i+2 and i+1 or j-1
        // 2. Choose the j-th coin and min from i+1 or j-1 and j-2
        dp[i][j] = Math.max(arr[i] + Math.min(x, y), arr[j] + Math.min(y, z));
      }
    }

    // Table is filled in a bottom up manner
    return dp[0][n - 1];
  }
}


//{ Driver Code Starts
class OptimalStrategy {
  public static void main(String[] args) {
    // taking input using Scanner class
    Scanner sc = new Scanner(System.in);

    // taking total number of testcases
    int t = sc.nextInt();

    while (t-- > 0) {
      // taking number of elements
      int n     = sc.nextInt();
      int arr[] = new int[n];

      // inserting the elements
      for (int i = 0; i < n; i++)
        arr[i] = sc.nextInt();

      // calling the countMaximum() method of class solve
      System.out.println(new solve().countMaximum(n, arr));
    }
  }
}

// } Driver Code Ends
