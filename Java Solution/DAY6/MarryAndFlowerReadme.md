
---

# [🌸 Flower Bouquet Problem (Two Sum in Sorted Array)](http://unstop.com/code/challenge-assessment/250137?moduleId=410)

## 📌 Problem Overview

Mary wants to prepare a bouquet for her friend and needs **exactly two types of flowers** such that the **total number of flowers equals `t`**.

Her garden contains `N` types of flowers, where the number of flowers in each type is arranged in a **non-decreasing (sorted) order**.

Your task is to determine the **indexes (0-based)** of the two flower types whose sum equals `t`.

> It is guaranteed that **at least one valid pair always exists**.
> If multiple pairs are possible, return the **first occurrence**.

---

## 📥 Input Format

* First line contains two integers:

  * `N` → number of flower types
  * `t` → required total number of flowers
* Second line contains `N` space-separated integers representing the array of flower counts

---

## 📤 Output Format

* Print two space-separated integers representing the **indexes** of the two flower types
* The first index should be **smaller** than the second
* Indexes are **zero-based**

---

## 🧠 Approach Used

Since the array is already **sorted**, the solution uses the **Two Pointer Technique**.

### Steps:

1. Initialize two pointers:

   * `start` at the beginning of the array
   * `end` at the end of the array
2. Calculate the sum of elements at `start` and `end`
3. If the sum equals `t`, return the indices
4. If the sum is greater than `t`, move the `end` pointer left
5. If the sum is less than `t`, move the `start` pointer right
6. Continue until the pair is found

This approach guarantees:

* The **first valid pair**
* The **smallest possible first index**

---

## 🧪 Example

### Sample Input

```
7 5
1 2 2 4 5 7 10
```

### Output

```
0 3
```

### Explanation

* `arr[0] + arr[3] = 1 + 4 = 5`
* This is the first valid pair whose sum equals `t`

---

## 🧪 Another Example

### Sample Input

```
5 2
1 1 2 3 4
```

### Output

```
0 1
```

### Explanation

* `1 + 1 = 2`
* The first occurrence is returned

---

## ⏱️ Complexity Analysis

* **Time Complexity:** `O(N)`
* **Space Complexity:** `O(1)`

This is the **most optimal solution** for a sorted array.

---

## 🎯 Final Takeaway

> When an array is sorted and you need to find two elements with a given sum,
> the **two-pointer approach** provides the best performance with constant space.

---

