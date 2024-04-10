// april2024/03_kth-common-ancestor-in-bst.java
/**
 * Date  : 03-Apr-24
 * Repo  : https://github.com/ankitsamaddar/
 *
 * Problem   :  Kth common ancestor in BST
 * Difficulty:  🟡Medium
 *
 * GeeksforGeeks : https://www.geeksforgeeks.org/problems/kth-common-ancestor-in-bst/1
 */

import java.io.*;
import java.util.*;

// User function Template for Java
class Solution {
  public int kthCommonAncestor(Node root, int k, int x, int y) {
    ArrayList<Integer> al = new ArrayList<>(); // to store ancestor  list
    Node ancestor         = lca(root, x, y);   // get LCA for x and y

    // get the ancestors of the lca
    findAncestor(root, ancestor, al);
    // last element is the LCA, so k-th index from last
    int index = al.size() - k;
    // if index is less than 0 return -1, no valid ancestor
    // return kth ancestor
    return index < 0 ? -1 : al.get(index);
  }

  // Find all ancestors from root
  void findAncestor(Node root, Node lca, ArrayList<Integer> al) {
    while (root != null) {
      al.add(root.data);

      // reached lca, return
      if (root.data == lca.data) {
        return;
      }

      // if lca.data is less traverse left subtree
      if (root.data > lca.data) {
        root = root.left;
      }
      // else traverse right subtree
      else {
        root = root.right;
      }
    }
  }
  // find the lowest common ancestor of x and y
  Node lca(Node root, int x, int y) {
    // base
    if (root == null) {
      return null;
    }
    int data = root.data;
    // if both x and y less than root search left subtree
    if (x < data && y < data) {
      return lca(root.left, x, y);
    }
    // if both x and y is more than root search right subtree
    if (x > data && y > data) {
      return lca(root.right, x, y);
    }
    // then one element in left subtree and one in right subtree,it is the ancestor, so return root
    return root;
  }
}
// Solution Ends

//{ Driver Code Starts
class Node {
  int data;
  Node left;
  Node right;

  public Node(int d) {
    data = d;
    left = right = null;
  }
}

public class GFG {
  static Node buildTree(String str) {
    // Corner Case
    if (str.length() == 0 || str.equals('N'))
      return null;
    String[] s = str.split(" ");

    Node root     = new Node(Integer.parseInt(s[0]));
    Queue<Node> q = new LinkedList<Node>();
    q.add(root);

    // Starting from the second element
    int i = 1;
    while (!q.isEmpty() && i < s.length) {
      // Get and remove the front of the queue
      Node currNode = q.remove();

      // Get the curr node's value from the string
      String currVal = s[i];

      // If the left child is not null
      if (!currVal.equals("N")) {
        // Create the left child for the curr node
        currNode.left = new Node(Integer.parseInt(currVal));

        // Push it to the queue
        q.add(currNode.left);
      }

      // For the right child
      i++;
      if (i >= s.length)
        break;
      currVal = s[i];

      // If the right child is not null
      if (!currVal.equals("N")) {
        // Create the right child for the curr node
        currNode.right = new Node(Integer.parseInt(currVal));

        // Push it to the queue
        q.add(currNode.right);
      }

      i++;
    }

    return root;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t             = Integer.parseInt(br.readLine().trim());
    while (t > 0) {
      String s  = br.readLine().trim();
      Node root = buildTree(s);

      String[] snums = br.readLine().split(" ");
      int k          = Integer.parseInt(snums[0]);
      int x          = Integer.parseInt(snums[1]);
      int y          = Integer.parseInt(snums[2]);

      Solution T = new Solution();
      // Call the function with the needed parameters
      System.out.println(T.kthCommonAncestor(root, k, x, y));

      t--;
    }
  }
}

// } Driver Code Ends
