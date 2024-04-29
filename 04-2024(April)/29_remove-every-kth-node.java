// 04-2024(April)/29_remove-every-kth-node.java
/**
 * Date  : 29-Apr-24
 * Repo  : https://github.com/ankitsamaddar/daily-geeksforgeeks
 *
 * Problem   :  Remove every kth node
 * Difficulty:  🟢Easy
 *
 * GeeksforGeeks : https://www.geeksforgeeks.org/problems/remove-every-kth-node/1
 */

import java.util.*;

/* Link list Node
class Node
{
  Node next;
  int data;
  Node(int d)
  {
    data = d;
    next = null;
  }
}*/

class Solution {
  // SIMULATION APPROACH
  Node delete(Node head, int k) {
    // If the linked list is empty or k is 1
    if (head == null || k == 1)
      return null;

    // Initialize count to 1
    int count = 1;

    // Initialize prev and curr to head
    Node prev = head;
    Node curr = head;

    // Traverse the linked list
    while (curr != null) {
      // If count is a multiple of k, remove the node
      if (count % k == 0) {
        // remove the current node
        prev.next = curr.next;
      }

      // Update prev if no node is removed
      if (count % k != 0) {
        prev = curr;
      }

      // Move to the next node
      curr = curr.next;

      // Increment count
      count++;
    }

    // Return the head of the modified linked list
    return head;
  }
}

//{ Driver Code Starts
class Node {
  Node next;
  int data;

  Node(int d) {
    data = d;
    next = null;
  }
}

class Delete_Kth_Node {
  Node head;
  Node tail;

  void addToTheLast(Node node) {
    if (head == null) {
      head = node;
      tail = node;
    } else {
      tail.next = node;
      tail      = tail.next;
    }
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int t      = sc.nextInt();
    while (t > 0) {
      int n                = sc.nextInt();
      Delete_Kth_Node list = new Delete_Kth_Node();
      // int n=Integer.parseInt(br.readLine());
      int a1    = sc.nextInt();
      Node head = new Node(a1);
      list.addToTheLast(head);
      for (int i = 1; i < n; i++) {
        int a = sc.nextInt();
        list.addToTheLast(new Node(a));
      }
      int k = sc.nextInt();
      // System.out.println(list.head.data+" "+ k);
      list.head = new Solution().delete(list.head, k);
      Node temp = list.head;
      while (temp != null) {
        System.out.print(temp.data + " ");
        temp = temp.next;
      }
      System.out.println();
      t--;
    }
  }
}

// } Driver Code Ends
