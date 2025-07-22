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

# 📚 Java Enum Guide

## 🔰 What is an Enum?

An `enum` (short for *enumeration*) is a special Java type used to define collections of constants. It provides type safety and is used when a variable can only take a predefined set of values.

---

## ✅ Key Features

- Fixed set of constants
- Type-safe
- Can have fields, methods, and constructors
- Useful in switch statements
- Implements `java.lang.Enum`

---

## 🧪 Simple Example

```java
// Define enum
enum Day {
    MONDAY, TUESDAY, WEDNESDAY
}

// Use enum
public class EnumDemo {
    public static void main(String[] args) {
        Day today = Day.MONDAY;

        if (today == Day.MONDAY) {
            System.out.println("Start of the work week!");
        }
    }
}
```
# 📘 Java Annotations

## 📌 What is an Annotation?

An annotation in Java is a special form of **metadata** that provides information about the code but **does not change the program's logic**. They are used to instruct the compiler, generate code, configure frameworks, or perform runtime checks.

---

## ✅ Why Use Annotations?

- Provide **compiler instructions**
- Used by **frameworks** (like Spring, Hibernate)
- Enable **code generation and configuration**
- Help with **runtime processing** (e.g., reflection)

---

## 🚀 Common Built-in Annotations

| Annotation         | Description                                                                 |
|--------------------|-----------------------------------------------------------------------------|
| `@Override`         | Indicates a method overrides a superclass method                            |
| `@Deprecated`       | Marks a method/class as outdated                                            |
| `@SuppressWarnings` | Tells compiler to ignore specific warnings                                  |
| `@FunctionalInterface` | Indicates the interface contains exactly one abstract method            |
| `@SafeVarargs`      | Suppresses unsafe operations warning for varargs methods                   |

---

## 🧪 Code Snippet: Using Annotations

```java
class Animal {
    @Deprecated
    void sound() {
        System.out.println("Animal makes sound");
    }
}

public class Main {
    @Override
    public String toString() {
        return "Main class";
    }

    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound();  // Warning: Deprecated method
    }
}
```
# Java Lambda Functions

This README documents the study of Lambda Functions in Java, a key feature introduced in Java 8 for writing clean, functional-style code.

## 🔍 What are Lambda Functions?
Lambda functions (or lambda expressions) allow you to write anonymous methods in a shorter and more expressive way. They are mostly used to implement functional interfaces.

### ✅ Syntax
```java
(parameters) -> expression
(parameters) -> { statements; }

```

# 📚 Java Exception & Error Handling Guide

This document covers the basics and advanced concepts of **exception** and **error handling** in Java, aimed to help learners understand and apply robust error-handling practices in their projects.

---

## 📌 What is an Exception?

An **exception** is an unwanted or unexpected event that occurs during the execution of a program, disrupting its normal flow.

Java uses a powerful mechanism to handle such situations through:
- `try` and `catch` blocks
- `finally` block
- `throw` and `throws` keywords

---

## ⚙️ Types of Exceptions

### 1. **Checked Exceptions**
- Detected at **compile-time**
- Must be either caught or declared using `throws`
- **Examples**: `IOException`, `SQLException`, `FileNotFoundException`

### 2. **Unchecked Exceptions**
- Detected at **runtime**
- Not mandatory to catch or declare
- **Examples**: `NullPointerException`, `ArithmeticException`, `ArrayIndexOutOfBoundsException`

---

## 💣 What is an Error?

Errors indicate serious problems that a typical application should not try to handle.

- **Examples**: `OutOfMemoryError`, `StackOverflowError`
- Belong to the `java.lang.Error` class hierarchy

---

## 🧪 Exception Handling Syntax

```java
try {
    // Risky code
} catch (ExceptionType e) {
    // Handling code
} finally {
    // Always executed
}
```

# Java Input Methods: Scanner vs BufferedReader

This guide explains the differences between two common input methods in Java: `Scanner` and `BufferedReader`.

---

## 🔍 Overview

Java provides multiple ways to read input from the console. The two most commonly used classes are:

- `Scanner` (from `java.util`)
- `BufferedReader` with `InputStreamReader` (from `java.io`)

---

## 🔄 Comparison Table

