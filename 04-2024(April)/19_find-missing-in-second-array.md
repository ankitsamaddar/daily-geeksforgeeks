# Find missing in second array

> Difficulty: `Easy`

> Points: **2**

Given two integer arrays **a**  of size **n**  and **b**  of size **m** , the task is to find the numbers which are present in the first array **a** , but not present in the second array **b** .

**Note:**  Numbers to be returned should in order as they appear in array **a** .

**Example 1:**

**Input: <br />** n = 6, m = 5<br /> a[] = {1, 2, 3, 4, 5, 10}<br /> b[] = {2, 3, 1, 0, 5}<br /> **Output:**  <br />4 10<br /> **Explanation** : <br />4 and 10 are present in first array, but not in second array.

**Example 2:**

**Input: <br />** n = 5, m = 5<br /> a[] = {4, 3, 5, 9, 11}<br /> b[] = {4, 9, 3, 11, 10}<br /> **Output: <br />** 5<br /> **Explanation** : <br />Second array does not contain element 5.<br />

**Your Task:** <br />You don't need to take any input, as it is already accomplished by the driver code. You just need to complete the function **findMissing()**  that takes an integer array **a,**  an integer array **b,**  an integer **n,** and an integer **m**  as input parameters and returns an array that contains the missing elements and the order of the elements should be the same as they are in array **a** .

**Expected Time Complexity:**  O(n+m).<br />**Expected Auxiliary Space:**  O(m).

**Constraints:** <br />1 ≤ n, m ≤ 10<sup>5</sup><br />-10<sup>9</sup> ≤ A[i], B[i] ≤ 10<sup>9</sup>

### Company Tags
`Zoho`  `Accolite`  `Microsoft`  `Snapdeal`  
### Topic Tags
`Arrays`  `Hash`  `Data Structures`
