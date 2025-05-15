# Trees

# Basics

## 1. Fundamentals

### Terminology

- Root
- Child Node
- Parent Node
- Sibling Node
- Leaf node: no child nodes
-  Internal node: not lead or root
- Ancestor Node
- Descendant Node
- Level
- Number of edges = size - 1
- Height
- Size = number of nodes

- Subtree -> Left Subtree -> Right Subtree 

---

### Important Properties of trees

- Traversing in a tree is done by DFS & BFS algo.
- No loop & No circuit.
- No self loop
---

### Types of trees

### 1.Generic Trees

- Each node can have any number of child nodes

### 2. Binary Trees

- Each node can have atmost two child nodes
- Contains left child node & right child node

### 3. Binary Search Trees

- Every node to the left of the node is smaller and every node to the right, has a greater value

### 4.  AVL Trees

- Type of BST's
- But these are balanced 

---

### Applications

- Hierarchial Data Structure
- Searching Efficiency
- Sorting
- Dynamic Data
- Efficient insertion and deletion
- Easy to implement

---
## 1. Starting (Basics in Java)


### [Basic implementations](https://github.com/namantoo/java-dsa/blob/main/Trees/implementation.java)

Created `Node` class with `int val` and `Node right` and `Node left`.
- Basic displaying

### [Finding Size, Max, Sum & Height](https://github.com/namantoo/java-dsa/blob/main/Trees/sizeMaxSumHeight.java)


- Made functions like `size()` , `sum()`, `maxNode()`, `height()`

### [Pre, In & Post Order traversals](https://github.com/namantoo/java-dsa/blob/main/Trees/preInPost.java)


- Made functions like `preorder()` , `postorder()`, `inorder()`
- Preorder – root, left, right
- Inorder - left, root, right
- Postorder - left, right, root
- These are depth-first traversal types

### Level order traversal (BFS)

- imp as a concept ( we can do this in recursive way as well by passing the level and then traversing to the point when level = 1 starting from root and print values of that level)
- Second approach is QUEUES
- Add the root to queue, and then add its left and right and then print root and pop!


## 2. Questions

### 1. [542. Diameter of Binary tree](https://leetcode.com/problems/diameter-of-binary-tree/description/)

- In this we need to find the longest diameter (distance) between two nodes
- We do it recursively, by keep track of height and updating the maxDiameter found
- diameter at a given root is left + right
- Edge cases to look at are: where root has only one child, and where the diameter not has to pass necessarily to the orignal root given but anywhere in between


### 2. [110. Balanced Binary Tree](https://leetcode.com/problems/balanced-binary-tree/description/)

- A binary tree is height-balanced if for every node, the height of the left and right subtree differs by no more than 1.
- Follow bottoms up approach
- At each given node ensure the abs diff between left and right is not exceeding 1.
- if exceeding return -1 and return false in main function!


### 3. [100. Same tree](https://leetcode.com/problems/same-tree/submissions/1634736184/)

- Simple question to solve
- Check for null checks, if both root are null return true if either null then return false
- After that call for recursion for both lefts and right respectively, and if both true then true will be returned, thanks!


