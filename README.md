# daily-geeksforgeeks

This repository contains solutions of GeeksforGeeks problem of the day.

https://www.geeksforgeeks.org/problem-of-the-day

The README, problem details, and solutions are updated using a PowerShell script.

## April 2024

| SL No | Problem Name w/ Difficulty | ProblemURL | ProblemURL2 | Solution | Notes |
| :---: | -------------------------- | :--------: | :---------: | :------: | ----- |
| 01 | [Pairs violating the BST property](<./04-2024(April)/01_pairs-violating-the-bst-property.md>) <br>🟡Medium | [GeeksforGeeks](https://www.geeksforgeeks.org/problems/pairs-violating-bst-property--212515/1) | — | 01-Apr-24<br>[Java](<./04-2024(April)/01_pairs-violating-the-bst-property.java>) | InOrder traverse the tree, Use stack to traverse to the leftmost node and store it in an Array. Iterate the array and check for each node if it was >= to the left node. Then increment count. Return count. |
| 02 | [Minimum Absolute Difference In BST](<./04-2024(April)/02_minimum-absolute-difference-in-bst.md>) <br>🟡Medium | [GeeksforGeeks](https://www.geeksforgeeks.org/problems/minimum-absolute-difference-in-bst-1665139652/1) | — | 02-Apr-24<br>[Java](<./04-2024(April)/02_minimum-absolute-difference-in-bst.java>) | Inorder traverse the BST, use stack to store the node and go to the leftmost node. Pop the stack to visit the node. If prev node != null, update minDiff = root.data-prev.data . Update prev as root, and root to go to right subtree. Return minDiff. |
| 03 | [Kth common ancestor in BST](<./04-2024(April)/03_kth-common-ancestor-in-bst.md>) <br>🟡Medium | [GeeksforGeeks](https://www.geeksforgeeks.org/problems/kth-common-ancestor-in-bst/1) | — | 03-Apr-24<br>[Java](<./04-2024(April)/03_kth-common-ancestor-in-bst.java>) | Find the lowest common ancestor(LCA) node for x and y in the BST. Make arrayList for the ancestors and traverse the tree till LCA node. Return the node at arrayList.size()-k, if it is -ve return -1. In `lca` traverse left if x and y less than root else traverse right, return root if left < root < right. Inside `findAncestor`, traverse and add root to list, if root==lca return, if lca is less traverse left else traverse right.  |
| 04 | [Sum of all substrings of a number](<./04-2024(April)/04_sum-of-all-substrings-of-a-number.md>) <br>🟢Easy | [GeeksforGeeks](https://www.geeksforgeeks.org/problems/sum-of-all-substrings-of-a-number-1587115621/1) | — | 04-Apr-24<br>[Java](<./04-2024(April)/04_sum-of-all-substrings-of-a-number.java>) | For every character in the string calculate current digit contribution to the sum, append to the prev index sum and add it to the totalSum. Return the totalSum. Each digits contribution to the totalSum is `[(i+1)*digit]+[10*prevIndexSum]`. |
| 05 | [Strictly Increasing Array](<./04-2024(April)/05_strictly-increasing-array.md>) <br>🔴Hard | [GeeksforGeeks](https://www.geeksforgeeks.org/problems/convert-to-strictly-increasing-array3351/1) | — | 05-Apr-24<br>[Java](<./04-2024(April)/05_strictly-increasing-array.java>) | Create a dp array of nums.length and fill with 1 as all numbers can atleast be there own subsequence. Iterate the array, and initialize the maxLIS=0. Iterate from 0 to i and find the max Longest increasing subsequence(LIS). To be LIS, `nums[j]<nums[i] and nums[i]-nums[j]>i-j-1`, as the numbers should be strictly increasing and value of nums[i] cannot be less. Update the dp[i] with max(dp[i],maxLIS). Get the max element from the dp array `lis` which is the longest number in the increasing subsequence. Return nums.length - lis, as lis number of elements are already in increasing subsequence, we only need to modify the rest of the elements. |
| 06 | [Count ways to Nth Stair](<./04-2024(April)/06_count-ways-to-nth-stair.md>) <br>🟢Easy | [GeeksforGeeks](https://www.geeksforgeeks.org/problems/count-ways-to-nth-stairorder-does-not-matter1322/1) | — | 06-Apr-24<br>[Java](<./04-2024(April)/06_count-ways-to-nth-stair.java>) | To use dynamic programming we create a `dp` array of `n+1` length where `dp[i]` represents number of ways to reach `i-th` stair. Initialize `dp[0]=dp[1]=1` as there is only one way to reach 1-st step and 0-th step is not need. We iterate from 2 to n and and for `dp[i]` we set it as `dp[i-1]`. We add 1 more way for even steps as it can be reached by step jump of two. Return the ways to reach n-th stair `dp[n]`. |
| 07 | [Maximize dot product](<./04-2024(April)/07_maximize-dot-product.md>) <br>🟡Medium | [GeeksforGeeks](https://www.geeksforgeeks.org/problems/maximize-dot-product2649/1) | — | 07-Apr-24<br>[Java](<./04-2024(April)/07_maximize-dot-product.java>) | Initialize `dp[n+1][m+1]`, to calculate the maximum dot product. Fill the dp from cell `(1,1)` till `(n,m)`. For each cell(i,j), We have two options. 1. `dp[i-1][j]` - We can either ignore the i-th element of arr `a[]` i.e. consider 0 in j-th element of `b[]`. 2. `a[i-1]*b[j-1] + dp[i-1][j-1]` - Product the two elements and and dp calculate so for. We store it to `dp[i][j]`. Condition 1 is only valid when `n - i >= m - j`, i.e. more elements left in `a[]` than `b[]`. Return the `dp[n][m]` will store the maximum dot product. |
| 08 | [Optimal Strategy For A Game](<./04-2024(April)/08_optimal-strategy-for-a-game.md>) <br>🟡Medium | [GeeksforGeeks](https://www.geeksforgeeks.org/problems/optimal-strategy-for-a-game-1587115620/1) | — | 08-Apr-24<br>[Java](<./04-2024(April)/08_optimal-strategy-for-a-game.java>) | `dp[i][j]` represent max amount for first player for `i-th` to `j-th` coins remaining. Iterate from gap `0` to `n-1`, and calculate max value possible starting `i=0,j=gap` till `j=n-1`. For each `(i,j)` pair calculate max value possible, either choosing `i` or `j` th coin. There are two choices considering opponents optimal move. 1. Choose the `i-th` coin and min from `i+2` and `i+1 to j-1` th coin. 2. Choose the j-th coin and min from `i+1 to j-1` and `j-2` th coin. Return `dp[0][n-1]` because it represents the maximum value the first player can achieve. |
| 09 | [Minimum Points To Reach Destination](<./04-2024(April)/09_minimum-points-to-reach-destination.md>) <br>🔴Hard | [GeeksforGeeks](https://www.geeksforgeeks.org/problems/minimum-points-to-reach-destination0540/1) | — | 09-Apr-24<br>[Java](<./04-2024(April)/09_minimum-points-to-reach-destination.java>) | Create a `dp[m][n]` where `dp[i][j]` is the minimum number of points to reach `i`, `j`. Initialize cell `dp[m-1][n-1]` as `1` if `points[m-1][n-1]` is positive else `abs(points[m-1][n-1])+1` as we have to offset the -ve value to reach it. Fill the last row from `m-2` as the `max(dp[i+1][n-1] - points[i][n-1], 1)`. Fill the last column from `n-2` as the `max(dp[m-1][j+1] - points[m-1][j], 1)`. Fill the rest of the table subtracting current points from `min(right(i+1), down(j+1))` cells in `dp`. Return `dp[0][0]` as it is the minimum initial points needed to reach `dp[m-1][n-1]`. |
| 10 | [Party of Couples](<./04-2024(April)/10_party-of-couples.md>) <br>🟢Easy | [GeeksforGeeks](https://www.geeksforgeeks.org/problems/alone-in-couple5507/1) | — | 10-Apr-24<br>[Java](<./04-2024(April)/10_party-of-couples.java>) | Initialize the `res` variable. Iterate the array, XOR `res = res^arr[i]`. XOR of two numbers is 0 `a^a=0`. After we XOR all numbers in the array we a re left with the number that don't have a pair. Return `res`. |
| 11 | [Gray to Binary equivalent](<./04-2024(April)/11_gray-to-binary-equivalent.md>) <br>🟡Medium | [GeeksforGeeks](https://www.geeksforgeeks.org/problems/gray-to-binary-equivalent-1587115620/1) | — | 11-Apr-24<br>[Java](<./04-2024(April)/11_gray-to-binary-equivalent.java>) | Set `ans=n`. While `n!=0` right `n` by 1 bit and `XOR` it with `ans`. This will flip the bits, as Gray Code is the formed by `XOR` of corresponding bit with the bit in its right. Return the `ans`. |
