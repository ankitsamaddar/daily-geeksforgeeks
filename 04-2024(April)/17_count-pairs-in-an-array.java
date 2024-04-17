// 04-2024(April)/17_count-pairs-in-an-array.java
/**
 * Date  : 17-Apr-24
 * Repo  : https://github.com/ankitsamaddar/daily-geeksforgeeks
 *
 * Problem   :  Count Pairs in an Array
 * Difficulty:  🔴Hard
 *
 * GeeksforGeeks : https://www.geeksforgeeks.org/problems/count-pairs-in-an-array4145/1
 */


import java.io.*;

// User function Template for Java
class Solution {
  // MERGE SORT - TWO POINTERS
  static int countPairs(int[] arr, int n) {
    // Pre-compute the values i * arr[i]
    for (int i = 0; i < n; i++)
      arr[i] = i * arr[i];

    // merge sort and count the number of pairs
    return mergeSortAndCount(arr, 0, n - 1);
  }


  static int mergeSortAndCount(int[] arr, int lo, int hi) {
    int count = 0;
    // if lo < hi, Calculate mid, call itself on the two halves of the array
    // arr[lo...mid] and arr[mid+1...hi], and adds the counts.
    if (lo < hi) {
      int mid = lo + (hi - lo) / 2;
      count += mergeSortAndCount(arr, lo, mid);
      count += mergeSortAndCount(arr, mid + 1, hi);

      // Merge the two sorted halves
      int[] temp = new int[hi - lo + 1];
      int i = lo, j = mid + 1, k = 0;

      while (i <= mid && j <= hi) {
        // if arr[i] is less than or equal to arr[j] add it to temp
        if (arr[i] <= arr[j])
          temp[k++] = arr[i++];

        // if arr[j] is less add it to temp
        // it means there are mid+1-i pairs, where arr[i] < arr[j],
        // because the left half is sorted, so add (mid+1+i) to the count
        else {
          count += mid + 1 - i;
          temp[k++] = arr[j++];
        }
      }
      // Copy the remaining left half
      while (i <= mid)
        temp[k++] = arr[i++];
      // Copy the remaining right half
      while (j <= hi)
        temp[k++] = arr[j++];
      // Copy sorted temp[] array back to original arr[]
      for (i = lo, j = 0; j <= hi - lo; i++)
        arr[i] = temp[j++];
    }
    return count;
  }
}


//{ Driver Code Starts
// Initial Template for Java
class GFG {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t             = Integer.parseInt(br.readLine().trim());
    while (t-- > 0) {
      int n              = Integer.parseInt(br.readLine().trim());
      int[] a            = new int[n];
      String[] inputLine = br.readLine().trim().split(" ");
      for (int i = 0; i < n; i++) {
        a[i] = Integer.parseInt(inputLine[i]);
      }

      Solution obj = new Solution();
      System.out.println(obj.countPairs(a, n));
    }
  }
}

// } Driver Code Ends
