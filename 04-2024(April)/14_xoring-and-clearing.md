# Xoring and Clearing

> Difficulty: `Easy`

> Points: **2**

You are given an array **arr[]**  of**size n** . You need to do the following:

1. You need to calculate the **bitwise XOR**  of each element in the array with its **corresponding index**  (indices start from 0).
2. After step1, **print the array.**
3. Now,**set all the elements of arr[] to zero** .
4. Now, **print arr[].**

**Example 1:**

**Input:** <br /> n = 10<br /> arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}<br /> **Output:<br />** 1 3 1 7 1 3 1 15 1 3<br /> 0 0 0 0 0 0 0 0 0 0<br /> **Explanation:<br />** First we take xor of every element with<br /> their indices, like (1xor0), (2xor1), (3xor2), (4xor3) and so on.<br /> Now print the resultant array<br /> Now set all the elements of array to zero<br /> Now print the resultant array

**Example 2:**

**Input:** <br /> n = 4<br /> arr[] = {10, 20, 30, 40}<br /> **Output:<br />** 10 21 28 43<br /> 0 0 0 0<br /> **Explanation:<br />** First we take xor of every element with<br /> their indices, like (1xor0), (2xor1), (3xor2).<br /> Now print the resultant array<br /> Now set all the elements of array to zero<br /> Now print the resultant array

**Your Task:** <br />Since this is a function problem, you don't need to take any input. Just complete the provided functions. In a new line, print the **output** .

**Expected Time Complexity:**  O(n)<br />**Expected Auxiliary Space:**  O(1)

**Constraints:** <br />1 <= n <= 1000<br />1 <= arr[i] <= 1000

### Topic Tags
`Bit Magic`  `Data Structures`
