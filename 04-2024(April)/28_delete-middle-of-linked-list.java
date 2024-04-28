// 04-2024(April)/28_delete-middle-of-linked-list.java
/**
 * Date  : 28-Apr-24
 * Repo  : https://github.com/ankitsamaddar/daily-geeksforgeeks
 *
 * Problem   :  Delete Middle of Linked List
 * Difficulty:  🟢Easy
 *
 * GeeksforGeeks : https://www.geeksforgeeks.org/problems/delete-middle-of-linked-list/1
 */

import java.io.*;
import java.util.*;

/*
class Node {
    int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution {
  Node deleteMid(Node head) {
    // If the linked list is empty or contains a single element, return NULL.
    if (head == null || head.next == null) {
      return null;
    }

    // Initialize two pointers, slow and fast, at the head of the linked list.
    Node slow = head;
    Node fast = head;

    // Initialize a variable to keep track of the previous node of the slow pointer.
    Node prev = null;

    // Move the fast pointer two steps at a time and the slow pointer one step at a time.
    // When the fast pointer reaches the end of the linked list, the slow pointer will be at the
    // middle of the linked list.
    while (fast != null && fast.next != null) {
      fast = fast.next.next;
      prev = slow;
      slow = slow.next;
    }

    // Delete the middle node by skipping it in the linked list.
    prev.next = slow.next;

    // Return the head of the modified linked list.
    return head;
  }
}


//{ Driver Code Starts
class Node {
  int data;
  Node next;

  Node(int x) {
    data = x;
    next = null;
  }
}

class GFG {
  static void printList(Node node) {
    while (node != null) {
      System.out.print(node.data + " ");
      node = node.next;
    }
    System.out.println();
  }

  public static void main(String args[]) throws IOException {
    Scanner sc = new Scanner(System.in);
    int t      = sc.nextInt();
    while (t > 0) {
      int n     = sc.nextInt();
      Node head = new Node(sc.nextInt());
      Node tail = head;
      for (int i = 0; i < n - 1; i++) {
        tail.next = new Node(sc.nextInt());
        tail      = tail.next;
      }
      Solution g = new Solution();
      head       = g.deleteMid(head);
      printList(head);
      t--;
    }
  }
}

// } Driver Code Ends
