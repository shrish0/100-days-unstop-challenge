
---

# DAY 2 – Problem Statements

---

## 1. Equal Sum Non-Overlapping Subarrays

### Problem Statement

You are given an array **A** of size **N**.

Your task is to count the number of **unique pairs of non-overlapping subarrays** such that **both subarrays have the same sum**.

Each subarray is defined by a pair of indices **[L, R]** (1-based indexing), where
`1 ≤ L ≤ R ≤ N`.

Two subarrays must **not overlap**, meaning they must not share any common index.

The pair `([L1, R1], [L2, R2])` is considered the same as `([L2, R2], [L1, R1])`, so count each valid pair only once.

---

### Input Format

* First line contains an integer **N**
* Second line contains **N** space-separated integers representing the array

### Output Format

* Print a single integer representing the number of valid pairs

### Constraints

* `1 ≤ N ≤ 10⁶`
* `-10⁶ ≤ A[i] ≤ 10⁶`

---

### Sample Input

```
4
1 -1 2 -2
```

### Sample Output

```
2
```

---

## 2. Printing Press Color Machine

### Problem Statement

A printing press starts with **N white sheets (`W`)**.
A machine operates on **pairs of neighboring sheets** and prints one of the following:

* **`"BR"`** → Blue then Red
* **`"RB"`** → Red then Blue

Each operation modifies the two adjacent sheets.

Given a target color sequence, determine whether it can be printed using this machine.

---

### Input Format

* First line contains integer **T** (number of test cases)
* For each test case:

  * Integer **N**
  * String **S** of length **N** containing only `W`, `R`, `B`

### Output Format

* Print **YES** if the sequence can be printed
* Otherwise, print **NO**

### Constraints

* `1 ≤ T ≤ 10⁴`
* `1 ≤ N ≤ 10⁵`

---

### Sample Input

```
2
3
RBR
1
B
```

### Sample Output

```
YES
NO
```

---

## 3. City Biker – Highest Altitude

### Problem Statement

A biker starts at altitude **0** and travels across **n+1 points**.

You are given an integer array **gain** of length **n**, where `gain[i]` represents the net altitude change between point `i` and `i+1`.

The biker’s altitude at each point is the sum of gains up to that point.

Your task is to determine the **highest altitude** reached during the journey.

---

### Input Format

* First line contains integer **n**
* Second line contains **n** space-separated integers

### Output Format

* Print the highest altitude reached

### Constraints

* `1 ≤ n ≤ 100`
* `-100 ≤ gain[i] ≤ 100`

---

### Sample Input

```
5
-5 5 1 5 -3
```

### Sample Output

```
6
```

---

## 4. Array Reduction with Negative Values

### Problem Statement

You are given an array of size **N**.

At any index **i**, if the element **X** is **negative**:

* Remove the **minimum number of elements immediately before X** such that their sum is **greater than or equal to |X|**
* If the sum is still less than `|X|`, remove **all elements before X**
* Convert **X** to its absolute value

This operation is applied **only when X is negative**.
For every step, operations are performed on the **modified array**.

Return the **sum of all elements remaining** after processing the entire array.

---

### Input Format

* First line contains integer **N**
* Second line contains **N** space-separated integers

### Output Format

* Print the final sum of the array

### Constraints

* `1 ≤ N ≤ 10⁵`
* `-10⁴ ≤ A[i] ≤ 10⁴`

---

### Sample Input

```
5
4 2 2 3 -6
```

### Sample Output

```
10
```

---
