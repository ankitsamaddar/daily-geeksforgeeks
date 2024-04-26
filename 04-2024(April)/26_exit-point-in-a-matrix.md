# Exit Point in a Matrix

> Difficulty: `Medium`

> Points: **4**

Given a **matrix**  of size **n x m**  with **0’s**  and **1’s** , you enter the matrix at cell **(0,0)**  in **left to right**  direction. Whenever you encounter a **0**  you retain it in the **same**  **direction** , else if you encounter a **1**  you have to **change**  the direction to the **right** of the current direction and **change that 1**  value to **0** , you have to find out from which index you will **leave** the matrix at the end.

**Example 1:**

**Input: <br />** n = 3, m = 3**<br />** matrix = {{0, 1, 0},<br /> {0, 1, 1},<br /> {0, 0, 0}}<br /> **Output: <br />** {1, 0}<br /> **Explanation: <br />** Enter the matrix at (0, 0) <br />-> then move towards (0, 1) -> 1 is encountered <br />-> turn right towards (1, 1) -> again 1 is encountered <br />-> turn right again towards (1, 0) <br />-> now, the boundary of matrix will be crossed ->hence, exit point reached at 1, 0..<br />

**Example 2:**

**Input: <br />** n = 1, m = 2**<br />** matrix = {{0, 0}}<br /> **Output: <br />** {0, 1}<br />**Explanation: <br />** Enter the matrix at cell (0, 0).<br /> Since the cell contains a 0, we continue moving in the same direction.<br /> We reach cell (0, 1), which also contains a 0. So, we continue moving in the same direction, we exit the matrix from cell (0, 1).<br />

**Your Task:** <br />You don't need to read or print anything. Your task is to complete the function **FindExitPoint()** which takes the **matrix**  as an input parameter and returns a **list**  containing the **exit point.**

**Expected Time Complexity:** O(n \* m) where n = number of rows and m = number of columns.<br />**Expected Space Complexity:** O(1)

**Constraints:** <br />1 <= n, m <= 100

### Company Tags
`Samsung`  
### Topic Tags
`Matrix`  `Data Structures`
