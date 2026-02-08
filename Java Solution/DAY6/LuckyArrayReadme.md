
---

# [📈 Day 6 – Lucky Array Modification](https://unstop.com/code/challenge-assessment/306079?moduleId=410)

## 📌 Problem Overview

An astrologer has analyzed an array of integers and determined that it is **not lucky**.
To make the array lucky, a modification is required.

The modification rule is:

> **At each index, increase the value by the maximum value encountered up to that index.**

Your task is to apply this rule and print the modified array.

---

## 📥 Input Format

* First line contains an integer `N`, the size of the array.
* Second line contains `N` space-separated integers representing the array elements.

---

## 📤 Output Format

* Print the modified array after applying the transformation.

---

## 🧠 Approach Used

The solution maintains a running maximum while iterating through the array.

### Steps:

1. Initialize a variable `max` to track the maximum value seen so far.
2. Traverse the array from left to right.
3. At each element:

   * Update `max` if the current value is greater.
   * Add the current value and `max` to the result list.
4. Print the modified array.

This ensures each element is increased by the maximum value encountered up to that index.

---

## 🧪 Example Walkthrough

### Sample Input

```
3
1 2 3
```

### Step-by-Step Processing

| Index | Value | Max so far | New Value |
| ----- | ----- | ---------- | --------- |
| 0     | 1     | 1          | 2         |
| 1     | 2     | 2          | 4         |
| 2     | 3     | 3          | 6         |

### Output

```
2 4 6
```

---

## 🧪 Edge Case

### Input

```
1
12
```

### Output

```
24
```

Explanation:
Only one element exists, so it is increased by itself.

---

## ⏱️ Complexity Analysis

* **Time Complexity:** `O(N)`
* **Space Complexity:** `O(N)` (for storing the modified array)

---

## 🎯 Final Takeaway

> By keeping track of the maximum value encountered so far, the array can be modified efficiently in a single pass.

This approach is:

* Simple
* Efficient
* Easy to understand

---

