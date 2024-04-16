# Minimize the Difference

> Difficulty: `Medium`

> Points: **4**

You are given an array **arr**  of size **n** . You have to remove a **subarray** of size **k**  , such that the difference between the maximum and minimum values of the **remaining array**  is **minimized** . <br />Find the **minimum**  value obtained after performing the operation of the removal of the subarray and return it.

**Example 1:**

**Input** :<br />n = 5<br />k = 3<br />arr = {1, 2, 3, 4, 5}<br />**Output:**  <br />1<br />**Explanation:**  <br />We can remove first subarray of length 3(i.e. {1, 2, 3}) then remaining array will be {4,5} and the difference of maximum and minimum element will be<br /><br />**1**  i.e 5 - 4 = **1** 

**Example 2:**

**Input** :<br />n = 6<br />k = 3<br />arr = {2, 3, 1, 4, 6, 7}<br />**Output:**  <br />2<br />**Explanation:** <br />If we remove the subarray {2,3,1} then remaining array will be {4,6,7} and the difference = 7-4 = 3<br />If we remove the subarray {3,1,4} then remaining array will be {2,6,7} and the difference = 7-2 = 5<br />If we remove the subarray {1,4,6} then remaining array will be {2,3,7} and the difference = 7-2 = 5<br />If we remove the subarray {4,6,7} then remaining array will be {2,3,1} and the difference = 3-1 = 2<br />So the answer will be min(3,5,5,2) = **2** 

**Your Task: <br />** You have to complete the function **minimizeDifference( )** , which takes two integers **n**  and **k**  and an integer array **arr**  of size n. You have to return the **minimum difference**  of maximum and minimum elements of the remaining array after removing one k length subarray of it.

**Expected Time Complexity:**  O(n)<br style="font-size:18px">**Expected Auxiliary Space:**  O(n)

**Constraints:<br />** 2 <= n <= 10<sup>5</sup><br />1 <= k <= n-1<br />0 <= arr[i] <= 10<sup>9</sup>

### Topic Tags
`Map`  `Arrays`  `Data Structures`
