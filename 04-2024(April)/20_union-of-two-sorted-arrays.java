// 04-2024(April)/20_union-of-two-sorted-arrays.java
/**
 * Date  : 20-Apr-24
 * Repo  : https://github.com/ankitsamaddar/daily-geeksforgeeks
 *
 * Problem   :  Union of Two Sorted Arrays
 * Difficulty:  🟡Medium
 *
 * GeeksforGeeks : https://www.geeksforgeeks.org/problems/union-of-two-sorted-arrays-1587115621/1
 */


import java.io.*;
import java.util.*;

// User function Template for Java

// arr1,arr2 : the arrays
//  n, m: size of arrays
class Solution {
  // Function to return a list containing the union of the two arrays.
  public static List<Integer> findUnion(int[] arr1, int[] arr2, int n, int m) {
    // TreeSet sorts in ascending order
    Set<Integer> union = new TreeSet<>();

    // Add all elements of the first array to the union.
    for (int i = 0; i < n; i++) {
      union.add(arr1[i]);
    }

    // Add all elements of the second array to the union.
    for (int j = 0; j < m; j++) {
      union.add(arr2[j]);
    }

    // Convert the LinkedHashSet to an ArrayList and return it.
    return new ArrayList<>(union);
  }
}

//{ Driver Code Starts
// Initial Template for Java
class Main {
  public static void main(String args[]) throws IOException {
    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    int t               = Integer.parseInt(read.readLine());

    while (t-- > 0) {
      String st[] = read.readLine().trim().split(" ");
      int N       = Integer.parseInt(st[0]);
      int M       = Integer.parseInt(st[1]);

      int arr1[] = new int[N];
      int arr2[] = new int[M];

      st = read.readLine().trim().split(" ");
      for (int i = 0; i < N; i++)
        arr1[i] = Integer.parseInt(st[i]);

      st = read.readLine().trim().split(" ");
      for (int i = 0; i < M; i++)
        arr2[i] = Integer.parseInt(st[i]);

      Solution obj           = new Solution();
      ArrayList<Integer> res = new ArrayList<Integer>();
      res                    = obj.findUnion(arr1, arr2, N, M);
      for (int i = 0; i < res.size(); i++)
        System.out.print(res.get(i) + " ");
      System.out.println();
    }
  }
}

// } Driver Code Ends
