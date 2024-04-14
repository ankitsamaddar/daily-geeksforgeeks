// 04-2024(April)/15_count-the-elements.java
/**
 * Date  : 15-Apr-24
 * Repo  : https://github.com/ankitsamaddar/daily-geeksforgeeks
 *
 * Problem   :  Count the elements
 * Difficulty:  🟢Easy
 *
 * GeeksforGeeks : https://www.geeksforgeeks.org/problems/count-the-elements1529/1
 */

// User function Template for Java

class Solution {
  public static int[] countElements(int a[], int b[], int n, int query[], int q) {
    // find max in both arrays
    int maxVal = 0;
    for (int i = 0; i < n; i++) {
      maxVal = Math.max(maxVal, Math.max(a[i], b[i]));
    }

    // create a frequency array to count the frequency of elements in b
    int[] freq = new int[maxVal + 1];
    for (int i = 0; i < n; i++) {
      freq[b[i]]++;
    }

    // calculate the prefix sum of the frequency array
    // freq[i] represents no. of elements in b that are <= i
    for (int i = 1; i <= maxVal; i++) {
      freq[i] += freq[i - 1];
    }

    // Create the result array
    // for each query index in a,
    // find in freq count of elements <= a[query[i]]
    int[] res = new int[q];
    for (int i = 0; i < q; i++) {
      res[i] = freq[a[query[i]]];
    }
    // result array
    return res;
  }
}

//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class Array {
  // Driver code
  public static void main(String[] args) throws IOException {
    // Taking input using buffered reader
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int testcases = Integer.parseInt(br.readLine());
    // looping through all testcases
    while (testcases-- > 0) {
      int n        = Integer.parseInt(br.readLine());
      String line1 = br.readLine();
      String line2 = br.readLine();
      String[] a1  = line1.trim().split("\\s+");
      String[] b1  = line2.trim().split("\\s+");
      int a[]      = new int[n];
      int b[]      = new int[n];

      for (int i = 0; i < n; i++) {
        a[i] = Integer.parseInt(a1[i]);
        b[i] = Integer.parseInt(b1[i]);
      }
      int q       = Integer.parseInt(br.readLine());
      int query[] = new int[q];
      for (int i = 0; i < q; i++) {
        query[i] = Integer.parseInt(br.readLine());
      }
      Solution ob = new Solution();
      int ans[]   = ob.countElements(a, b, n, query, q);
      for (int i = 0; i < q; i++)
        System.out.println(ans[i]);
    }
  }
}

// } Driver Code Ends
