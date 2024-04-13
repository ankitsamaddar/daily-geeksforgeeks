// 04-2024(April)/13_reverse-bits.java
/**
 * Date  : 13-Apr-24
 * Repo  : https://github.com/ankitsamaddar/daily-geeksforgeeks
 *
 * Problem   :  Reverse Bits
 * Difficulty:  🟢Easy
 *
 * GeeksforGeeks : https://www.geeksforgeeks.org/problems/reverse-bits3556/1
 */


// User function Template for Java

class Solution {
  static Long reversedBits(Long x) {
    long result = 0;

    for (int i = 0; i < 32; i++) {
      // check if i-th bit set
      if ((x & (1 << i)) != 0) {
        // set bit at 31 - i th position
        // OR will git 1 if any 1 bit or both bit is set
        // L is suffix to specify 1 of type long
        result = result | (1L << (31 - i));
      }
    }

    // return the reversed number
    return result;
  }
};


//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
  public static void main(String args[]) throws IOException {
    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    int t               = Integer.parseInt(read.readLine());
    while (t-- > 0) {
      Long X = Long.parseLong(read.readLine());

      Solution ob = new Solution();
      System.out.println(ob.reversedBits(X));
    }
  }
}

// } Driver Code Ends
