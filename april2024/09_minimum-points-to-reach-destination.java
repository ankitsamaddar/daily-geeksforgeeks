// april2024/09_minimum-points-to-reach-destination.java
/**
 * Date  : 09-Apr-24
 * Repo  : https://github.com/ankitsamaddar/daily-geeksforgeeks
 *
 * Problem   :  Minimum Points To Reach Destination
 * Difficulty:  🔴Hard
 *
 * GeeksforGeeks : https://www.geeksforgeeks.org/problems/minimum-points-to-reach-destination0540/1
 */


// User function Template for Java
class Solution {
  public int minPoints(int points[][], int m, int n) {
    // dp[i][j] represents the minimum initial points to reach cell (i, j)
    int dp[][] = new int[m][n];

    // Initialize the destination cell dp[n-1][m-1]
    if (points[m - 1][n - 1] > 0) {
      // if (n -1 , m - 1) +ve atleast 1 point to reach it
      dp[m - 1][n - 1] = 1;
    } else {
      // if (n-1,m-1) -ve we need to offset the -ve value and still have 1 point
      dp[m - 1][n - 1] = Math.abs(points[m - 1][n - 1]) + 1;
    }

    // Fill the last row from the end as the dp[i+1][n-1] - points[i][n-1]
    for (int i = m - 2; i >= 0; i--) {
      dp[i][n - 1] = Math.max(dp[i + 1][n - 1] - points[i][n - 1], 1);
    }
    // Fill the last column from the end as the dp[m-1][j+1] = points[m-1][j]
    for (int j = n - 2; j >= 0; j--)
      dp[m - 1][j] = Math.max(dp[m - 1][j + 1] - points[m - 1][j], 1);

    // Fill the rest of the table from the end
    for (int i = m - 2; i >= 0; i--) {
      for (int j = n - 2; j >= 0; j--) {
        // consider min from the right(i+1) and down(j+1) cells
        int minPointsOnExit = Math.min(dp[i + 1][j], dp[i][j + 1]);
        // Subtract current points
        dp[i][j] = Math.max(minPointsOnExit - points[i][j], 1);
      }
    }

    // The top left cell contains the minimum initial points to reach the destination
    return dp[0][0];
  }
}

//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GfG {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int t      = sc.nextInt();
    while (t-- > 0) {
      int m          = sc.nextInt();
      int n          = sc.nextInt();
      int points[][] = new int[m][n];
      for (int i = 0; i < m; i++)
        for (int j = 0; j < n; j++)
          points[i][j] = sc.nextInt();
      Solution ob = new Solution();
      System.out.println(ob.minPoints(points, m, n));
    }
  }
}

// } Driver Code Ends