| Feature                     | `Scanner`                        | `BufferedReader` + `InputStreamReader`       |
|----------------------------|----------------------------------|----------------------------------------------|
| ✅ Ease of Use              | Very beginner-friendly           | Slightly complex setup                       |
| 🔄 Input Type               | Token-based                      | Line-based                                   |
| 🔧 Data Conversion          | Built-in (`nextInt()`, etc.)     | Manual (`Integer.parseInt()`, etc.)          |
| 🚀 Performance              | Slower for large inputs          | Faster (uses internal buffer)                |
| 📦 Package Required         | `java.util.Scanner`              | `java.io.*`                                  |
| 🧠 Common Use Cases         | Simple apps, learning, small input | File reading, performance-sensitive input   |

---

## 🧪 Example Code

### ✅ Using Scanner

```java
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("You entered: " + num);
    }
}
```

# Java Input Handling Using BufferedReader

This project demonstrates how to read input from the user in Java using `BufferedReader`, including both manual and modern approaches. It focuses on **try-with-resources**, a recommended practice for managing input streams safely and cleanly.

---

## 📌 Why Use BufferedReader?

- It reads **text efficiently**, especially useful for reading lines of input.
- Often used with `InputStreamReader` to take input from the console (`System.in`).
- Faster than `Scanner` for large inputs.

---

## 📚 Required Imports

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        int num = 0;
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            num = Integer.parseInt(br.readLine());
            System.out.println(num);
        } finally {
            br.close(); // Must be closed manually
        }
    }
}
```
# 🧵 Java Threads - Complete Guide

This document provides a complete overview of **threads in Java**, including how to create, manage, and synchronize threads. Threads allow a Java program to perform multiple tasks concurrently.

---

## 🚀 What is a Thread?

A **thread** is a lightweight subprocess — the smallest unit of processing in a program. Java supports **multithreading**, which means executing multiple threads in parallel to improve application performance and responsiveness.

---

## 🔁 Thread Lifecycle

A Java thread can be in one of the following states:

1. **New** – Thread is created but not started.
2. **Runnable** – Thread is ready to run.
3. **Running** – Thread is executing.
4. **Blocked/Waiting** – Thread is waiting for a resource or signal.
5. **Terminated (Dead)** – Thread has completed or was stopped.

![Thread Lifecycle](https://upload.wikimedia.org/wikipedia/commons/7/7a/Thread_life_cycle_in_Java.png)

---

## 🧪 Ways to Create a Thread in Java

Java provides **three main ways** to create a thread:

---

### 1️⃣ Extending the `Thread` class

```java
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }
}

public class TestThread {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();  // Start the thread
    }
}

```
### 2️⃣ Implementing the Runnable interface 
```java
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Runnable thread is running...");
    }
}

public class TestRunnable {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable());
        t1.start();  // Start the thread
    }
}
```

### 3️⃣ Using Lambda Expressions (Java 8+)
```java
public class LambdaThread {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            System.out.println("Thread using lambda expression!");
        });
        t.start();  // Start the thread
    }
}
```
# 🚦 Java Race Condition Demo

This project demonstrates how **race conditions** can occur in multithreaded environments and how to prevent them using `synchronized` methods in Java.

---

## 🧠 What is a Race Condition?

A **race condition** occurs when two or more threads access shared data and try to change it at the same time. Since thread scheduling is unpredictable, the final result can vary and lead to incorrect behavior.

### Example:
- Two threads increment a shared counter 1000 times each.
- Expected result: `2000`
- Without synchronization, the actual result may be **less than 2000** due to thread interference.

---

## ✅ How This Code Fixes It

This example uses `synchronized` in the `increment()` method to ensure that **only one thread at a time** can update the counter.

```java
public synchronized void increment() {
    count++;
}
```
# 🔄 Java Thread Lifecycle States

In Java, threads go through different **lifecycle states** during their execution. Understanding these states is essential for building multithreaded applications safely and efficiently.

---

## 🧵 Thread States Overview

| State           | Description                                                                 |
|------------------|-----------------------------------------------------------------------------|
| `NEW`            | The thread has been created but not yet started using `start()`.           |
| `RUNNABLE`       | The thread is ready to run and waiting for CPU time.                       |
| `RUNNING`        | Thread is actively executing code. (Note: In Java, this is part of `RUNNABLE`) |
| `BLOCKED`        | The thread is waiting to acquire a monitor lock (e.g., inside a `synchronized` block). |
| `WAITING`        | The thread is waiting indefinitely for another thread to perform an action (e.g., `wait()`, `join()` without timeout). |
| `TIMED_WAITING`  | The thread is waiting for another thread but only for a specific time (e.g., `Thread.sleep()`, `join(timeout)`). |
| `TERMINATED`     | The thread has completed execution or has been aborted.                    |

---

## 🔁 Example Lifecycle

```java
Thread t = new Thread(() -> {
    System.out.println("Running...");
});

