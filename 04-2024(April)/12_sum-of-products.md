# Sum of Products

> Difficulty: `Medium`
>
> Points: **4**

Given an array **arr[]**  of size **n** . Calculate the **sum of Bitwise ANDs**  ie: calculate sum of ***arr[i] & arr[j]*** for **all the pairs**  in the given array **arr[]** where **i < j** .

**Example 1:**

**Input:** <br /> n = 3<br /> arr = {5, 10, 15}<br /> **Output:** <br /> 15<br /> **Explanation:** <br /> The bitwise Ands of all pairs where `i<j` are `(5&10)=0`, `(5&15)=5` and `(10&15)=10`.<br>Therefore, the total sum = (0+5+10) = 15.

**Example 2:**

**Input:** <br /> n = 4<br /> arr = {10, 20, 30, 40}<br /> **Output:** <br /> 46<br /> **Explanation:** <br /> The sum of bitwise Ands<br /> of all pairs = (0+10+8+20+0+8) = 46.

**Your Task:** <br />You don't need to read input or print anything.Your Task is to complete the function **pairAndSum()** which takes an Integer **n**  and an array **arr[]** of size **n** as input parameters and **returns**  the **sum** of **bitwise Ands** of **all pairs** .

**Expected Time Complexity:** O(n)<br />**Expected Auxillary Space:** O(1)

**Constraints:** <br />1 <= n <= 10<sup>5</sup><br />1 <= arr[i] <= 10<sup>8</sup>

### Topic Tags
`Mathematical`  `Bit Magic`  `Data Structures`  `Algorithms`
