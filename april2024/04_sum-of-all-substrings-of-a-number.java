// april2024/04_sum-of-all-substrings-of-a-number.java
/**
 * Date  : 04-Apr-24
 * Repo  : https://github.com/ankitsamaddar/
 *
 * Problem   :  Sum of all substrings of a number
 * Difficulty:  🟢Easy
 *
 * GeeksforGeeks :
 * https://www.geeksforgeeks.org/problems/sum-of-all-substrings-of-a-number-1587115621/1
 */


import java.util.*;

/*
EXPLANATION :
s = "1234"
index -> digit -> possible patterns -> sum  -> equation
0     ->   1   -> 1                 -> 1    -> 1
1     ->   2   -> 12 2              -> 14   -> (2*2) + (10*1)
2     ->   3   -> 123 23 3          -> 149  -> (3*3) + (10*14)
3     ->   4   -> 1234, 234, 34, 4  -> 1506 -> (4*4) + (10*149)

So for every digit at index i the sum is = (i+1)*digit + (10*prevIndexSum)
*/

// User function Template for Java
class Solution {
  // Function to find sum of all possible substrings of the given string.
  public static long sumSubstrings(String s) {
    final int MOD     = (int) Math.pow(10, 9) + 7;
    long totalSum     = 0;
    char[] str        = s.toCharArray();
    long[] sumAtIndex = new long[str.length];

    sumAtIndex[0] = totalSum = (str[0] - '0'); // first digit appears only once

    for (int i = 1; i < str.length; i++) {
      int curDigit          = str[i] - '0';
      long curContribution  = (i + 1) * (long) curDigit; // contribution of current digit in sum
      long prevContribution = (10 * sumAtIndex[i - 1]);  // previous index sum contribution
      // sum at current index
      sumAtIndex[i] = (curContribution + prevContribution) % MOD;
      // add current sum to total sum
      totalSum = (totalSum + sumAtIndex[i]) % MOD;
    }

    return totalSum;
  }
}

//{ Driver Code Starts
// Initial Template for Java

/*package whatever //do not write package name here */
class GFG {
  public static void main(String[] args) {
    // taking input using Scanner class
    Scanner sc = new Scanner(System.in);

    // taking total testcases
    int t = sc.nextInt();
    sc.nextLine();
    while (t-- > 0) {
      // taking the String
      String s    = sc.nextLine();
      Solution ob = new Solution();
      // calling method sumSubstrings()
      System.out.println(ob.sumSubstrings(s));
    }
  }
}

// } Driver Code Ends
