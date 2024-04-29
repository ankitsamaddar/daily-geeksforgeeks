# Remove every kth node

> Difficulty: `Easy`

> Points: **2**

Given a singly linked list having **n**  nodes, your task is to remove every **k<sup>th</sup>**  node from the linked list.

**Example 1:**

**Input:<br />** n = 8<br />linked list: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8 <br />k = 2<br />**Output:**  <br />1 -> 3 -> 5 -> 7<br />**Explanation:**  <br />After removing every 2nd node of the linked list, the resultant linked list will be: 1 -> 3 -> 5 -> 7.

**Example 2:**

**Input:<br />** n = 10<br />linked list: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8 -> 9 -> 10 <br />k = 3<br />**Output:**  <br />1 -> 2 -> 4 -> 5 -> 7 -> 8 -> 10<br />**Explanation:**  <br />After removing every 3rd node of the linked list, the resultant linked list will be: 1 -> 2 -> 4 -> 5 -> 7 -> 8 -> 10.

**Your Task:** <br />The task is to complete the function **deleteK()**  which takes **head**  of linked list and integer **k**  as input parameters and delete every **k<sup>th</sup>**  node from the linked list and return its head.

**Expected Time Complexity :**  **** O(n)<br />**Expected Auxiliary Space :** O(1)

**Constraints:** <br />1 <= n <= 10<sup>5</sup><br />-10<sup>9</sup> <= elements of linked list <= 10<sup>9</sup><br />1 <= k <= n

### Topic Tags
`Linked List`  `Data Structures`
