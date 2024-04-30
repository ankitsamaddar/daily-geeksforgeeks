// 05-2024(May)/01_arrange-consonants-and-vowels.java
/**
 * Date  : 1 May
 * Repo  : https://github.com/ankitsamaddar/daily-geeksforgeeks
 *
 * Problem   :  Arrange Consonants and Vowels
 * Difficulty:  🟡Medium
 *
 * GeeksforGeeks : https://www.geeksforgeeks.org/problems/arrange-consonants-and-vowels/1
 */


import java.util.*;

/*
Structure of node class is:
class Node {
    char data;
    Node next;

    public Node(char data){
        this.data = data;
        next = null;
    }
}
*/
class Solution {
  // SIMULATION APPROACH
  public Node arrangeCV(Node head) {
    // Initialize two separate lists for vowels and consonants
    Node vowelHead     = new Node('0');
    Node consonantHead = new Node('0');

    Node vowelLast     = vowelHead;
    Node consonantLast = consonantHead;

    // Traverse the original list
    while (head != null) {
      char c = head.data;

      // If the character is a vowel, add it to the vowel list
      if (isVowel(c)) {
        vowelLast.next = head;
        vowelLast      = vowelLast.next;
      } else {
        // If the character is a consonant, add it to the consonant list
        consonantLast.next = head;
        consonantLast      = consonantLast.next;
      }

      head = head.next;
    }

    // Concatenate the consonant list at the end of the vowel list
    vowelLast.next     = consonantHead.next;
    consonantLast.next = null;

    // Return the head of the vowel list
    return vowelHead.next;
  }

  // Helper function to check if a character is a vowel
  private boolean isVowel(char c) {
    return "aeiouAEIOU".indexOf(c) != -1;
  }
}

//{ Driver Code Starts.

class Node {
  char data;
  Node next;

  public Node(char data) {
    this.data = data;
    next      = null;
  }
}

class GFG {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t      = sc.nextInt();
    while (t-- > 0) {
      int n     = sc.nextInt();
      Node head = null, tail = null;

      char head_c = sc.next().charAt(0);
      head        = new Node(head_c);
      tail        = head;

      while (n-- > 1) {
        tail.next = new Node(sc.next().charAt(0));
        tail      = tail.next;
      }

      Solution obj = new Solution();
      // show(head);
      show(obj.arrangeCV(head));
    }
  }

  public static void po(Object o) {
    System.out.println(o);
  }

  public static void show(Node head) {
    while (head != null) {
      System.out.print(head.data + " ");
      head = head.next;
    }
    System.out.println();
  }
}

// } Driver Code Ends
