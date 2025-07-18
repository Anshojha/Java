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

# Java Interfaces

## What is an Interface?

An **interface** in Java is a reference type, similar to a class, that can contain:
- Abstract methods (no body),
- Default methods (with implementation),
- Static methods,
- Constants (public static final by default).

It defines a contract that implementing classes must fulfill.

---

## 🔹 Key Characteristics

- All methods are `public` and `abstract` by default (except static/default).
- All variables are `public static final`.
- A class can implement multiple interfaces (supports multiple inheritance).
- Interfaces cannot be instantiated directly.

---

## 🔹 Syntax

```java
interface Animal {
    void makeSound();
}
```
---

## 🔹 Anonymous Classes in Java

### What is an Anonymous Class?

An **anonymous class** is a **local class without a name**.
It is often used to create **one-time implementations** of interfaces or abstract classes, typically for **short-lived purposes** like event handling, thread creation, or callbacks.

---

### 🔹 Syntax

```java
interface Greeting {
    void sayHello();
}

public class Main {
    public static void main(String[] args) {
        Greeting g = new Greeting() {
            public void sayHello() {
                System.out.println("Hello from anonymous class!");
            }
        };
        g.sayHello();
    }
}
```
# 📦 Java Package

## 🧠 What is a Package?

A **package** in Java is a namespace used to group related classes and interfaces together. It helps organize code, avoid name conflicts, and control access.

---

## 🏷️ Types of Packages

1. **Built-in Packages**: Provided by Java API  
   Example: `java.util`, `java.io`, `java.lang`

2. **User-defined Packages**: Created by the programmer

---

## ✅ Benefits of Using Packages

- Code **modularity** and **reusability**
- **Namespace management**: Prevents class name conflicts
- Access control using **public**, **protected**, **default**
- Easier **project structure** and **maintenance**

---

## 🧰 Creating a Package

### Step 1: Define the package in a `.java` file

```java
// File: mypackage/Message.java
package mypackage;

public class Message {
    public void show() {
        System.out.println("Hello from a package!");
    }
}
```
# 🧩 Java Abstract Class

## 🔍 What is an Abstract Class?

An **abstract class** in Java is a class that **cannot be instantiated** and may contain **abstract methods** (methods without implementation) as well as **concrete methods** (fully defined).

> It's used as a base class for other classes to extend and implement specific functionality.

---

## 🧠 Key Points

- Declared using the `abstract` keyword.
- Can have both **abstract** and **non-abstract** methods.
- Cannot be instantiated directly.
- Used to define **common behavior** for all subclasses.

---

## 📌 Syntax

```java
abstract class Vehicle {
    abstract void start();     // Abstract method
    void stop() {              // Concrete method
        System.out.println("Vehicle stopped");
    }
}
```
# ☕ Java Concepts — Polymorphism, Inner Class, and StringBuffer

---

## 🔁 1. Polymorphism

### 🧠 Definition
Polymorphism means **"many forms"**. In Java, it allows objects to behave differently based on their actual type, even when accessed through a common interface or superclass.

### 📌 Types of Polymorphism

| Type               | Description                                          |
|--------------------|------------------------------------------------------|
| Compile-time (Static) | Achieved using **method overloading**            |
| Runtime (Dynamic)     | Achieved using **method overriding**             |

---

### ✅ Method Overloading (Compile-time)
```java
class MathUtils {
    int add(int a, int b) { return a + b; }
    double add(double a, double b) { return a + b; }
}
```
# 🧬 Java Inner Classes

## 🧠 What is an Inner Class?
An **inner class** is a class defined inside another class in Java. It is associated with its outer class and can access the outer class's members (including private ones).

---

## ✅ Benefits of Inner Classes
- Improves **encapsulation**
- Groups **logically related classes**
- Can access all members of the outer class
- Useful for **event handling** and **callbacks**

---

## 🏗️ Types of Inner Classes

| Type                   | Description                                                           |
|------------------------|------------------------------------------------------------------------|
| Member Inner Class     | Non-static class inside another class. Requires an instance of outer. |
| Static Nested Class    | Static class inside another class. Can’t access non-static outer data. |
| Local Inner Class      | Defined inside a method or block.                                     |
| Anonymous Inner Class  | A one-time class defined and instantiated at once.                    |

---

## 🔹 1. Member Inner Class
```java
class Outer {
    int x = 10;

    class Inner {
        void display() {
            System.out.println("x = " + x);  // Access outer class member
        }
    }
}
```
# 📚 Java Buffered Classes

## 🧠 What Are Buffered Classes?
Buffered classes in Java are used to improve the **efficiency of input and output (I/O)** operations by reducing the number of I/O calls. They use an internal buffer to temporarily hold data, making reading and writing much faster.

---

## 🚀 Common Buffered Classes

| Class           | Package             | Purpose                                  |
|----------------|---------------------|------------------------------------------|
| BufferedReader  | java.io             | Reads text from a character-input stream |
| BufferedWriter  | java.io             | Writes text to a character-output stream |
| BufferedInputStream | java.io         | Reads binary data with buffering         |
| BufferedOutputStream| java.io        | Writes binary data with buffering        |

---

## 🔹 BufferedReader

### ✅ Purpose:
Used to read characters efficiently from files, console, or any character stream.

### 🧾 Constructor:
```java
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
```