// 04-2024(April)/26_exit-point-in-a-matrix.java
/**
 * Date  : 26-Apr-24
 * Repo  : https://github.com/ankitsamaddar/daily-geeksforgeeks
 *
 * Problem   :  Exit Point in a Matrix
 * Difficulty:  🟡Medium
 *
 * GeeksforGeeks : https://www.geeksforgeeks.org/problems/exit-point-in-a-matrix0905/1
 */


import java.io.*;

// User function Template for Java

class Solution {
  // SIMULATION APPROACH
  public int[] FindExitPoint(int n, int m, int[][] matrix) {
    // Initialize direction to right
    // (0->right, 1->down, 2->left, 3->up)
    int dir = 0;

    int i = 0;
    int j = 0;

    while (true) {
      // determine the direction based on cell value,
      // take modulus by 4 to keep it within the range 0-3
      dir = (dir + matrix[i][j]) % 4;

      // change cell value from 1 to 0
      if (matrix[i][j] == 1) {
        matrix[i][j] = 0;
      }

      // update the pointers based on direction
      if (dir == 0) { // Move Right
        j++;
      } else if (dir == 1) { // Move Down
        i++;
      } else if (dir == 2) { // Move Left
        j--;
      } else if (dir == 3) { // Move Up
        i--;
      }

      // Exit if the position is out of the matrix bounds
      if (i < 0 || i == n || j < 0 || j == m) {
        break;
      }
    }

    // adjust exit points i as it is out of bounds
    if (i < 0) {
      i++;
    } else if (i == n) {
      i--;
    }
    // adjust exit points j as it is out of bounds
    else if (j < 0) {
      j++;
    } else if (j == m) {
      j--;
    }

    // return exit point
    return new int[] {i, j};
  }
}

//{ Driver Code Starts
// Initial Template for Java
class GFG {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T             = Integer.parseInt(br.readLine().trim());
    while (T-- > 0) {
      String[] s     = br.readLine().trim().split(" ");
      int n          = Integer.parseInt(s[0]);
      int m          = Integer.parseInt(s[1]);
      int[][] matrix = new int[n][m];
      for (int i = 0; i < n; i++) {
        String[] S = br.readLine().split(" ");
        for (int j = 0; j < m; j++) {
          matrix[i][j] = Integer.parseInt(S[j]);
        }
      }
      Solution ob = new Solution();
      int[] ans   = ob.FindExitPoint(n, m, matrix);
      for (int i = 0; i < ans.length; i++)
        System.out.print(ans[i] + " ");
      System.out.println();
    }
  }
}

// } Driver Code Ends
