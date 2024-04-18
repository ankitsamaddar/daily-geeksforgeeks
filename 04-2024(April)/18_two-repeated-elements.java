// 04-2024(April)/18_two-repeated-elements.java
/**
 * Date  : 18-Apr-24
 * Repo  : https://github.com/ankitsamaddar/daily-geeksforgeeks
 *
 * Problem   :  Two Repeated Elements
 * Difficulty:  🟡Medium
 *
 * GeeksforGeeks : https://www.geeksforgeeks.org/problems/two-repeated-elements-1587115621/1
 */


import java.io.*;

// User function template for JAVA

class Solution {
  // Function to find two repeated elements.
  public int[] twoRepeated(int arr[], int n) {
    int[] res = new int[2];
    int k     = 0;
    // Traverse the array
    for (int i = 0; i < n + 2; i++) {
      // if the element is not visited, mark it as -ve, visited
      if (arr[Math.abs(arr[i])] > 0) {
        arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
      }
      // if already visited it is a duplicate
      else {
        res[k++] = Math.abs(arr[i]);
      }
    }

    return res;
  }
}

//{ Driver Code Starts
// Initial template for JAVA
class GFG {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t             = Integer.parseInt(br.readLine());
    for (int i = 0; i < t; i++) {
      int n         = Integer.parseInt(br.readLine());
      String l      = br.readLine();
      String[] sarr = l.split(" ");
      int[] arr     = new int[sarr.length];
      for (int i1 = 0; i1 < arr.length; i1++) {
        arr[i1] = Integer.parseInt(sarr[i1]);
      }

      Solution obj = new Solution();

      int[] res = obj.twoRepeated(arr, n);
      System.out.println(res[0] + " " + res[1]);
    }
  }
}

// } Driver Code Ends
