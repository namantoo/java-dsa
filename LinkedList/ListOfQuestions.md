# Linked List Progress

## 1. Custom Implementation (Basics in Java)
Created `Node` class with `int data` and `Node next`.

Built a custom `LinkedList` class with:
- `insertAtEnd(int data)`
- `insertAtBeginning(int data)`
- `insertAt(int index, int data)`
- `deleteAt(int index)`
- `getAt(int index)`
- `display()`
- `size()`

---

## 2. Questions

### 1. [237. Delete Node in a Linked List](https://leetcode.com/problems/delete-node-in-a-linked-list/)
- Understood deletion without access to head.
- Learned how to overwrite current node’s data with the next node’s.

**Summary:** Deleted node by copying data of the next node.

---

### 2. [19. Remove Nth Node From End of List](https://leetcode.com/problems/remove-nth-node-from-end-of-list/)
- Two-pass approach using length → delete (length - n + 1)th node.
- One-pass approach using slow and fast pointers.
- Understood use of dummy node for edge-case handling.

**Summary:** Used fast-slow pointers with dummy to handle one-pass deletion.

---

### 3. [160. Intersection of Two Linked Lists](https://leetcode.com/problems/intersection-of-two-linked-lists/)
- Two-pass method using length difference.
- Understood optimal approach: reset pointers on reaching null.
- Understood why the reset trick works (equalizes travel distance).

**Summary:** Used two-pointer reset trick to find intersection.

---

### 4. [876. Middle of the Linked List](https://leetcode.com/problems/middle-of-the-linked-list/)
- Count approach (two-pass).
- Optimized slow & fast pointer method.
- Understood odd/even length behavior.
- Clarified why condition is `while (fast != null && fast.next != null)`.

**Summary:** Used slow-fast pointer; slow is at middle when fast ends.

---

### 5. [2095. Delete the Middle Node of a Linked List](https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/)
- Used slow and fast pointer approach.
- Located node before the middle and updated `next` pointer.
- Understood edge case when list has only one node.

**Summary:** Deleted middle by finding previous of middle with slow pointer.

---

### 6. [141. Linked List Cycle](https://leetcode.com/problems/linked-list-cycle/)
- New topic: Cycle Detection.
- Used Floyd’s Cycle Detection Algorithm (slow-fast pointer).
- Understood `fast != null && fast.next != null` condition.
- Compared `while(fast != slow)` vs `while(true)` variants.

**Summary:** Detected cycle using Floyd’s algorithm (meeting point logic).

---

### 7. [142. Linked List Cycle II](https://leetcode.com/problems/linked-list-cycle-ii/)
- First detected cycle.
- Moved one pointer from head and one from meeting point.
- Understood where they meet is the start of the cycle.
- Clarified distance logic: `a = c` where `a` is distance from head to cycle start, `c` is from meet point to start.

**Summary:** Found cycle start using slow pointer reset to head.

### 8. [328. Odd Even Linked List](https://leetcode.com/problems/odd-even-linked-list/description/)

- used odd and even pointers
- started from linking odd to next, then updated the odd to odd.next
- initialised even and evenhead(to keep track of first even)
- even.next = odd.next , even =  even.next;

### 9. [Odd Even Linked List (Here values are odd/even not indeces)](https://github.com/namantoo/java-dsa/blob/main/LinkedList/OddEvenVariation.java)

- used a curr pointer to iterate over the linked list
- if curr val is odd and head and tail are empty we update the same else we point the tail towards the curr val
- same for even
- at last we link and return the new ll.

### 10. [83. Remove Duplicates from sorted list](https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/)

- used a curr pointer to iterate over the linked list
- if curr val is odd and head and tail are empty we update the same else we point the tail towards the curr val
- same for even
- at last we link and return the new ll.

### 11. [206. Reverse Linked List](https://leetcode.com/problems/reverse-linked-list/description/)

- hurray!! could reverse a linked list after 4 years of engineering xD
- follow up: do iteratively


### 11. [234. Palindrome Linked List](https://leetcode.com/problems/palindrome-linked-list/description/)

- Mix of recursion + middle element
- 
1 2 3 4 5 

1 2 3 2 1

1 2 3 3 2 1





---
