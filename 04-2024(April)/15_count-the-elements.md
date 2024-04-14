# Count the elements

> Difficulty: `Easy`

> Points: **2**

Given two arrays **a** and **b**  both of size **n** . Given **q**  queries in an arrray **query**  each having a positive integer **x**  denoting an index of the array **a** . For each query, your task is to find all the elements **less than or equal**  to **a[x]**  in the array **b** .

**Example 1:**

**Input:<br />** n = 3<br /> a[] = {4,1,2}<br /> b[] = {1,7,3}<br />q = 2<br />query[] = {0,1}<br /> **Output :**  <br />2<br /> 1<br /> **Explanation** : <br />For 1<sup>st</sup> query, the given index is 0, a[0] = 4. There are 2 elements(1 and 3) which are less than or equal to 4.<br /> For 2<sup>nd</sup> query, the given index is 1, a[1] = 1. There exists only 1 element(1) which is less than or equal to 1.

**Example 2:**

**Input:<br />** n = 4<br /> a[] = {1,1,5,5}<br /> b[] = {0,1,2,3}<br />q = 4<br /> query[] = {0,1,2,3}<br /> **Output :**  <br />2<br />2<br />4<br />4<br /> **Explanation** : <br />For 1<sup>st</sup> query and 2<sup>nd</sup> query, the given index is 0 and 1 respectively, a[0] = a[1] = 1. There are 2 elements(0 and 1) which are less than or equal to 1.<br /> For 3<sup style="font-family:-apple-system,BlinkMacSystemFont,'Segoe UI',Roboto,Oxygen,Ubuntu,Cantarell,'Open Sans','Helvetica Neue',sans-serif">rd</sup> query and 4<sup style="font-family:-apple-system,BlinkMacSystemFont,'Segoe UI',Roboto,Oxygen,Ubuntu,Cantarell,'Open Sans','Helvetica Neue',sans-serif">th</sup> query, the given index is 2 and 3 respectively, a[2] = a[3] = 5. All the 4 elements are less than or equal to 5.

**Your Task:** <br />You don't need to take any input, as it is already accomplished by the driver code. You just need to complete the function **countElements()**  that takes**** array **a** and **b**  of size **n,** and array **query** of size **q** as parameters**** and returns an array that contains the answer to the corresponding queries.

**Expected Time Complexity:**  O(n+q).<br />**Expected Auxiliary Space:**  O(maximum of **a**  and **b** ).

**Constraints:** <br />1 ≤ q ≤ n ≤ 10<sup>5</sup><br />1 ≤ a[i], b[i] ≤ 10<sup>5</sup><br />0 ≤ query[i] < n

### Company Tags

`Amazon`  `Yatra.com`

### Topic Tags

`Arrays`  `Hash`  `Data Structures`
