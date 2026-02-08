
---

# 📘 Day 1 – Problem Statements

This document contains the **problem statements** for all challenges solved on **Day 1** of the *100 Days Unstop Challenge*.

---

## [♟️ Problem 1: Chessboard Cell Color](https://unstop.com/code/challenge-assessment/250904?moduleId=372)

### Problem Statement

A standard chessboard can be visualized as a **2D Cartesian plane**, where:

* The **x-axis** is represented by lowercase alphabets (`a` to `h`)
* The **y-axis** is represented by numbers (`1` to `8`)

Each cell on the chessboard is either **Black** or **White**.

Given a coordinate in the form of a string, determine whether the corresponding cell is **Black** or **White**.

---

### Input Format

* A single string `s` of length `2`

---

### Output Format

* Print `Black` or `White`

---

### Constraints

* `|s| = 2`

---

### Sample Input

```
a1
```

### Sample Output

```
Black
```

---

## [🎁 Problem 2: Exchanging Gifts (Youngest Family Member)](https://unstop.com/code/challenge-assessment/250196?moduleId=372)

### Problem Statement

The royal family exchanges gifts during Christmas.
The **youngest family member** is defined as the one who:

* **Receives gifts from every other family member**
* **Does not give any gift to anyone**

You are given details of gift exchanges among family members.
Your task is to identify the youngest member.

---

### Input Format

* First line contains two integers `n` and `m`

  * `n`: number of family members
  * `m`: number of gifts exchanged
* Next `m` lines contain two integers `aᵢ`, `bᵢ`

  * `aᵢ` gave a gift to `bᵢ`

---

### Output Format

* Print the number representing the youngest family member
* Print `-1` if no such member exists

---

### Constraints

* `1 ≤ n ≤ 10⁴`
* `0 ≤ m ≤ 10⁵`
* `1 ≤ aᵢ, bᵢ ≤ n`

---

### Sample Input

```
3 2
1 3
2 3
```

### Sample Output

```
3
```

---

## [🔤 Problem 3: Find K-th Distinct String](https://unstop.com/code/challenge-assessment/250739?moduleId=372)

### Problem Statement

Ashish has a collection of `N` strings, some of which may be duplicated.
He is asked to find the **k-th distinct string**, where a string is considered **distinct** if it appears **exactly once**.

The order of appearance in the input must be preserved.

If the number of distinct strings is less than `k`, print `-1`.

---

### Input Format

* First line contains an integer `N`
* Next `N` lines contain strings
* Last line contains an integer `k`

---

### Output Format

* Print the `k`-th distinct string
* Print `-1` if fewer than `k` distinct strings exist

---

### Constraints

* `1 ≤ N ≤ 10³`
* `1 ≤ length of string ≤ 10³`

---

### Sample Input

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

### Sample Output

```
a
```

---

## 📌 Note

Each problem has one or more solutions implemented in separate Java files within the same directory.

---

