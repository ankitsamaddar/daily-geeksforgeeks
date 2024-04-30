// 04-2024(April)/30_add-two-numbers-represented-by-linked-lists.java
/**
 * Date  : 30-Apr-24
 * Repo  : https://github.com/ankitsamaddar/daily-geeksforgeeks
 *
 * Problem   :  Add two numbers represented by linked lists
 * Difficulty:  🟡Medium
 *
 * GeeksforGeeks :
 * https://www.geeksforgeeks.org/problems/add-two-numbers-represented-by-linked-lists/1
 */


import java.util.*;

/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution {
  // Function to add two numbers represented by linked list.
  static Node addTwoLists(Node num1, Node num2) {
    // Reverse both the lists
    num1 = reverse(num1);
    num2 = reverse(num2);

    Node result = null; // initialize result list
    // Pointers
    Node prev = null;
    Node temp = null;
    // Sum variables
    int sum   = 0;
    int carry = 0;

    // Traverse both lists and calculate sum of the corresponding nodes
    while (num1 != null || num2 != null) {
      // Calculate sum of the nodes, also including carry
      int n1 = num1 != null ? num1.data : 0;
      int n2 = num2 != null ? num2.data : 0;
      sum    = carry + n1 + n2;
      // Update carry
      carry = (sum >= 10) ? 1 : 0;
      // update sum if carry present
      sum = sum % 10;
      // Create new node with sum as data
      temp = new Node(sum);

      // if first node, set it as head(here temp is the head)
      if (result == null) {
        result = temp;
      } else {
        prev.next = temp;
      }

      // set prev for next iteration
      prev = temp;
      // Move to next node in both the lists
      if (num1 != null)
        num1 = num1.next;
      if (num2 != null)
        num2 = num2.next;
    }
    // if carry left add it to the end
    if (carry > 0)
      temp.next = new Node(carry);

    // reverse the resultant list
    result = reverse(result);

    // skip zeros from the beginning
    while (result != null && result.data == 0) {
      result = result.next;
    }
    // return 0 if result is empty
    return (result != null) ? result : new Node(0);
  }

  static Node reverse(Node node) {
    Node prev    = null;
    Node current = node;
    Node next    = null;
    while (current != null) {
      next         = current.next;
      current.next = prev;
      prev         = current;
      current      = next;
    }
    node = prev;
    return node;
  }
}

//{ Driver Code Starts
// driver
class Node {
  int data;
  Node next;

  Node(int d) {
    data = d;
    next = null;
  }
}

class GfG {
  static void printList(Node n) {
    while (n != null) {
      System.out.print(n.data + " ");
      n = n.next;
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T      = sc.nextInt();

    while (T-- > 0) {
      int n   = sc.nextInt();
      int val = sc.nextInt();

      Node num1 = new Node(val);
      Node tail = num1;
      for (int i = 0; i < n - 1; i++) {
        val       = sc.nextInt();
        tail.next = new Node(val);
        tail      = tail.next;
      }

      int m = sc.nextInt();
      val   = sc.nextInt();

      Node num2 = new Node(val);
      tail      = num2;
      for (int i = 0; i < m - 1; i++) {
        val       = sc.nextInt();
        tail.next = new Node(val);
        tail      = tail.next;
      }

      Solution g = new Solution();
      Node res   = g.addTwoLists(num1, num2);
      printList(res);
    }
  }
}

// } Driver Code Ends
