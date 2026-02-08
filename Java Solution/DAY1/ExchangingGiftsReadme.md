
---

# [🎁 Exchanging Gifts – Finding the Youngest Member](https://unstop.com/code/challenge-assessment/250196?moduleId=372)

## 📌 Problem Overview

In a royal family, gifts are exchanged during Christmas.

The **youngest family member** has a special property:

* They **receive gifts from every other family member**
* They **do not give gifts to anyone**

You are given the list of gift exchanges and must identify the youngest member.

---

## 📥 Input Description

* `n` → Number of family members
* `m` → Number of gifts exchanged
* Next `m` lines contain pairs `(a, b)` meaning:

  * Member `a` gave a gift to member `b`

### Rules

* A family member does **not give more than one gift to the same person**
* Members are labeled from `1` to `n`

---

## 📤 Output Description

* Print the **youngest member’s number**
* Print `-1` if no such member exists

---

## 🧠 Core Observation

A member is the youngest **if and only if**:

* They receive **exactly `n − 1` gifts**
* They give **0 gifts**

This problem is equivalent to finding a **special node in a directed graph**:

* **In-degree = n − 1**
* **Out-degree = 0**

---

## 🧠 Approach 1: HashSet + HashMap (Set-Based Approach)

### Idea

* Track:

  * Who gives gifts (`givers`)
  * Who receives gifts (`receivers`)
  * How many gifts each person receives (`receiveCount`)
* A valid youngest member:

  * Appears in `receivers`
  * Does **not** appear in `givers`
  * Has received `n − 1` gifts

### Characteristics

* Intuitive and easy to reason about
* Uses extra data structures to track relationships

### Complexity

* **Time Complexity:** `O(m + n)`
* **Space Complexity:** `O(n)`

### Remarks

* Easy to implement
* Slightly more memory usage
* Good for understanding the problem

---

---

## 🧠 Approach 2: In-Degree / Out-Degree Counting (Optimized)

### Idea

* Treat each family member as a node
* For each gift:

  * Increase `out-degree` of the giver
  * Increase `in-degree` of the receiver
* The youngest member must satisfy:

  ```
  in-degree == n - 1
  out-degree == 0
  ```

### Characteristics

* Graph-based thinking
* No sets or maps required
* Very efficient and clean

### Complexity

* **Time Complexity:** `O(m + n)`
* **Space Complexity:** `O(n)`

### Remarks

* Best solution for large constraints
* Interview-preferred approach
* Clear mathematical condition

---

## 🧪 Example

### Input

```
3 2
1 3
2 3
```

### Explanation

* Member `3` receives gifts from `1` and `2`
* Member `3` gives no gifts

### Output

```
3
```

---

## ❌ When Output is `-1`

* If no member satisfies both conditions
* If multiple members partially satisfy the conditions
* If gift exchanges are incomplete

---

## 🎯 Final Takeaway

> The youngest member is the **only person with in-degree = n − 1 and out-degree = 0**.

* **Approach 1** helps build intuition
* **Approach 2** is optimal, clean, and scalable

Both are valid, but the second approach is the **recommended final solution**.

---
