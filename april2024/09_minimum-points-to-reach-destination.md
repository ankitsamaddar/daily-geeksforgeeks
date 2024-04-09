# Minimum Points To Reach Destination

> Difficulty: `Hard`

> Points: **8**

Given a **m\*n**  grid with each cell consisting of **positive** , **negative** , or **zero**  point. We can move across a cell only if we have positive points. Whenever we pass through a cell, points in that cell are added to our overall points, the task is to find **minimum initial points**  to reach cell **(m-1, n-1)**  from **(0, 0)**  by following these certain set of rules :<br />1. From a cell (i, j) we can move to (i + 1, j) or (i, j + 1).<br />2. We cannot move from (i, j) if your overall points at (i, j) are <= 0.<br />3. We have to reach at (n-1, m-1) with minimum positive points i.e., > 0.

**Example 1:**

**Input** : <br />m = 3, n = 3 <br />points = {{-2,-3,3},<br /> {-5,-10,1},<br /> {10,30,-5}} <br />**Output:**  <br />7 <br />**Explanation** : 7 is the minimum value to reach the destination with positive throughout the path. Below is the path. (0,0) -> (0,1) -> (0,2) -> (1, 2) -> (2, 2) We start from (0, 0) with 7, we reach (0, 1) with 5, (0, 2) with 2, (1, 2) with 5, (2, 2) with and finally we have 1 point (we needed greater than 0 points at the end).

**Example 2:** 

**Input:<br />** m = 3, n = 2<br /> points = {{2,3},<br /> {5,10},<br /> {10,30}} <br />**Output: <br />** 1 <br />**Explanation** : Take any path, all of them are positive. So, required one point at the start

**Your Task:** <br />You don't need to read input or print anything. Complete the function **`minPoints`()** which takes **m,n**  and 2-d vector **points**  as input parameters and returns the **minimum initial points**  to reach cell **(m-1, n-1)**  from **(0, 0).** <br /><br />**Expected Time Complexity:**  O(n\*m)<br />**Expected Auxiliary Space:**  O(n\*m)<br /><br />**Constraints:** <br />1 ≤ m ≤ 10<sup>3 </sup> <br />1 ≤ n ≤ 10<sup>3<br></sup>-10<sup>3</sup> ≤ points[i][j] ≤ 10<sup>3</sup>

### Company Tags
`Microsoft`  
### Topic Tags
`Dynamic Programming`  `Algorithms`
