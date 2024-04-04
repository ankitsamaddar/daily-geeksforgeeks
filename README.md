# daily-geeksforgeeks

This repository contains solutions of GeeksforGeeks problem of the day.

https://www.geeksforgeeks.org/problem-of-the-day

The README, problem details, and solutions are updated using a PowerShell script.

## April 2024

| SL No | Problem Name w/ Difficulty | ProblemURL | ProblemURL2 | Solution | Notes |
| :---: | -------------------------- | :--------: | :---------: | :------: | ----- |
| 01 | Pairs violating the BST property <br>🟡Medium | [GeeksforGeeks](https://www.geeksforgeeks.org/problems/pairs-violating-bst-property--212515/1) | — | 01-Apr-24<br>[Java](<./april2024/01_pairs-violating-the-bst-property.java>) | InOrder traverse the tree, Use stack to traverse to the leftmost node and store it in an Array. Iterate the array and check for each node if it was >= to the left node. Then increment count. Return count. |
| 02 | Minimum Absolute Difference In BST <br>🟡Medium | [GeeksforGeeks](https://www.geeksforgeeks.org/problems/minimum-absolute-difference-in-bst-1665139652/1) | — | 02-Apr-24<br>[Java](<./april2024/02_minimum-absolute-difference-in-bst.java>) | Inorder traverse the BST, use stack to store the node and go to the leftmost node. Pop the stack to visit the node. If prev node != null, update minDiff = root.data-prev.data . Update prev as root, and root to go to right subtree. Return minDiff. |
| 03 | Kth common ancestor in BST <br>🟡Medium | [GeeksforGeeks](https://www.geeksforgeeks.org/problems/kth-common-ancestor-in-bst/1) | — | 03-Apr-24<br>[Java](<./april2024/03_kth-common-ancestor-in-bst.java>) | Find the lowest common ancestor(LCA) node for x and y in the BST. Make arrayList for the ancestors and traverse the tree till LCA node. Return the node at arrayList.size()-k, if it is -ve return -1. In `lca` traverse left if x and y less than root else traverse right, return root if left < root < right. Inside `findAncestor`, traverse and add root to list, if root==lca return, if lca is less traverse left else traverse right.  |
| 04 | Sum of all substrings of a number <br>🟢Easy | [GeeksforGeeks](https://www.geeksforgeeks.org/problems/sum-of-all-substrings-of-a-number-1587115621/1) | — | 04-Apr-24<br>[Java](<./april2024/04_sum-of-all-substrings-of-a-number.java>) | For every character in the string calculate current digit contribution to the sum, append to the prev index sum and add it to the totalSum. Return the totalSum. Each digits contribution to the totalSum is `[(i+1)*digit]+[10*prevIndexSum]`. |
| 05 | Strictly Increasing Array <br>🔴Hard | [GeeksforGeeks](https://www.geeksforgeeks.org/problems/convert-to-strictly-increasing-array3351/1) | — | 05-Apr-24<br>[Java](<./april2024/05_strictly-increasing-array.java>) | Create a dp array of nums.length and fill with 1 as all numbers can atleast be there own subsequence. Iterate the array, and initialize the maxLIS=0. Iterate from 0 to i and find the max Longest increasing subsequence(LIS). To be LIS, `nums[j]<nums[i] and nums[i]-nums[j]>i-j-1`, as the numbers should be strictly increasing and value of nums[i] cannot be less. Update the dp[i] with max(dp[i],maxLIS). Get the max element from the dp array `lis` which is the longest number in the increasing subsequence. Return nums.length - lis, as lis number of elements are already in increasing subsequence, we only need to modify the rest of the elements. |
