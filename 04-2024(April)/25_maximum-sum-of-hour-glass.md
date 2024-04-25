# Maximum sum of hour glass

> Difficulty: `Medium`

> Points: **4**

Given two integers **n** , **m**  and a 2D matrix **mat**  of dimensions **nxm** , the task is to find the **maximum sum**  of an **hourglass** .<br />An **hourglass**  is defined as a part of the matrix with the following form:

![](https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/705187/Web/Other/blobid1_1710860182.png)

Return **-1**  if any hourglass is **not found** .

**Example 1:**

**Input:** <br /> n = 3, m = 3<br /> mat = [[1, 2, 3],<br /> [4, 5, 6],<br /> [7, 8, 9]]<br /> **Output:** <br /> 35<br /> **Explanation:** <br /> There is only one hour glass which is<br /> 1 2 3<br /> 5<br /> 7 8 9 and its sum is 35.

**Example 2:**

**Input:** <br /> n = 2, m = 3<br /> mat = [[1, 2, 3],<br /> [4, 5, 6]]<br /> **Output:** <br /> -1<br /> **Explanation:** <br /> There are no hour glasses in this matrix.

**Your Task:** <br />You don't need to read input or print anything. Your task is to complete the function **findMaxSum()**  which takes the two integers **n** , **m** , and the 2D matrix **mat**  as input parameters and returns the maximum sum of an hourglass in the matrix. If there are no hourglasses, it returns -1.

**Expected Time Complexity:** O(n\*m)<br />**Expected Auxillary Space:** O(1)

**Constraints:<br />** 1 <= n <= 150**<br />** 3 <= m <= 150<br />0 <= mat[i][j] <= 10<sup>6</sup>

### Topic Tags
`Matrix`  `Data Structures`
