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



