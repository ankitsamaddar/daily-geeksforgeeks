// 04-2024(April)/27_merge-sort-on-doubly-linked-list.java
/**
 * Date  : 27-Apr-24
 * Repo  : https://github.com/ankitsamaddar/daily-geeksforgeeks
 *
 * Problem   :  Merge Sort on Doubly Linked List
 * Difficulty:  🔴Hard
 *
 * GeeksforGeeks : https://www.geeksforgeeks.org/problems/merge-sort-on-doubly-linked-list/1
 */

import java.io.*;
import java.util.*;

// User function Template for Java

/*
class Node
{
    int data;
    Node next, prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}
*/
class Solution {
  // MERGE SORT APPROACH
  // Function to sort the given doubly linked list using Merge Sort.
  public static Node sortDoubly(Node node) {
    if (node == null || node.next == null) {
      return node;
    }

    // splitting the list into two halves.
    Node middle = getMiddle(node);

    // calling the sortDoubly function recursively for both parts separately.
    node   = sortDoubly(node);
    middle = sortDoubly(middle);

    // calling the function to merge both halves.
    return mergeSort(node, middle);
  }

  // Function to split the list into two halves.
  public static Node getMiddle(Node node) {
    // using two pointers to find the midpoint of list.
    Node fast = node;
    Node slow = node;

    // first pointer, slow moves 1 node and middle pointer,
    // fast pointer moves 2 nodes in one iteration.
    while (fast.next != null && fast.next.next != null) {
      fast = fast.next.next;
      slow = slow.next;
    }
    // slow is before the midpoint in the list, so we split the
    // list in two halves from that point.
    Node temp = slow.next;
    slow.next = null;
    return temp;
  }

  // Function to merge two halves of list.
  public static Node mergeSort(Node a, Node b) {
    // base cases when either of two halves is null.
    if (a == null) {
      return b;
    }
    if (b == null) {
      return a;
    }

    // comparing data in both halves and storing the smaller in result and
    // recursively calling the merge function for next node in result.
    if (a.data <= b.data) {
      a.next      = mergeSort(a.next, b);
      a.next.prev = a;
      a.prev      = null;
      // returning the resultant list.
      return a;
    } else {
      b.next      = mergeSort(a, b.next);
      b.next.prev = b;
      b.prev      = null;
      // returning the resultant list.
      return b;
    }
  }
}

//{ Driver Code Starts
class Node {
  int data;
  Node next, prev;

  Node(int key) {
    data = key;
    next = prev = null;
  }
}

class Driverclass {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t      = sc.nextInt();

    while (t-- > 0) {
      int n     = sc.nextInt();
      int a1    = sc.nextInt();
      Node head = new Node(a1);
      Node temp = head;

      for (int i = 1; i < n; i++) {
        int a     = sc.nextInt();
        Node n1   = new Node(a);
        n1.prev   = temp;
        temp.next = n1;
        temp      = n1;
      }

      head = new Solution().sortDoubly(head);
      printList(head);
    }
  }

  public static void printList(Node node) {
    Node temp = node;
    while (node != null) {
      System.out.print(node.data + " ");
      temp = node;
      node = node.next;
    }
    System.out.println();
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.prev;
    }
    System.out.println();
  }
}

// } Driver Code Ends
