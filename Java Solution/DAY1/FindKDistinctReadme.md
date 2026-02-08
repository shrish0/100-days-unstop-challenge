
---

# [🔤 K-th Unique String Problem](https://unstop.com/code/challenge-assessment/250739?moduleId=372)

## 📌 Problem Overview

Ashish has a collection of **N strings**, where some strings may be duplicated.
He wants to find the **k-th distinct (unique) string** based on the S**original order of appearance**.

A string is considered **distinct** if it appears **exactly once** in the collection.

If the total number of distinct strings is **less than `k`**, the output should be **`-1`**.

---

## 📥 Input Format

* First line: Integer `N` — number of strings
* Next `N` lines: Strings
* Last line: Integer `k`

---

## 📤 Output Format

* Print the **k-th distinct string**
* Print `-1` if fewer than `k` distinct strings exist

---

## 🧠 Key Insight

To solve this problem correctly, we must ensure two things:

1. **Uniqueness** → The string must appear exactly once
2. **Order preservation** → The order of strings matters

Different data structures can be used to achieve this in different ways.

---

# 🧩 Approach 1: Using **Two HashSets**

### Idea

* Use one set to track **all seen strings**
* Use another set to track **currently unique strings**
* Remove a string from the unique set as soon as it appears again
* Traverse the original array to find the k-th unique string

### Data Structures Used

* `HashSet parsed` → Tracks all seen strings
* `HashSet unique` → Tracks strings that are currently unique

### Characteristics

* Simple and intuitive
* Requires **two passes**
* Order is preserved manually by re-traversing the input array

### Complexity

* **Time:** `O(N)`
* **Space:** `O(N)`

### When to Use

* Good for understanding uniqueness logic
* Suitable for small to medium inputs

---

---

# 🧩 Approach 2: Using **LinkedHashMap**

### Idea

* Use a map to **count frequency** of each string
* Use `LinkedHashMap` to **preserve insertion order**
* Iterate through the map to find the k-th string with frequency = 1

### Data Structures Used

* `LinkedHashMap<String, Integer>`

### Characteristics

* Cleanest and most readable approach
* Order preservation is automatic
* Very easy to reason about

### Complexity

* **Time:** `O(N)`
* **Space:** `O(N)`

### When to Use

* **Best choice for interviews**
* Recommended for production-quality code
* When clarity and correctness are top priorities

---

---

# 🧩 Approach 3: Using **HashSet + LinkedHashSet**

### Idea

* Use a `HashSet` to track whether a string has been seen
* Use a `LinkedHashSet` to store strings that appear **exactly once**, in order
* Remove strings from the ordered set when duplicates are found
* Directly iterate over the ordered set to find the k-th unique string

### Data Structures Used

* `HashSet parsed` → Fast lookup for seen strings
* `LinkedHashSet unique` → Maintains unique strings in input order

### Characteristics

* Efficient and elegant
* Avoids frequency maps
* Order is preserved automatically via `LinkedHashSet`

### Complexity

* **Time:** `O(N)`
* **Space:** `O(N)`

### When to Use

* Competitive programming
* When you want order + uniqueness without maps
* When performance and structure both matter

---

## 🧪 Example Walkthrough

### Input

```
6
d
b
c
b
c
a
2
```

### Explanation

* Distinct strings (appear once): `d`, `a`
* Order: `d` → `a`
* k = 2 → Output = `a`

---

## 🧪 Another Example

### Input

```
3
dac
ba
a
1
```

### Explanation

* All strings are unique
* Order: `dac`, `ba`, `a`
* k = 1 → Output = `dac`

---

## 🧠 Comparison Summary

| Aspect             | Two HashSets | LinkedHashMap | HashSet + LinkedHashSet |
| ------------------ | ------------ | ------------- | ----------------------- |
| Order preserved    | Manual       | Automatic     | Automatic               |
| Readability        | Medium       | ⭐⭐⭐⭐⭐         | ⭐⭐⭐⭐                    |
| Data structures    | 2 Sets       | 1 Map         | 1 Set + 1 Ordered Set   |
| Interview-friendly | ⭐⭐⭐          | ⭐⭐⭐⭐⭐         | ⭐⭐⭐⭐                    |
| Competitive coding | ⭐⭐⭐⭐         | ⭐⭐⭐           | ⭐⭐⭐⭐⭐                   |

---

## 🎯 Final Takeaway

> There are multiple correct ways to solve this problem.
> The **best approach depends on clarity, constraints, and use case**.

* Prefer **LinkedHashMap** for interviews and clean design
* Prefer **HashSet + LinkedHashSet** for performance-focused solutions
* Use **two HashSets** to build strong fundamentals

---
