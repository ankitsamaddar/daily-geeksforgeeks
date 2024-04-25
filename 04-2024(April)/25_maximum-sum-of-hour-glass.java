// 04-2024(April)/25_maximum-sum-of-hour-glass.java
/**
 * Date  : 25-Apr-24
 * Repo  : https://github.com/ankitsamaddar/daily-geeksforgeeks
 *
 * Problem   :  Maximum sum of hour glass
 * Difficulty:  🟡Medium
 *
 * GeeksforGeeks : https://www.geeksforgeeks.org/problems/maximum-sum-of-hour-glass3842/1
 */


import java.io.*;

// User function Template for Java
class Solution {
  // SIMULATION APPROACH
  int findMaxSum(int n, int m, int[][] mat) {
    // Initialize the maximum hourglass sum as the smallest possible integer
    int maxSum = Integer.MIN_VALUE;

    // Traverse the given matrix
    for (int i = 0; i < n - 2; i++) {
      for (int j = 0; j < m - 2; j++) {
        // Calculate the sum of the current hourglass
        int currentSum = mat[i][j] + mat[i][j + 1] + mat[i][j + 2] +            // top part
                         mat[i + 1][j + 1] +                                    // middle part
                         mat[i + 2][j] + mat[i + 2][j + 1] + mat[i + 2][j + 2]; // bottom part

        // Update the maximum hourglass sum
        maxSum = Math.max(maxSum, currentSum);
      }
    }

    // If the maximum hourglass sum is still the smallest possible integer, return -1
    if (maxSum == Integer.MIN_VALUE) {
      return -1;
    }

    // Return the maximum hourglass sum
    return maxSum;
  }
}

//{ Driver Code Starts
// Initial Template for Java
class GFG {
  public static void main(String args[]) throws IOException {
    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    int t               = Integer.parseInt(read.readLine());
    while (t-- > 0) {
      String s[]  = read.readLine().split(" ");
      int N       = Integer.parseInt(s[0]);
      int M       = Integer.parseInt(s[1]);
      int Mat[][] = new int[N][M];
      for (int i = 0; i < N; i++) {
        String S[] = read.readLine().split(" ");
        for (int j = 0; j < M; j++) {
          Mat[i][j] = Integer.parseInt(S[j]);
        }
      }
      Solution ob = new Solution();
      System.out.println(ob.findMaxSum(N, M, Mat));
    }
  }
}

// } Driver Code Ends
