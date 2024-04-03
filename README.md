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
