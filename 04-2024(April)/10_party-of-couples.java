// april2024/10_party-of-couples.java
/**
 * Date  : 10-Apr-24
 * Repo  : https://github.com/ankitsamaddar/daily-geeksforgeeks
 *
 * Problem   :  Party of Couples
 * Difficulty:  🟢Easy
 *
 * GeeksforGeeks : https://www.geeksforgeeks.org/problems/alone-in-couple5507/1
 */


// User function Template for Java

class Solution {
  static int findSingle(int n, int arr[]) {
    int res = 0;

    for (int i = 0; i < arr.length; i++) {
      // XOR of two number a^a=0 .
      // So after iterating of the array only single number will be left in res
      res = res ^ arr[i];
    }
    return res;
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
      int N               = Integer.parseInt(read.readLine());
      String input_line[] = read.readLine().trim().split("\\s+");
      int arr[]           = new int[N];
      for (int i = 0; i < N; i++)
        arr[i] = Integer.parseInt(input_line[i]);

      Solution ob = new Solution();
      System.out.println(ob.findSingle(N, arr));
    }
  }
}

// } Driver Code Ends
