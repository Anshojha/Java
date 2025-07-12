# 📚 Data Structures in Java – Overview and Use Cases

This project covers the fundamentals and implementation of various **data structures in Java**, focusing on both theoretical and practical aspects.

---

## 🧠 What is a Data Structure?

A **data structure** is a way to organize and store data efficiently for operations like searching, sorting, insertion, and deletion.

### ✅ Key Features
- **Predefined and Custom Implementations**
- **Dynamic Memory Allocation**
- **Generics Support**
- **Thread-Safe Options (Concurrent Collections)**

---

## 📂 Types of Data Structures in Java

### 🔹 Linear Data Structures
| Type        | Description |
|-------------|-------------|
| **Array**   | Fixed-size sequential collection of elements. |
| **Linked List** | Dynamically growing list using nodes. |
| **Stack**   | LIFO structure – last inserted, first removed. |
| **Queue**   | FIFO structure – first inserted, first removed. |

### 🔸 Hierarchical Data Structures
| Type        | Description |
|-------------|-------------|
| **Tree**           | Hierarchical nodes starting from root. |
| **Binary Tree**    | Each node has at most 2 children. |
| **BST (Binary Search Tree)** | Sorted tree for fast searching. |
| **Heap**           | Priority-based structure (Min/Max). |

### 🔷 Graphs
- Nodes (vertices) and edges.
- Can be **directed** or **undirected**.

### 🔶 Hash-Based Structures
- **HashMap**: Key-value pairs.
- **HashSet**: Unique values only.

### 🧪 Advanced Structures
- **Trie**: Prefix-based searching.
- **Segment Tree**: Range queries.
- **Red-Black Tree**: Self-balancing BST.

---

## 🔁 Linked Lists

### 1. Singly Linked List (SLL)
- Nodes point to the next.
- Last node points to `null`.

```java
class Node {
    int data;
    Node next;
}
```
# 📚 Stacks in Java

## ✅ What is a Stack?

A **Stack** is a linear data structure that follows the **LIFO** (Last In, First Out) principle.

- The last element added is the first one to be removed.
- Used when **reverse processing** is needed.

---

## ⚙️ Key Operations

| Operation | Description |
|----------|-------------|
| `push(E e)` | Adds an element to the top of the stack |
| `pop()` | Removes and returns the top element |
| `peek()` | Returns the top element without removing it |
| `isEmpty()` | Checks if the stack is empty |

---

## 💡 Use Cases of Stack

- Expression evaluation (infix to postfix, prefix conversion)
- Undo/redo functionality in text editors
- Backtracking algorithms
- Reversing strings or data
- Function call stack in recursion

---

## 🧪 Problem: Balanced Parentheses Checker

**Given a string containing brackets (`()`, `{}`, `[]`), check if it is balanced.**

### ✔️ Balanced
- Every opening bracket has a matching closing bracket.
- Brackets are properly nested.

### ❌ Unbalanced
- Mismatched brackets.
- Closing bracket comes without a matching open.
- Extra open brackets remain.

---

## 🔍 Approach

1. Create a stack.
2. Iterate through the string:
   - If it's an opening bracket (`(`, `{`, `[`), push it.
   - If it's a closing bracket:
     - If stack is empty → return false.
     - Pop the top and check if it matches.
3. After loop:
   - If stack is empty → string is balanced.
   - Else → unbalanced.

---

## 🧠 Algorithm

```text
1. Create a Stack
2. For each character in the string:
   a. If opening bracket → push to stack
   b. If closing bracket:
      i.  If stack is empty → return false
      ii. Pop from stack and check if brackets match
3. After loop → if stack is empty → return true, else false
```
# 🔄 Queues in Java

## 📘 What is a Queue?

A **Queue** is a linear data structure that follows the **FIFO (First In, First Out)** principle — the first element added is the first to be removed.

It is widely used in:
- Scheduling processes
- Request handling
- Resource management
- Graph traversal (like BFS)

---

## 🚀 Types of Queues in Java

| Type              | Description                                                  |
|-------------------|--------------------------------------------------------------|
| **Simple Queue**  | Basic FIFO queue                                             |
| **PriorityQueue** | Orders elements based on priority (natural or custom order)  |
| **Deque**         | Double-ended queue: insert/remove from both ends             |

---

## ⚙️ Key Queue Operations

```java
queue.offer(element);
queue.poll();
queue.peek();
queue.isEmpty();
```
# 🔐 Hashing Function in Java

## 📌 What is Hashing?

Hashing is a technique that **converts data into a fixed-size integer value**, known as a **hash code** or **hash value**, using a **hash function**.  
It is primarily used to enable **efficient insertion, lookup, and deletion** in data structures like `HashMap`, `HashSet`, and `Hashtable`.

---

## 🧠 Key Concepts

### ✅ Hash Code
- A numeric value representing the object.
- Generated using the `hashCode()` method.
- Used to decide **which bucket** an object should go into.

### ✅ Hash Function
- Converts an object’s data into an integer (`int`).
- Used internally by Java collections to compute the bucket index.

### ✅ Collisions
- Occur when **different objects** return the **same hash code**.
- Handled using:
  - **Separate Chaining** (LinkedList or Tree inside buckets)
  - **Open Addressing** (less common in Java)

### ✅ Buckets
- Logical slots in the hash table