System.out.println(t.getState()); // NEW
t.start();
System.out.println(t.getState()); // RUNNABLE
```
# 📚 Java Collections API

The **Java Collections Framework (JCF)** is a set of classes and interfaces that implement commonly reusable data structures like lists, sets, queues, and maps.

---

## 🧩 Why Use Collections?

- Store, retrieve, and manipulate groups of objects efficiently
- Avoid the complexity of writing your own data structures
- Handle dynamic data (size can grow/shrink)

---

## 🗂️ Collection Hierarchy

```text
             Iterable
                |
             Collection
     ___________|___________
    |           |           |
  List         Set        Queue
                |
              SortedSet
```
```java
import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple"); // Allowed

        System.out.println(fruits); // [Apple, Banana, Apple]
    }
}
Set<String> names = new HashSet<>();
names.add("Alice");
names.add("Bob");
names.add("Alice"); // Ignored

System.out.println(names); // [Alice, Bob]
Queue<String> queue = new LinkedList<>();
queue.add("A");
queue.add("B");
System.out.println(queue.poll()); // A (removes head)
List<Integer> nums = Arrays.asList(4, 2, 7);
Collections.sort(nums);
System.out.println(nums); // [2, 4, 7]

```

# 📘 Java ArrayList Collection

## 🔍 What is `ArrayList`?

`ArrayList` is a **resizable array implementation** of the `List` interface in Java. It allows:
- Random access to elements using indices (like an array)
- Dynamic resizing (it grows automatically when needed)
- Duplicate elements
- Insertion order is maintained

---

## ✅ Key Features of `ArrayList`

- Belongs to the `java.util` package
- Implements `List` interface
- Allows duplicates
- Maintains insertion order
- Not synchronized (not thread-safe)
- Supports null elements

---

## 🔧 Basic Operations

| Operation    | Method              |
|--------------|---------------------|
| Add element  | `add()`              |
| Remove element | `remove()`         |
| Access element | `get(index)`       |
| Replace element | `set(index, obj)` |
| Size         | `size()`             |

---

## 🧪 Example Code

```java
import java.util.ArrayList;
import java.util.Collection;

public class ArrayListCol {
    public static void main(String[] args) {
        // Declare a Collection of Integers using ArrayList
        Collection<Integer> nums = new ArrayList<Integer>();

        // Add elements to the list
        nums.add(1);
        nums.add(3);
        nums.add(6);
        nums.add(9);

        // Loop using Object type (non-generic for-each)
        for (Object n : nums) {
            System.out.println(n); // Auto-unboxing from Integer to int
        }

        // Loop using int type (generics allow type-safe iteration)
        for (int n : nums) {
            System.out.println(n);
        }

        // Print entire list
        System.out.println(nums);
    }
}
```

# 📘 Java `List` Interface - Full Guide

## 🔍 What is `List`?

The `List` interface in Java is a part of the `java.util` package and extends the `Collection` interface. It represents an **ordered collection (sequence)** that allows:

- Duplicate elements
- Index-based access
- Dynamic resizing (for implementations like `ArrayList` and `LinkedList`)

---

## 🧰 Common Implementations

| Implementation | Characteristics |
|----------------|------------------|
| `ArrayList`    | Fast random access, not thread-safe, resizable array |
| `LinkedList`   | Better at frequent insertion/deletion in middle |
| `Vector`       | Synchronized, legacy class |

---

## ✅ Key Features of `List`

- Maintains **insertion order**
- Allows **duplicate elements**
- Can access elements by **index**
- Supports **null values**
- Allows insertion at a specific index
- Can iterate using for-loop, iterator, stream, etc.

---

## 🔧 Useful `List` Methods

| Method             | Description                                      |
|--------------------|--------------------------------------------------|
| `add(E e)`         | Adds element to end                              |
| `add(int index, E)`| Adds element at specific index                   |
| `addAll(Collection c)` | Adds all elements from another collection   |
| `get(int index)`   | Returns element at index                         |
| `remove(int index)`| Removes element at index                         |
| `set(int index, E)`| Replaces element at index                        |
| `contains(Object o)` | Checks if list contains an element            |
| `indexOf(Object o)` | Returns first index of element                 |
| `size()`           | Returns number of elements                       |
| `clear()`          | Removes all elements                             |
| `isEmpty()`        | Checks if list is empty                          |

---

## 🧪 Java Example: `List` with `ArrayList`

```java
import java.util.ArrayList;
import java.util.List;

