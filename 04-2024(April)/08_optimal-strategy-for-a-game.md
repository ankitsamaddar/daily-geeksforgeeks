# Optimal Strategy For A Game

> Difficulty: `Medium`

> Points: **4**

You are given an array **arr** of size **n** . The elements of the array represent **n**  **coin** of **values v<sub>1</sub>, v<sub>2</sub>, ....v<sub>n</sub>** . You play against an opponent in an **alternating** way. In each **turn** , a player selects either the **first or last coin**  from the **row** , removes it from the row permanently, and **receives the value**  of the coin.<br />You need to determine the **maximum possible amount of money** you can win if you **go first** .<br />**Note:**  Both the players are playing optimally.

**Example 1:**

**Input:<br />** n = 4<br /> arr[] = {5, 3, 7, 10}<br /> **Output: <br />** 15<br /><br />**Explanation:** The user collects maximum<br /> value as 15(10 + 5). It is guarantee that we cannot get more than 15 by any possible moves.<br />

**Example 2:**

**Input:<br />** n = 4<br /> arr[] = {8, 15, 3, 7}<br /> **Output: <br />** 22<br /><br />**Explanation:** The user collects maximum<br /> value as 22(7 + 15). It is guarantee that we cannot get more than 22 by any possible moves.

**Your Task:** <br />Complete the function **maximumAmount()**  which takes an array **arr[]**  (represent values of **n**  coins) and **n**  as a number of coins as a parameter and returns the **maximum possible amount of money** you can win if you **go first** .

**Expected Time Complexity**  : O(n\*n)<br />**Expected Auxiliary Space** : O(n\*n)

**Constraints:** <br />2 <= n <= 10<sup>3</sup><br />1 <= arr[i] <= 10<sup>6</sup>

### Topic Tags
`Dynamic Programming`
