// 04-2024(April)/21_three-way-partitioning.java
/**
 * Date  : 21-Apr-24
 * Repo  : https://github.com/ankitsamaddar/daily-geeksforgeeks
 *
 * Problem   :  Three way partitioning
 * Difficulty:  🟢Easy
 *
 * GeeksforGeeks : https://www.geeksforgeeks.org/problems/three-way-partitioning/1
 */


import java.io.*;
import java.util.*;

// User function Template for Java

class Solution {
  // Function to partition the array around the range such
  // that array is divided into three parts.

  // 3-WAY PARTITIONING APPROACH
  // Similar to dutch national-flag problem
  public void threeWayPartition(int array[], int a, int b) {
    int low  = 0;
    int mid  = 0;
    int high = array.length - 1;

    while (mid <= high) {
      // Condition 1
      // arr[mid] < a, swap elements at index mid with low,and increment
      if (array[mid] < a) {
        int temp   = array[low];
        array[low] = array[mid];
        array[mid] = temp;
        low++;
        mid++;
      }
      // Condition 2
      // a <= array[mid] <= b, mid at right position, just increment it
      else if (array[mid] >= a && array[mid] <= b)
        mid++;

      // Condition 3
      // array[mid] > b, swap elements at index mid with high, decrement high
      else if (array[mid] > b) {
        int temp    = array[mid];
        array[mid]  = array[high];
        array[high] = temp;
        high--;
      }
    }
  }
}

//{ Driver Code Starts
// Initial Template for Java
class GFG {
  public static void main(String[] args) throws IOException {
    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    int t               = Integer.parseInt(read.readLine());

    while (t-- > 0) {
      int N                    = Integer.parseInt(read.readLine());
      int array[]              = new int[N];
      Map<Integer, Integer> mp = new HashMap<>();

      String input_line[] = read.readLine().trim().split(" ");
      for (int i = 0; i < N; i++) {
        array[i] = Integer.parseInt(input_line[i]);
        if (mp.containsKey(array[i])) {
          mp.put(array[i], mp.get(array[i]) + 1);
        } else {
          mp.put(array[i], 1);
        }
      }

      input_line = read.readLine().trim().split(" ");
      int a      = Integer.parseInt(input_line[0]);
      int b      = Integer.parseInt(input_line[1]);

      int original[] = new int[N];

      for (int i = 0; i < N; i++) {
        original[i] = array[i];
      }

      int k1 = 0, k2 = 0, k3 = 0;
      int kk1 = 0;
      int kk2 = 0;
      int kk3 = 0;

      for (int i = 0; i < N; i++) {
        if (original[i] > b)
          k3++;
        else if (original[i] <= b && original[i] >= a)
          k2++;
        else if (original[i] < b)
          k1++;
      }
      Solution ob = new Solution();
      ob.threeWayPartition(array, a, b);

      for (int i = 0; i < k1; i++) {
        if (array[i] < b)
          kk1++;
      }

      for (int i = k1; i < k1 + k2; i++) {
        if (array[i] <= b && array[i] >= a)
          kk2++;
      }

      for (int i = k1 + k2; i < k1 + k2 + k3; i++) {
        if (array[i] > b)
          kk3++;
      }
      Boolean ok = false;
      if (k1 == kk1 && k2 == kk2 && k3 == kk3)
        ok = true;

      for (int i = 0; i < array.length; i++)
        mp.put(array[i], mp.get(array[i]) - 1);

      for (int i = 0; i < array.length; i++)
        if (mp.get(array[i]) != 0)
          ok = false;

      if (ok)
        System.out.println(1);
      else
        System.out.println(0);
    }
  }
}

// } Driver Code Ends
