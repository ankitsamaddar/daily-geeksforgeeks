// 04-2024(April)/11_gray-to-binary-equivalent.java
/**
 * Date  : 11-Apr-24
 * Repo  : https://github.com/ankitsamaddar/daily-geeksforgeeks
 *
 * Problem   :  Gray to Binary equivalent
 * Difficulty:  🟡Medium
 *
 * GeeksforGeeks : https://www.geeksforgeeks.org/problems/gray-to-binary-equivalent-1587115620/1
 */


// User function Template for Java

class Solution {
  // function to convert a given Gray equivalent n to Binary equivalent.

  // Gray code is a binary numeral system where two successive values differ in only one bit.
  // This means that each bit in the Gray code is formed by taking the XOR of the corresponding bit
  // in the binary number and the bit to its right in the binary number.
  public static int grayToBinary(int n) {
    int ans = n;
    // Right Shift(>>) will remove the MSB to the next bit ; As ans = n, so XOR with corresponding
    // bit Right shift n by 1 and XOR it to ans until n becomes zero
    while (n != 0) {
      n   = n >> 1;
      ans = ans ^ n;
    }
    // return binary equivalent of gray code
    return ans;
  }
}


//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t      = sc.nextInt(); // testcases
    while (t-- > 0) {
      int n = sc.nextInt(); // initializing n

      Solution obj = new Solution();

      // calling grayToBinary() function
      System.out.println(obj.grayToBinary(n));
    }
  }
}

// } Driver Code Ends
