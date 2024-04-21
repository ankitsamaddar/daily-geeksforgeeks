# Three way partitioning

> Difficulty: `Easy`

> Points: **2**

Given an **array**  of size **n**  and a range [**a** , **b** ]. The task is to partition the array around the range such that the array is divided into three parts.<br />1) All elements smaller than **a**  come first.<br />2) All elements in range **a**  to **b**  come next.<br />3) All elements greater than **b**  appear in the end.<br />The individual elements of three sets can appear in any order. You are required to return the modified array.<br /><br />**Note** : The generated output is 1 if you modify the given array successfully.

**Geeky Challenge:** Solve this problem in O(n) time complexity.

**Example 1:**

**Input** :<br /> n = 5<br /> array[] = {1, 2, 3, 3, 4}<br /> [a, b] = [1, 2]<br /> **Output:**  <br />1<br /> **Explanation** : <br />One possible arrangement is: {1, 2, 3, 3, 4}. If you return a valid arrangement, output will be 1.<br />

**Example 2:**

**Input** :<br /> n = 6<br /> array[] = {1, 4, 3, 6, 2, 1}<br /> [a, b] = [1, 3]<br /> **Output** : <br />1<br /> **Explanation: <br />** One possible arrangement is: {1, 3, 2, 1, 4, 6}. If you return a valid arrangement, output will be 1.<br />

**Your Task:** <br />You don't need to read input or print anything. The task is to complete the function **threeWayPartition()**  which takes the array **array** , **a** , and **b**  as input parameters and modifies the array in place according to the given conditions.<br /><br />**Expected Time Complexity:**  O(n)<br />**Expected Auxiliary Space:**  O(1)<br /><br />**Constraints:** <br />1 <= n <= 10<sup><span style="font-size:15px">6</span></sup><br />1 <= array[i], a, b <= 10<sup>9</sup>

### Company Tags
`Yahoo`  
### Topic Tags
`Arrays`  `Sorting`  `Data Structures`  `Algorithms`
