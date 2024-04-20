# Union of Two Sorted Arrays

> Difficulty: `Medium`

> Points: **4**

Given two sorted arrays of size **n**  and **m**  respectively, find their union. The Union of two arrays can be defined as the **common** and **distinct** elements in the two arrays. Return the elements in **sorted**  order.

**Example 1:**

**Input** :<br /> n = 5, arr1[] = {1, 2, 3, 4, 5}<br /> m = 5, arr2 [] = {1, 2, 3, 6, 7}<br /> **Output** : <br />1 2 3 4 5 6 7<br /> **Explanation** : <br />Distinct elements including both the arrays are: 1 2 3 4 5 6 7.

**Example 2:**

**Input** :<br /> n = 5, arr1[] = {2, 2, 3, 4, 5}<br /> m = 5, arr2[] = {1, 1, 2, 3, 4}<br /> **Output** : <br />1 2 3 4 5<br /> **Explanation** : <br />Distinct elements including both the arrays are: 1 2 3 4 5.

**Example 3:**

**Input** :<br /> n = 5, arr1[] = {1, 1, 1, 1, 1}<br /> m = 5, arr2[] = {2, 2, 2, 2, 2}<br /> **Output** : <br />1 2<br /> **Explanation** : <br />Distinct elements including both the arrays are: 1 2.

**Your Task:** <br />You do not need to read input or print anything. Complete the function **findUnion()** that takes two arrays **arr1[]** , **arr2[],**  and their size **n** and **m** as input parameters and returns a list containing the **union of the two arrays** .

**Expected Time Complexity:** O(n+m).<br />**Expected Auxiliary Space:** O(n+m).

**Constraints:** <br />1 <= n, m <= 10<sup>5</sup><br />-10<sup>9</sup> <= arr1[i], arr2[i] <= 10<sup>9</sup>

### Company Tags
`Amazon`  
### Topic Tags
`Arrays`  `Data Structures`  `two-pointer-algorithm`
