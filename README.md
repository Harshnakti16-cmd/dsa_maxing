# Data Structures & Algorithms Practice Solutions

A structured repository of LeetCode & Data Structures and Algorithms solutions implemented in **Java**, organized cleanly by topic.

---

## 📁 Repository Structure

```text
practice/
├── 📂 arrays/          # Arrays, Two Pointers, Binary Search & Hashing Problems
├── 📂 linkedlist/      # Singly Linked List Data Structure Problems
└── 📂 stack/           # Stack Data Structure & Expression Evaluation Problems
```

---

## 📚 Problem Solutions Index

### 1. 🟢 Arrays & Searching (`arrays/`)

| # | Problem | LeetCode | Approach | Solution Link |
|---|---------|----------|----------|---------------|
| 1 | Binary Search | [#704](https://leetcode.com/problems/binary-search/) | Two Pointers (Divide & Conquer) | [BinarySearch.java](file:///c:/PW2/practice/arrays/BinarySearch.java) |
| 2 | Best Time to Buy & Sell Stock | [#121](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/) | One Pass Tracking Minimum Price | [BuySell1.java](file:///c:/PW2/practice/arrays/BuySell1.java) |
| 3 | Buy & Sell Stock (with Buy/Sell Values) | [#121 Variant](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/) | One Pass Tracking Values & Max Profit | [BuySell2.java](file:///c:/PW2/practice/arrays/BuySell2.java) |
| 4 | Contains Duplicate / Find Duplicate | [#217](https://leetcode.com/problems/contains-duplicate/) | HashSet Traversal | [DuplicateContaining.java](file:///c:/PW2/practice/arrays/DuplicateContaining.java) |
| 5 | Merge Sorted Arrays | [#88 Variant](https://leetcode.com/problems/merge-sorted-array/) | Two Pointers Comparison | [MergeSortedArrays.java](file:///c:/PW2/practice/arrays/MergeSortedArrays.java) |
| 6 | Valid Palindrome | [#125](https://leetcode.com/problems/valid-palindrome/) | Two Pointers Inward Scan | [Palindrome.java](file:///c:/PW2/practice/arrays/Palindrome.java) |
| 7 | Remove Duplicates from Sorted Array | [#26](https://leetcode.com/problems/remove-duplicates-from-sorted-array/) | Two Pointers In-Place Update | [RemoveDuplicates.java](file:///c:/PW2/practice/arrays/RemoveDuplicates.java) |
| 8 | Two Sum (Brute Force) | [#1](https://leetcode.com/problems/two-sum/) | $O(N^2)$ Pair Checking | [TwoSumBruteForce.java](file:///c:/PW2/practice/arrays/TwoSumBruteForce.java) |
| 9 | Two Sum (Optimal) | [#1](https://leetcode.com/problems/two-sum/) | $O(N)$ HashMap Complement Lookup | [TwoSumOptimal.java](file:///c:/PW2/practice/arrays/TwoSumOptimal.java) |
| 10 | Valid Anagram | [#242](https://leetcode.com/problems/valid-anagram/) | HashMap Character Frequency Counter | [ValidAnagrams.java](file:///c:/PW2/practice/arrays/ValidAnagrams.java) |

---

### 2. 🔵 Linked List (`linkedlist/`)

| # | Problem | LeetCode | Approach | Solution Link |
|---|---------|----------|----------|---------------|
| 1 | Convert Binary in Linked List to Integer | [#1290](https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/) | Bit Shift / Multiply by 2 | [BinaryToInteger.java](file:///c:/PW2/practice/linkedlist/BinaryToInteger.java) |
| 2 | Delete Node in a Linked List | [#237](https://leetcode.com/problems/delete-node-in-a-linked-list/) | Node Value Replacement | [DeleteNode.java](file:///c:/PW2/practice/linkedlist/DeleteNode.java) |
| 3 | Linked List Implementation & Demo | Basics | Custom Node Linking & Traversal | [LinkedListDemo.java](file:///c:/PW2/practice/linkedlist/LinkedListDemo.java) |
| 4 | Linked List Cycle Detection | [#141](https://leetcode.com/problems/linked-list-cycle/) | Floyd's Fast & Slow Pointers | [LinkedListHasCycle.java](file:///c:/PW2/practice/linkedlist/LinkedListHasCycle.java) |
| 5 | Intersection of Two Linked Lists | [#160](https://leetcode.com/problems/intersection-of-two-linked-lists/) | Two Pointer Swapping Traversal | [LinkedListIntersection.java](file:///c:/PW2/practice/linkedlist/LinkedListIntersection.java) |
| 6 | Middle of the Linked List | [#876](https://leetcode.com/problems/middle-of-the-linked-list/) | Fast & Slow Pointers | [LinkedListMiddle.java](file:///c:/PW2/practice/linkedlist/LinkedListMiddle.java) |
| 7 | Remove Duplicates from Sorted List | [#83](https://leetcode.com/problems/remove-duplicates-from-sorted-list/) | Single Pass Pointer Skip | [LinkedListRemoveDuplicates.java](file:///c:/PW2/practice/linkedlist/LinkedListRemoveDuplicates.java) |
| 8 | Remove Linked List Elements | [#203](https://leetcode.com/problems/remove-linked-list-elements/) | Dummy Head / Pointer Relinking | [LinkedListRemoveElements.java](file:///c:/PW2/practice/linkedlist/LinkedListRemoveElements.java) |
| 9 | Merge Two Sorted Lists | [#21](https://leetcode.com/problems/merge-two-sorted-lists/) | Dummy Node Two Pointers | [MergeSortedList.java](file:///c:/PW2/practice/linkedlist/MergeSortedList.java) |
| 10 | Remove Nth Node From End of List | [#19](https://leetcode.com/problems/remove-nth-node-from-end-of-list/) | Dummy Node + Two Pointer Offset | [RemoveNthElement.java](file:///c:/PW2/practice/linkedlist/RemoveNthElement.java) |
| 11 | Reverse Linked List | [#206](https://leetcode.com/problems/reverse-linked-list/) | Iterative 3-Pointer Reversal | [ReversedLinkedList.java](file:///c:/PW2/practice/linkedlist/ReversedLinkedList.java) |

---

### 3. 🟣 Stack (`stack/`)

| # | Problem | LeetCode | Approach | Solution Link |
|---|---------|----------|----------|---------------|
| 1 | Evaluate Reverse Polish Notation | [#150](https://leetcode.com/problems/evaluate-reverse-polish-notation/) | Stack Postfix Operand Operator Evaluation | [StackEvaluate.java](file:///c:/PW2/practice/stack/StackEvaluate.java) |
| 2 | Min Stack (Get Minimum in O(1)) | [#155](https://leetcode.com/problems/min-stack/) | Auxiliary Min Tracker Stack | [StackGetMin.java](file:///c:/PW2/practice/stack/StackGetMin.java) |
| 3 | Valid Parentheses | [#20](https://leetcode.com/problems/valid-parentheses/) | Stack Bracket Matching | [ValidParanthesis.java](file:///c:/PW2/practice/stack/ValidParanthesis.java) |

---

## 🛠️ How to Run

Compilation for any package:

```bash
# Compile and run StackEvaluate
javac stack/StackEvaluate.java
java stack.StackEvaluate

# Compile all files in a package
javac arrays/*.java
```