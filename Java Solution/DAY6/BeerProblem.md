
---

# [🍺 Beer Buying Problem – Approaches Explained](https://unstop.com/code/challenge-assessment/306969?moduleId=410)

## 📌 Problem Overview

You have:

* `N` shops, each selling **one bottle of beer per day**
* A fixed daily budget `X`
* Initial beer prices for each shop

### Rules

* You can buy from **multiple shops per day**
* You can buy **only one bottle per shop per day**
* After each day, **all prices increase by 1**
* You stop when **no shop can sell within the budget**

### Goal

👉 **Find the total number of beer bottles bought over all days.**

---

## 🧠 Approach 1: Greedy Day-by-Day Simulation

### Idea

* Sort shop prices
* Each day, try to buy from as many **cheapest shops** as possible
* If the total exceeds budget, remove the **most expensive selected shop**
* Repeat day by day until no shop is affordable

### Characteristics

* Intuitive and easy to understand
* Closely follows the real process described in the problem

### Complexity

* **Time:** Can degrade to `O(N × days)`
* **Space:** `O(1)` extra space

### Remarks

* Works correctly for small inputs
* May **Time Limit Exceed (TLE)** for large constraints
* Useful as a baseline or for understanding the problem

---

---

## 🧠 Approach 2: Prefix Sum + Mathematical Optimization

### Key Insight

> Each shop contributes **one bottle per day** until its price exceeds the daily budget.

Instead of simulating days, compute **how many days each shop remains affordable**.

### Idea

* Sort prices
* Build prefix sums for cheapest shops
* For each shop count `k`, compute how many days the first `k` shops can be afforded
* Accumulate the contribution of each shop

### Why it Works

* Avoids redundant daily simulation
* Uses arithmetic progression logic to jump directly to results

### Complexity

* **Time:** `O(N log N)`
* **Space:** `O(N)`

### Remarks

* Efficient and scalable
* Suitable for large inputs (`N ≤ 2×10⁵`)
* Preferred in interviews and competitive programming

---

## 🧪 Example Insight

For input:

```
3 7
2 1 2
```

* Shop 1 affordable for 7 days
* Shop 2 affordable for 3 days
* Shop 3 affordable for 1 day

Total bottles = `11`

---

## 🎯 Final Takeaway

* **Approach 1** helps understand the process
* **Approach 2** is the optimized, production-ready solution

> When constraints are large, always prefer **math over simulation**.

---

