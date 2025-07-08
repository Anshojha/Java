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
