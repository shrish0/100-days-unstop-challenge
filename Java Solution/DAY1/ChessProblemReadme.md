

# [♟️ Chessboard Cell Color Problem](https://unstop.com/code/challenge-assessment/250904?moduleId=372)

## 📌 Problem Overview

A standard chessboard can be represented as a **2D Cartesian plane**:

* Columns (`x-axis`) are labeled from **`a` to `h`**
* Rows (`y-axis`) are labeled from **`1` to `8`**

Each cell on the chessboard is either **Black** or **White**, following the standard alternating color pattern.

You are given a cell coordinate in the form of a **2-character string** (e.g., `a1`, `b2`).
Your task is to determine whether the given cell is **Black** or **White**.

---

## 🧠 Key Insight

* Convert the **column character** (`a`–`h`) into a numeric index
* Convert the **row character** (`1`–`8`) into a numeric index
* Add both indices:

  * If the sum is **even**, the cell is **White**
  * If the sum is **odd**, the cell is **Black**

This works because a chessboard alternates colors uniformly across rows and columns.

---

## 🧮 Color Logic

Let:

* `col = column index starting from 0`
* `row = row index starting from 0`

Then:

```
(col + row) % 2 == 0 → White
(col + row) % 2 == 1 → Black
```

---

## 🧪 Examples

### Example 1

**Input**

```
a1
```

**Output**

```
Black
```

Explanation:
`a1` is the bottom-left square on a chessboard, which is black.

---

### Example 2

**Input**

```
b2
```

**Output**

```
Black
```

Explanation:
Both indices sum to an odd value, so the cell is black.

---

## ⏱️ Complexity Analysis

* **Time Complexity:** `O(1)`
* **Space Complexity:** `O(1)`

The solution runs in constant time with no extra memory usage.

---

## 🎯 Takeaway

> Chessboard coloring problems often reduce to **index parity checks**.

This approach is:

* Simple
* Efficient
* Interview-friendly

---


