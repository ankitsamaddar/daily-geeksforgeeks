# Row with minimum number of 1's

> Difficulty: `Easy`

> Points: **2**

Given a 2D **binary matrix** (1-based indexed) **a**  of dimensions **nxm** , determine the **row**  that contains the **minimum number** of **1's** .<br />**Note:** The matrix contains only **1's**  and **0's** . Also, if two or more rows contain the **minimum number**  of **1's** , the answer is the **lowest**  of those **indices** .

**Example 1:**

**Input:** <br /> n = 4,m = 4<br /> a = [[1, 1, 1, 1],<br /> [1, 1, 0, 0],<br /> [0, 0, 1, 1],<br /> [1, 1, 1, 1]]<br /> **Output:** <br /> 2<br /> **Explanation:** <br /> Rows 2 and 3 contain the minimum number<br /> of 1's(2 each).Since,row 2 is less than row 3.<br /> Thus, the answer is 2.

**Example 2:**

**Input:** <br /> n = 3,m = 3<br /> a = [[0, 0, 0],<br /> [0, 0, 0],<br /> [0, 0, 0]]<br /> **Output:** <br /> 1<br /> **Explanation:** <br /> All the rows contain the same number<br /> of 1's(0 each).Among them, index 1<br /> is the smallest, so the answer is 1.

**Your Task:** <br />You don't need to read input or print anything. Your task is to complete the function **minRow()**  which takes the two integers **n** , **m**  as well as the **2D binary matrix a**  as input parameters and returns the **minimum index**  of the **row**  which contains the **least number of 1's** .

**Expected Time Complexity:** O(n\*m)<br />**Expected Auxillary Space:** O(1)

**Constraints:** <br />1 <= n,m <= 1000

0 <= a[i][j] <= 1

### Company Tags
`Amazon`  
### Topic Tags
`Matrix`  `Data Structures`
