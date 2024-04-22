// 04-2024(April)/22_row-with-minimum-number-of-1s.java
/**
 * Date  : 22-Apr-24
 * Repo  : https://github.com/ankitsamaddar/daily-geeksforgeeks
 *
 * Problem   :  Row with minimum number of 1s
 * Difficulty:  🟢Easy
 *
 * GeeksforGeeks : https://www.geeksforgeeks.org/problems/row-with-minimum-number-of-1s5430/1
 */


import java.io.*;

// User function Template for Java

class Solution {
  // SIMULATION APPROACH
  int minRow(int n, int m, int[][] a) {
    int minCount    = Integer.MAX_VALUE;
    int minRowIndex = -1;
    // Traverse the matrix
    for (int i = 0; i < n; i++) {
      int count = 0;
      for (int j = 0; j < m; j++) {
        // count number of 1s in current row
        if (a[i][j] == 1) {
          count++;
        }
      }
      // if current row has minimum 1s so far, update minRowIndex
      if (count < minCount) {
        minCount    = count;
        minRowIndex = i;
      }
    }
    // index starting at 1
    return minRowIndex + 1;
  }
}

//{ Driver Code Starts
// Initial Template for Java
class GFG {
  public static void main(String args[]) throws IOException {
    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    int t               = Integer.parseInt(read.readLine());
    while (t-- > 0) {
      String s[] = read.readLine().split(" ");
      int N      = Integer.parseInt(s[0]);
      int M      = Integer.parseInt(s[1]);
      int A[][]  = new int[N][M];
      for (int i = 0; i < N; i++) {
        String S[] = read.readLine().split(" ");
        for (int j = 0; j < M; j++) {
          A[i][j] = Integer.parseInt(S[j]);
        }
      }
      Solution ob = new Solution();
      System.out.println(ob.minRow(N, M, A));
    }
  }
}

// } Driver Code Ends
