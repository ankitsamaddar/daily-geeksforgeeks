// 04-2024(April)/12_sum-of-products.java
/**
 * Date  : 12-Apr-24
 * Repo  : https://github.com/ankitsamaddar/daily-geeksforgeeks
 *
 * Problem   :  Sum of Products
 * Difficulty:  🟡Medium
 *
 * GeeksforGeeks : https://www.geeksforgeeks.org/problems/sum-of-products5049/1
 */

// User function Template for Java

class Solution {
  static long pairAndSum(int n, long arr[]) {
    // Initialize result
    long sum = 0;

    // Traverse over each bit position and add to the sum contribution of each bit
    for (int i = 0; i < 32; i++) {
      // Count number of array elements with i'th bit set
      long count = 0;
      for (int j = 0; j < n; j++) {
        // 1 is left shifted i times - rest of the bits are zero
        // AND will return 1 where both bits are 1, 0 everywhere else
        // this will check if for the j-th number in arr[] if the i-th bit is set
        if ((arr[j] & (1 << i)) != 0) {
          count++;
        }
      }

      long totalPairs = (count * (count - 1) / 2); // total pair(set of 2) of numbers with i-th bit
                                                   // set
      long eachPairContribution = (1 << i);

      // Add contribution of i-th bit to the total sum
      sum += totalPairs * eachPairContribution;
    }

    return sum;
  }
}

//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
  public static void main(String args[]) throws IOException {
    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    int t               = Integer.parseInt(read.readLine());
    while (t-- > 0) {
      int N      = Integer.parseInt(read.readLine());
      long Arr[] = new long[N];
      String[] S = read.readLine().split(" ");
      for (int i = 0; i < N; i++)
        Arr[i] = Long.parseLong(S[i]);
      Solution ob = new Solution();
      System.out.println(ob.pairAndSum(N, Arr));
    }
  }
}

// } Driver Code Ends
