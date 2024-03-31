// april2024/01_pairs-violating-the-bst-property.java
/**
 * Date  : 01-Apr-24
 * Repo  : https://github.com/ankitsamaddar/
 *
 * Problem   :  Pairs violating the BST property
 * Difficulty:  🟡Medium
 *
 * GeeksforGeeks : https://www.geeksforgeeks.org/problems/pairs-violating-bst-property--212515/1
 */

import java.io.*;
import java.util.*;

/*

Definition for Binary Tree Node
class Node
{
    int data;
    Node left;
    Node right;

    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {

    public static int pairsViolatingBST(int n, Node root) {
        int count = 0;

        ArrayList<Integer> inOrder = new ArrayList<>();

        // Do in orderTraversal
        // left -> root -> right
        Stack<Node> st = new Stack<>();

        while(root!=null || st.size()!=0) {
            // iterate to the leftmost node
            while(root != null){
                st.push(root);
                root = root.left;
            }
            // visit the leftmost node
            // it is now the top of the stack
            root = st.pop();
            // save the left mode node data
            inOrder.add(root.data);
            // visit right node
            root = root.right;
        }

    // In BST every node, strictly greater than left subtree, and strictly less than right subtree
    // check each pair of nodes
    for(int i=0;i<inOrder.size();i++) {
        for(int j=i+1;j<inOrder.size();j++) {
            // if any previous left node was greater than current node
            // increment count
            if(inOrder.get(i)>=inOrder.get(j)) {
                count++;
            }
        }
    }
    // Total violations
    return count;

    }


}

//{ Driver Code Starts

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }

    public static Node buildTree(String str) {
        // Corner Case
        if (str.length() == 0 || str.charAt(0) == 'N') return null;

        // Creating array of Strings from input
        // String after spliting by space
        String ip[] = str.split(" ");

        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));

        // Push the root to the queue
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        // Starting from the second element
        int i = 1;
        while (queue.size() > 0 && i < ip.length) {

            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();

            // Get the current node's value from the string
            String currVal = ip[i];

            // If the left child is not null
            if (!currVal.equals("N")) {

                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }

            // For the right child
            i++;
            if (i >= ip.length) break;

            currVal = ip[i];

            // If the right child is not null
            if (!currVal.equals("N")) {

                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));

                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }

        return root;
    }

    public static Node inputTree(BufferedReader br) throws IOException {
        return buildTree(br.readLine().trim());
    }

    public static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int n;
            n = Integer.parseInt(br.readLine());

            Node root = Node.inputTree(br);

            Solution obj = new Solution();
            int res = obj.pairsViolatingBST(n, root);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends
