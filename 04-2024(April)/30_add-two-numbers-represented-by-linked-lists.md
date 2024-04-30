# Add two numbers represented by linked lists

> Difficulty: `Medium`

> Points: **4**

Given two numbers, **num1**  and **num2** , represented by linked lists of size **n**  and **m** respectively. The task is to return a linked list that represents the sum of these two numbers.

For example, the number **190**  will be represented by the linked list, **1->9->0->null,** similarly **25** by **2->5->null.** Sum of these two numbers is 190 + 25 = **215,** which will be represented by **2->1->5->null.** You are required to return the head of the linked list **2->1->5->null.**

**Note:** There can be leading zeros in the input lists, but there should not be any leading zeros in the output list.

**Example 1:**

**Input:<br />** n = 2<br /> num1 = 45 (4->5->null)<br /> m = 3<br /> num2 = 345 (3->4->5->null)<br /> **Output: <br />** 3->9->0->null <br /><br />**Explanation: <br />** For the given two linked list (4 5) and (3 4 5), after adding the two linked list resultant linked list will be (3 9 0).

**Example 2:**

**Input:<br />** n = 4<br /> num1 = 0063 (0->0->6->3->null)<br /> m = 2<br /> num2 = 07 (0->7->null)<br /> **Output: <br />** 7->0->null<br /> **Explanation: <br />** For the given two linked list (0 0 6 3) and (0 7), after adding the two linked list resultant linked list will be (7 0).

**Your Task:** <br />The task is to complete the function **addTwoLists()**  which has node reference of both the linked lists and returns the head of the sum list.

**Expected Time Complexity:** O(n+m)<br />**Expected Auxiliary Space:** O(max(n,m)) for the resultant list.

**Constraints:** <br />1 <= n, m <= 10<sup>4</sup>

### Company Tags
`Flipkart`  `Morgan Stanley`  `Accolite`  `Amazon`  `Microsoft`  `Snapdeal`  `MakeMyTrip`  `Qualcomm`  
### Topic Tags
`Linked List`  `Data Structures`
