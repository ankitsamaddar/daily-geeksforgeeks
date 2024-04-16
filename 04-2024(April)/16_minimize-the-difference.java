// 04-2024(April)/16_minimize-the-difference.java
/**
 * Date  : 16-Apr-24
 * Repo  : https://github.com/ankitsamaddar/daily-geeksforgeeks
 *
 * Problem   :  Minimize the Difference
 * Difficulty:  🟡Medium
 *
 * GeeksforGeeks : https://www.geeksforgeeks.org/problems/minimize-the-difference/1
 */

import java.io.*;
import java.util.*;

class Solution {
  // SLIDING WINDOW APPROACH
  public static int minimizeDifference(int n, int k, int[] arr) {
    // Store the max and min values
    int[] postMax = new int[n];
    int[] postMin = new int[n];

    // Initialize the values for the last element
    postMax[n - 1] = arr[n - 1];
    postMin[n - 1] = arr[n - 1];

    // Calculate max and min values from backwards
    for (int i = n - 2; i >= 0; i--) {
      postMax[i] = Math.max(arr[i], postMax[i + 1]);
      postMin[i] = Math.min(arr[i], postMin[i + 1]);
    }

    // min difference with the initial k elements
    int minDiff = postMax[k] - postMin[k];

    int pMin = arr[0];
    int pMax = arr[0];

    // Calculate min difference
    for (int i = 1; i < n - k; i++) {
      int curMinDiff = Math.max(pMax, postMax[i + k]) - Math.min(pMin, postMin[i + k]);
      minDiff    = Math.min(minDiff, curMinDiff);
      pMax       = Math.max(arr[i], pMax);
      pMin       = Math.min(arr[i], pMin);
    }

    // Update min diff with the remaining elements, from the beginning
    minDiff = Math.min(minDiff, pMax - pMin);

    return minDiff;
  }
}


///{ Driver Code Starts
class IntArray {
  public static int[] input(BufferedReader br, int n) throws IOException {
    String[] s = br.readLine().trim().split(" ");
    int[] a    = new int[n];
    for (int i = 0; i < n; i++)
      a[i] = Integer.parseInt(s[i]);

    return a;
  }

  public static void print(int[] a) {
    for (int e : a)
      System.out.print(e + " ");
    System.out.println();
  }

  public static void print(ArrayList<Integer> a) {
    for (int e : a)
      System.out.print(e + " ");
    System.out.println();
  }
}

class GFG {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t;
    t = Integer.parseInt(br.readLine());
    while (t-- > 0) {
      int n;
      n = Integer.parseInt(br.readLine());


      int k;
      k = Integer.parseInt(br.readLine());


      int[] arr = IntArray.input(br, n);

      Solution obj = new Solution();
      int res      = obj.minimizeDifference(n, k, arr);

      System.out.println(res);
    }
  }
}

// } Driver Code Ends
