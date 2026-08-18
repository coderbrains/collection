# Java Collection Framework – Questions & Implementations

This repository contains Java Collection Framework questions, concepts, and their implementations using Java.

The main purpose of this repository is to understand how different data structures work internally and to practice implementing them from scratch.

## 📚 What This Repository Contains

The repository will cover questions and implementations related to:

* Array-based data structures
* Linked Lists
* Stack
* Queue
* Deque
* HashMap
* HashSet
* TreeMap
* TreeSet
* PriorityQueue
* Iterators
* Generics
* Comparable and Comparator
* Collection Framework concepts
* Time and Space Complexity
* Common interview problems

## 🎯 Goal

The goal is not only to use Java's built-in Collection Framework classes, but also to understand how these data structures work internally.

For example:

```text
Stack
 ├── push()
 ├── pop()
 ├── peek()
 └── isEmpty()

Dynamic Array
 ├── add()
 ├── resize()
 └── get()
```

Implementing these operations manually helps in understanding the underlying concepts before using Java's built-in classes.

## 📂 Repository Structure

The structure may evolve as more questions and implementations are added.

```text
src/
└── collection/
    ├── array/
    ├── linkedList/
    ├── stack/
    ├── queue/
    ├── deque/
    ├── hashmap/
    ├── hashset/
    ├── treemap/
    ├── treeset/
    └── priorityqueue/
```

Each package can contain:

```text
Question
   ↓
Concept
   ↓
Implementation
   ↓
Test / Example
```

## 🧠 Approach

For each topic, the focus is on understanding:

1. What the data structure is.
2. Why it is required.
3. How it works internally.
4. How to implement it.
5. Time complexity of its operations.
6. Space complexity.
7. Common interview questions.
8. Differences between similar data structures.

## 💻 Example

A simple stack implementation using an array:

```java
public class StackArray<E> {

    private E[] arr;
    private int size;
    private int top = -1;

    public StackArray() {
        arr = (E[]) new Object[2];
        size = 0;
    }

    public void push(E data) {
        if (size == 0) {
            arr[0] = data;
            top = 0;
            size++;
            return;
        }

        if (size == arr.length) {
            E[] newArray = (E[]) new Object[arr.length * 2];

            int index = 0;
            while (index != top + 1) {
                newArray[index] = arr[index];
                index++;
            }

            arr = newArray;
        }

        top++;
        size++;
        arr[top] = data;
    }

    public E pop() {
        if (size == 0) {
            throw new IndexOutOfBoundsException("Empty stack");
        }

        E data = arr[top];
        top--;
        size--;

        return data;
    }

    public E peek() {
        if (size == 0) {
            throw new IndexOutOfBoundsException("Empty stack");
        }

        return arr[top];
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
```

The implementation is intentionally written from scratch to understand the underlying behavior of a stack instead of directly using `java.util.Stack` or `Deque`.

## ⏱️ Complexity

Complexity will be documented for each implementation.

For example, an array-based dynamic stack generally has:

| Operation   | Complexity     |
| ----------- | -------------- |
| `push()`    | O(1) amortized |
| `pop()`     | O(1)           |
| `peek()`    | O(1)           |
| `isEmpty()` | O(1)           |
| Resize      | O(n)           |

Although resizing takes `O(n)`, it does not happen on every `push()`, so `push()` is `O(1)` amortized.

## ❓ Questions

The repository will also contain commonly asked Collection Framework questions such as:

* How does `ArrayList` work internally?
* How does `LinkedList` work internally?
* How does `HashMap` work internally?
* Why does `HashMap` allow one `null` key?
* Difference between `ArrayList` and `LinkedList`.
* Difference between `HashMap` and `Hashtable`.
* Difference between `HashSet` and `TreeSet`.
* Difference between `Comparable` and `Comparator`.
* How does hashing work?
* What happens when two keys have the same hash code?
* What is collision handling?
* What is load factor?
* What is resizing?
* Why should `equals()` and `hashCode()` be consistent?
* How does `PriorityQueue` work?
* Difference between `Queue` and `Deque`.
* Why is `ArrayDeque` preferred over `Stack` in many cases?

## 📝 Progress

This repository is continuously updated as new concepts and questions are covered.

* [x] Array-based Stack
* [ ] Linked List
* [ ] Queue
* [ ] Deque
* [ ] ArrayList
* [ ] LinkedList
* [ ] HashMap
* [ ] HashSet
* [ ] TreeMap
* [ ] TreeSet
* [ ] PriorityQueue
* [ ] Iterator
* [ ] Comparable
* [ ] Comparator
* [ ] Collection Framework Interview Questions

## 🚀 How to Use

Clone the repository:

```bash
git clone <repository-url>
```

Open the project in your preferred Java IDE and run the individual implementations and test classes.

It is recommended to read the question/concept first and then try implementing the solution yourself before checking the existing code.

## 🎓 Learning Philosophy

> Don't just learn how to use a data structure. Understand how it works internally.

The implementations in this repository are primarily for learning, practice, and interview preparation. They are not intended to replace Java's production-ready Collection Framework implementations.

## 🛠️ Technology

* Java
* Object-Oriented Programming
* Generics
* Data Structures
* Java Collection Framework

## 📌 Note

Some implementations may intentionally be simplified compared to Java's actual production implementations. The objective is to make the underlying concepts easier to understand and practice.

Happy Coding! ☕
