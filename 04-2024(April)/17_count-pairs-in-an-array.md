# Count Pairs in an Array

> Difficulty: `Hard`

> Points: **8**

Given an array **arr**  of **n**  integers, count all pairs (**arr[i]** , **arr[j]** ) in it such that **i\*arr[i]**  > **j\*arr[j]** and **0 ≤ i < j < n** .

**Note** : 0-based Indexing is followed.

**Example 1:**

**Input :** <br /> n = 4<br />arr[] = {8, 4, 2, 1}<br /> **Output :** <br /> 2<br />**Explanation:<br />** If we see the array after operations<br />[0\*8, 1\*4, 2\*2, 3\*1] => [0, 4, 4, 3]<br />Pairs which hold the condition i\*arr[i] > j\*arr[j] are (4,1) and (2,1), so in total 2 pairs are available.

**Example 2:**

**Input :** <br /> n = 7<br />arr[] = {5, 0, 10, 2, 4, 1, 6}<br /> **Output:** <br /> 5<br /> **Explanation :** <br /> Pairs which hold the condition i\*arr[i] > j\*arr[j] are (10,2), (10,4), (10,1), (2,1) and (4,1), so in total 5 pairs are there.

**Your Task:** <br />You don't need to read input or print anything. Your task is to complete the function **countPairs()**  which takes the array **arr[]**  and its size **n**  as inputs and returns the required result.

**Expected Time Complexity:** O(n\*log(n))<br />**Expected Auxiliary Space:** O(n\*log(n))

**Constraints:** <br />1**≤**  n **≤** 10<sup>4</sup><br />0 ≤ arr[i] **≤** 10<sup>4</sup>

### Topic Tags
<br />`Arrays`  `Data Structures`  `Merge Sort`
