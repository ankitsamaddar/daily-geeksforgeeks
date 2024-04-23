// 04-2024(April)/23_rohans-love-for-matrix.java
/**
 * Date  : 23-Apr-24
 * Repo  : https://github.com/ankitsamaddar/daily-geeksforgeeks
 *
 * Problem   :  Rohans Love for Matrix
 * Difficulty:  🟡Medium
 *
 * GeeksforGeeks : https://www.geeksforgeeks.org/problems/rohans-love-for-matrix4723/1
 */

import java.io.*;

// User function Template for Java
class Solution {
  // FIBONACCI SEQUENCE APPROACH
  static int firstElement(int n) {
    // If n is 0, return the first element is 0
    if (n == 0)
      return 0;

    int mod = 1000000007;
    int a   = 0;
    int b   = 1;
    // calculate fibonacci sequence up to n-th term
    for (int i = 2; i <= n; i++) {
      int c = (a + b) % mod;
      a     = b % mod;
      b     = c % mod;
    }

    return b % mod;
  }
}

//{ Driver Code Starts
// Initial Template for Java
class GFG {
  public static void main(String args[]) throws IOException {
    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    int t               = Integer.parseInt(read.readLine());
    while (t-- > 0) {
      int n       = Integer.parseInt(read.readLine());
      Solution ob = new Solution();
      System.out.println(ob.firstElement(n));
    }
  }
}

// } Driver Code Ends
