# Delete Middle of Linked List

> Difficulty: `Easy`

> Points: **2**

Given a singly linked list, delete **middle** of the linked list. For example, if given linked list is 1->2->**3** ->4->5 then linked list should be modified to 1->2->4->5.<br />If there are **even**  nodes, then there would be **two middle** nodes, we need to delete the **second middle element** . For example, if given linked list is 1->2->**3** ->**4** ->5->6 then it should be modified to 1->2->3->5->6.<br />If the input linked list has **single**  node, then it should return **NULL.**

**Example 1:**

**Input:<br />** LinkedList: 1->2->3->4->5<br /> **Output: <br />** 1 2 4 5<br />

**Example 2:**

**Input:<br />** LinkedList: 2->4->6->7->5->1<br /> **Output: <br />** 2 4 6 5 1

**Your Task:** <br />The task is to complete the function **deleteMid** () which takes head of the linkedlist  and return head of the linkedlist with **middle element deleted**  from the linked list. If the linked list is **empty**  or contains **single**  element then it should return **NULL** .

**Expected Time Complexity:** O(n).<br />**Expected Auxiliary Space:** O(1).

**Constraints:** <br />1 <= n <= 10<sup>5</sup><br />1 <= value[i] <= 10<sup>9</sup>

### Company Tags
`Flipkart`  `Amazon`  `Microsoft`  
### Topic Tags
`Linked List`  `two-pointer-algorithm`  `Data Structures`  `Algorithms`