public class ListCollection {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();

        // Adding elements
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        System.out.println("Initial List: " + l1);

        // Adding at specific index
        l1.add(2, 12);
        System.out.println("After l1.add(2, 12): " + l1);

        // Updating value
        l1.set(1, 99);
        System.out.println("After l1.set(1, 99): " + l1);

        // Getting element
        int element = l1.get(3);
        System.out.println("Element at index 3: " + element);

        // Removing element
        l1.remove(0);
        System.out.println("After l1.remove(0): " + l1);

        // Searching element
        boolean hasValue = l1.contains(99);
        System.out.println("Contains 99? " + hasValue);

        // Size
        System.out.println("List size: " + l1.size());

        // Clearing list
        l1.clear();
        System.out.println("After l1.clear(): " + l1);
        System.out.println("Is list empty? " + l1.isEmpty());
    }
}
```

# 📘 Java Set Interface & Its Implementations

## 🔍 What is a Set?

A `Set` in Java is a **collection that cannot contain duplicate elements**. It models the mathematical set abstraction and is a part of the `java.util` package. The `Set` interface extends `Collection`.

---

## ✅ Key Features of Set

- **No duplicates allowed**
- **Unordered** (in case of `HashSet`)
- Can store **null values** (depends on implementation)
- Suitable for checking **presence/absence** of items

---

## 🔧 Common Implementations of Set

| Type            | Order Maintained | Allows null | Sorted? | Performance | Unique Feature |
|-----------------|------------------|-------------|---------|-------------|----------------|
| `HashSet`       | ❌ No             | ✅ Yes       | ❌ No    | ✅ Fast       | Backed by HashMap |
| `LinkedHashSet` | ✅ Yes (insertion)| ✅ Yes       | ❌ No    | ⚠️ Slightly slower | Maintains insertion order |
| `TreeSet`       | ✅ Yes (sorted)   | ❌ No        | ✅ Yes   | ❗ Slower     | Elements auto-sorted (uses Red-Black Tree) |

---

## 🧪 Java Example: Set, HashSet, TreeSet, LinkedHashSet

```java
import java.util.*;

public class SetExamples {
    public static void main(String[] args) {
        // HashSet: Unordered, allows null
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Banana");
        hashSet.add("Apple");
        hashSet.add("Mango");
        hashSet.add("Apple"); // Duplicate
        hashSet.add(null);

        System.out.println("HashSet: " + hashSet);  // Order not guaranteed

        // LinkedHashSet: Maintains insertion order
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Banana");
        linkedHashSet.add("Apple");
        linkedHashSet.add("Mango");
        linkedHashSet.add("Apple"); // Duplicate
        linkedHashSet.add(null);

        System.out.println("LinkedHashSet: " + linkedHashSet); // Order preserved

        // TreeSet: Sorted order, no nulls allowed
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Mango");
        // treeSet.add(null); // ❌ Will throw NullPointerException

        System.out.println("TreeSet: " + treeSet);  // Sorted alphabetically

        // Common operations
        System.out.println("Size of HashSet: " + hashSet.size());
        System.out.println("Does HashSet contain 'Apple'? " + hashSet.contains("Apple"));
        hashSet.remove("Banana");
        System.out.println("HashSet after removing Banana: " + hashSet);
        hashSet.clear();
        System.out.println("HashSet after clear: " + hashSet);
        System.out.println("Is HashSet empty? " + hashSet.isEmpty());
    }
}
```