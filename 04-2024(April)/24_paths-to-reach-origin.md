# Paths to reach origin

> Difficulty: `Medium`

> Points: **4**

You are standing on a point **(x, y)**  and you want to go to the origin**(0, 0)**  by taking steps either **left**  or **down**  i.e. from each point you are allowed to move either in **(x-1, y) or (x, y-1)** . Find the number of **paths** from **point** to **origin** .

**Example 1:**

**Input:** <br /> x = 3, y = 0<br /> **Output:**  <br />1<br /> **Explanation** : Path used was - **(3,0) --> ( 2,0) --> (1,0) --> (0,0)** .We can see that there is no other path than this, so we return 1.

**Example 2:**

**Input:<br />** x = 3, y = 6<br /> **Output:**  <br />84 <br />**Explanation** :<br />There are total 84 possible paths.

**Your Task:** <br />Since this is a function problem. You don't need to take any input, as it is already accomplished by the driver code. You just need to complete the function **ways** () that takes integer **x** and **y**  as parameters and returns the total number of **paths** from **point(x,y)** to the **origin(0,0) % 1000000007.**

**Expected Time Complexity:**  O(x\*y).<br />**Expected Auxiliary Space:**  O(x\*y).

**Constraints:** <br />0 ≤ x, y ≤ 500

### Topic Tags

`Arrays`  `Dynamic Programming`  `Matrix`  `Data Structures`  `Algorithms`
