# daily-geeksforgeeks

This repository contains solutions of GeeksforGeeks problem of the day.

https://www.geeksforgeeks.org/problem-of-the-day

The README, problem details, and solutions are updated using a PowerShell script.

## April 2024

<details>
<summary>
See Solutions here
</summary>

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
| 12 | [Sum of Products](<./04-2024(April)/12_sum-of-products.md>) <br>🟡Medium | [GeeksforGeeks](https://www.geeksforgeeks.org/problems/sum-of-products5049/1) | — | 12-Apr-24<br>[Java](<./04-2024(April)/12_sum-of-products.java>) | Initialize `sum`. Iterate over each bit `i` from `0 to 31`, and set `count=0`. Iterate over every number in the array `arr[]`. If the number has `i-th` bit set then increment `count`. Calculate `totalPairs` and `eachPairContribution` for `i-th` bit set. Add to `sum += totalPairs * eachPairContribution`. Return `sum`. |
| 13 | [Reverse Bits](<./04-2024(April)/13_reverse-bits.md>) <br>🟢Easy | [GeeksforGeeks](https://www.geeksforgeeks.org/problems/reverse-bits3556/1) | — | 13-Apr-24<br>[Java](<./04-2024(April)/13_reverse-bits.java>) | For each bit from `(0-31)` set in the `x`, Add `OR` it to the `result` at `31 - i`th bit. Return `result`. |
| 14 | [Xoring and Clearing](<./04-2024(April)/14_xoring-and-clearing.md>) <br>🟢Easy | [GeeksforGeeks](https://www.geeksforgeeks.org/problems/xoring-and-clearing/1) | — | 14-Apr-24<br>[Java](<./04-2024(April)/14_xoring-and-clearing.java>) | The `printArr` to print the elements of the array. `setToZero` to set the elements to zero. `xor1ToN` to XOR the elements with i `arr[i]^i`. |
| 15 | [Count the elements](<./04-2024(April)/15_count-the-elements.md>) <br>🟢Easy | [GeeksforGeeks](https://www.geeksforgeeks.org/problems/count-the-elements1529/1) | — | 15-Apr-24<br>[Java](<./04-2024(April)/15_count-the-elements.java>) | Find max element in array `a` and `b` in `maxVal`. Create a `freq[]` array to calculate frequency of elements in `b`. Calculate prefix sum for `freq[]`, where `freq[i]` represents no. of elements in `b that are <= i`. Create a `res[]` array, for each query index in `a`, find in `freq count of elements <= a[query[i]]`. Return `res`. |
| 16 | [Minimize the Difference](<./04-2024(April)/16_minimize-the-difference.md>) <br>🟡Medium | [GeeksforGeeks](https://www.geeksforgeeks.org/problems/minimize-the-difference/1) | — | 16-Apr-24<br>[Java](<./04-2024(April)/16_minimize-the-difference.java>) | Initialize `postMax[n] and postMin[n]`, and calculate the max and min iterating backwards. Initialize `minDiff = postMax[k] - postMin[k]` and `pMax and pMin = arr[0]`. Now iterate the array with window of size `k`. Calculate `curMinDiff`. Update `curDiff, pMax and pMin`. Update `minDiff` with the remaining max and min to the left of last window. Return `minDiff`. |
| 17 | [Count Pairs in an Array](<./04-2024(April)/17_count-pairs-in-an-array.md>) <br>🔴Hard | [GeeksforGeeks](https://www.geeksforgeeks.org/problems/count-pairs-in-an-array4145/1) | — | 17-Apr-24<br>[Java](<./04-2024(April)/17_count-pairs-in-an-array.java>) | Pre-compute `i * arr[i]`, and use the method `mergeSortAndCount(arr, 0, n -1)` to count the pairs and return it. Inside the method `mergeSortAndCount(arr, lo, hi)`, calculate the `mid = lo + (hi-lo)/2` and add count of pairs to `count` recursively for left half `arr[lo...mid]` and right half `arr[mid+1...hi]`. Use a `temp[]` array to store the sorted array. Iterate the array, If `arr[i] <= arr[j]` add it to temp. Else add `arr[j]` to `temp` and also add to `count += mid+1+i` as left half is sorted there are `mid+1-i` pairs in the left, where `i*arr[i]>j*arr[j]`. Copy the remaining left and right half to `temp[]`. Copy the `temp[]` array back to original `arr[]` array. Return `count`. |
| 18 | [Two Repeated Elements](<./04-2024(April)/18_two-repeated-elements.md>) <br>🟡Medium | [GeeksforGeeks](https://www.geeksforgeeks.org/problems/two-repeated-elements-1587115621/1) | — | 18-Apr-24<br>[Java](<./04-2024(April)/18_two-repeated-elements.java>) | Iterate the array `arr[i]`, If `arr[Math.abs(arr[i])] > 0` i.e. if `arr[i]` mark it as `-ve`. Else add it to `res[]`. Return the `res`. |
| 19 | [Find missing in second array](<./04-2024(April)/19_find-missing-in-second-array.md>) <br>🟢Easy | [GeeksforGeeks](https://www.geeksforgeeks.org/problems/in-first-but-second5423/1) | — | 19-Apr-24<br>[Java](<./04-2024(April)/19_find-missing-in-second-array.java>) | Hash the second array `b[]` into a `HashSet` `set`. Iterate the second array `a` and if it is not present in the `set` add it to `missingElements` list. Return the `missingElements` list. |
| 20 | [Union of Two Sorted Arrays](<./04-2024(April)/20_union-of-two-sorted-arrays.md>) <br>🟡Medium | [GeeksforGeeks](https://www.geeksforgeeks.org/problems/union-of-two-sorted-arrays-1587115621/1) | — | 20-Apr-24<br>[Java](<./04-2024(April)/20_union-of-two-sorted-arrays.java>) | Use a `TreeSet` `union` to add the first array `arr1` and then the second array `arr2`. Return the `union` `TreeSet` converted to a `ArrayList`. |
| 21 | [Three way partitioning](<./04-2024(April)/21_three-way-partitioning.md>) <br>🟢Easy | [GeeksforGeeks](https://www.geeksforgeeks.org/problems/three-way-partitioning/1) | — | 21-Apr-24<br>[Java](<./04-2024(April)/21_three-way-partitioning.java>) | Using 3-way partitioning, use three pointers `low`, `mid` and `high`. Iterate till `mid <= high`. If `array[mid] < a` swap elements at index `mid` with `low` and increment the pointers. Else if `array[mid] >= a && array[mid] <= b` increment `mid++`. Else if `array[mid] > b` swap elements at index `mid` with `high`, decrement `high`. |
| 22 | [Row with minimum number of 1s](<./04-2024(April)/22_row-with-minimum-number-of-1s.md>) <br>🟢Easy | [GeeksforGeeks](https://www.geeksforgeeks.org/problems/row-with-minimum-number-of-1s5430/1) | — | 22-Apr-24<br>[Java](<./04-2024(April)/22_row-with-minimum-number-of-1s.java>) | Initialize `minCount = -1` and `minRowIndex = -1`. For every row count number of `1`s in `count`. For the current row if `count < minCount` update `minCount = count` and `minRowIndex = i`. Return `minRowIndex + 1`. |
| 23 | [Rohans Love for Matrix](<./04-2024(April)/23_rohans-love-for-matrix.md>) <br>🟡Medium | [GeeksforGeeks](https://www.geeksforgeeks.org/problems/rohans-love-for-matrix4723/1) | — | 23-Apr-24<br>[Java](<./04-2024(April)/23_rohans-love-for-matrix.java>) | If `n == 0`, return `0`. Initialize `a=0, b=1`. Iterate from `2 to n` to calculate n-th fibonacci sequence using `mod` to keep within integer limits. Return `b % mod`. |
| 24 | [Paths to reach origin](<./04-2024(April)/24_paths-to-reach-origin.md>) <br>🟡Medium | [GeeksforGeeks](https://www.geeksforgeeks.org/problems/paths-to-reach-origin3850/1) | — | 24-Apr-24<br>[Java](<./04-2024(April)/24_paths-to-reach-origin.java>) | Use dynamic programming `dp[n+1][m+1]` array. Initialize the first row(`dp[i][0]`) and column(`dp[0][i]`) of the `dp[][]` array. Iterate and Fill the rest of the matrix `dp[i][j] = (dp[i-1][j] + dp[i][j-1]) % mod`. Return `dp[n][m]`. |
| 25 | [Maximum sum of hour glass](<./04-2024(April)/25_maximum-sum-of-hour-glass.md>) <br>🟡Medium | [GeeksforGeeks](https://www.geeksforgeeks.org/problems/maximum-sum-of-hour-glass3842/1) | — | 25-Apr-24<br>[Java](<./04-2024(April)/25_maximum-sum-of-hour-glass.java>) | Initialize `maxSum = Integer.MIN_VALUE`. Iterate the matrix till `n - 2 and m - 2`, calculate `currentSum` for the top part, middle part and the bottom part. Update `maxSum`. If `maxSum == Integer.MIN_VALUE` return `-1` else return `maxSum`. |
| 26 | [Exit Point in a Matrix](<./04-2024(April)/26_exit-point-in-a-matrix.md>) <br>🟡Medium | [GeeksforGeeks](https://www.geeksforgeeks.org/problems/exit-point-in-a-matrix0905/1) | — | 26-Apr-24<br>[Java](<./04-2024(April)/26_exit-point-in-a-matrix.java>) | Initialize `dir=0, i and j`. Iterate till `i and j` within bounds, determine direction based of `matrix[i][j]` also mod by `4` to keep it within the range `0-3`. If cell is `1` set it as `0`. Update position based on direction (0->right(`j++`), 1->down(`i++`), 2->left(`j--`), 3->up(`i--`)). If `i and j` out of bounds, exit. Adjust the exit points. Return `{i, j}`. |
| 27 | [Merge Sort on Doubly Linked List](<./04-2024(April)/27_merge-sort-on-doubly-linked-list.md>) <br>🔴Hard | [GeeksforGeeks](https://www.geeksforgeeks.org/problems/merge-sort-on-doubly-linked-list/1) | — | 27-Apr-24<br>[Java](<./04-2024(April)/27_merge-sort-on-doubly-linked-list.java>) | If list empty, already sorted. Get the `middle` node using `getMiddle(node)` method, and then merge sort using `mergeSort(node, middle)` which returns the head of the sorted list. In the `getMiddle()` method use `fast and slow` pointers to get the middle node. In `mergeSort()`, if any of the half is `null` return the other node. Else recursively sort both halves and return the node. |
| 28 | [Delete Middle of Linked List](<./04-2024(April)/28_delete-middle-of-linked-list.md>) <br>🟢Easy | [GeeksforGeeks](https://www.geeksforgeeks.org/problems/delete-middle-of-linked-list/1) | — | 28-Apr-24<br>[Java](<./04-2024(April)/28_delete-middle-of-linked-list.java>) | Initialize `fast and slow` pointers, and traverse the linkedlist. Use a pointer `prev` to store the current `slow` pointer. After traversing skip the middle node by `prev.next = slow.next`. Return the `head` of the new modified linked list. |
| 29 | [Remove every kth node](<./04-2024(April)/29_remove-every-kth-node.md>) <br>🟢Easy | [GeeksforGeeks](https://www.geeksforgeeks.org/problems/remove-every-kth-node/1) | — | 29-Apr-24<br>[Java](<./04-2024(April)/29_remove-every-kth-node.java>) | If list empty or `k==1` return `null`. Initialize `prev and curr` to `head`, and `count=1`. Iterate while `curr!=null`, if `count` is multiple of `k` remove the node `prev.next = curr.next` else update `prev = cur`. Increment `curr and count`. Return `head` of the modified linkedlist. |
| 30 | [Add two numbers represented by linked lists](<./04-2024(April)/30_add-two-numbers-represented-by-linked-lists.md>) <br>🟡Medium | [GeeksforGeeks](https://www.geeksforgeeks.org/problems/add-two-numbers-represented-by-linked-lists/1) | — | 30-Apr-24<br>[Java](<./04-2024(April)/30_add-two-numbers-represented-by-linked-lists.java>) | Reverse both the linked list using `reverse()` method. Initialize a `result`, `prev` and `temp` pointers as `null`, and `sum` and `carry` as `0`. Iterate both the lists `num1 and num2` and add it to the `sum` including the carry. Get the `carry` if present and update the `sum = sum % 10` to get the sum without carry. Set `temp = new Node(sum)`, if first node point `result=temp`, else `prev.next=temp`. Set prev for next iteration `prev = temp`. Increment `num1 and num2`. If `carry` is left add at end of temp. Reverse from the `result` node and also skip zeros from the beginning of the result. Result `result` or `0` if it is `null`. |

</details>

## May 2024

| SL No | Problem Name w/ Difficulty | ProblemURL | ProblemURL2 | Solution | Notes |
| :---: | -------------------------- | :--------: | :---------: | :------: | ----- |
| 01 | [Arrange Consonants and Vowels](<./05-2024(May)/01_arrange-consonants-and-vowels.md>) <br>🟡Medium | [GeeksforGeeks](https://www.geeksforgeeks.org/problems/arrange-consonants-and-vowels/1) | — | 1 May<br>[Java](<./05-2024(May)/01_arrange-consonants-and-vowels.java>) | Maintain two separate linkedlist for vowels and consonants. Traverse the `head` list, Use `isVowel()` method to check if it is vowel then append to `vowelLast` list else append to `consonantLast` list. Concatenate `consonantLast` at the end of `vowelLast`. Return `vowelHead.next`. |
