# Gray to Binary equivalent

> Difficulty: `Medium`

> Points: **4**

Given an integer number **n,** which is a decimal representation of [**Gray Code.**](https://www.geeksforgeeks.org/what-is-gray-code/) Find the **binary equivalent**  of the Gray Code & return the **decimal representation**  of the **binary equivalent** .

![](https://media.geeksforgeeks.org/img-practice/ScreenShot2021-08-27at10-1630039200.png)

**Note:** Please visit **[here](https://docs.google.com/document/d/1JvuMcN8XXUP_bOiZmVvbNskWu4K2ieA0aoCJWAEexEM/edit?usp=sharing)**  to learn How Gray Code is generated.

**Example 1:**

**Input: <br />** n = 4<br /> **Output** : <br />7<br /> **Explanation** :<br /> Given 4, its gray code = 110.<br /> Binary equivalent of the gray code 110 is 100.<br /> Return 7 representing gray code 100.<br />

**Example 2:**

**Input** : <br />n = 15<br /> **Output** : <br />10<br /> **Explanation** :<br /> Given 15 representing gray code 1000.<br /> Binary equivalent of gray code 1000 is 1111.<br /> Return 10 representing gray code 1111<br /> ie binary 1010.

**Your Task:** <br />You don't need to read input or print anything. Your task is to complete the function **grayToBinary** () which accepts an integer **n**  as an input parameter and **returns decimal representation**  of the **binary equivalent**  of the given gray code.

**Expected Time Complexity:**  O(log (n)).<br />**Expected Auxiliary Space:**  O(1).

**Constraints:** <br />0 <= n <= 10<sup>8</sup>

### Topic Tags
`Bit Magic`  `Data Structures`
