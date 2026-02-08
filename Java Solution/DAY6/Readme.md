
---

# 📅 Day 6 – Problem Statements

This document lists all the **problems solved on Day 6** as part of the coding practice series.

---

## [🍺 Beer Buying Problem](https://unstop.com/code/challenge-assessment/306969?moduleId=410)


### Problem Statement

You have a budget of `X` coins each day to buy beer, and your goal is to buy as many bottles of beer as possible before the price of beer in all shops exceeds your daily budget.

There are `N` shops, and each shop sells **one bottle of beer per day**. The price of beer in each shop increases by **1 coin per day** after each purchase.

You can visit multiple shops in a single day, but you can buy **only one bottle per shop per day**.

Your task is to determine the **total number of beer bottles** you can buy before the prices at all shops exceed your daily budget.

---

### Input Format

* First line contains two space-separated integers `N` and `X`
* Second line contains `N` space-separated integers representing the initial prices

---

### Output Format

* Print a single integer representing the total number of beer bottles purchased

---

## [📈 Lucky Array Modification](https://unstop.com/code/challenge-assessment/306079?moduleId=410)

### Problem Statement

An astrologer has determined that a given array of integers is **not lucky** and needs to be modified.

The suggested modification involves **increasing the value at each index by the maximum value encountered up to that index**.

Your task is to apply this modification and print the resulting array.

---

### Input Format

* First line contains an integer `N`, the size of the array
* Second line contains `N` space-separated integers

---

### Output Format

* Print the modified array

---

## [🌸 Flower Bouquet Problem](http://unstop.com/code/challenge-assessment/250137?moduleId=410)

### Problem Statement

Mary wants to give a bouquet of flowers to her friend. She needs **exactly two types of flowers** such that the **total number of flowers equals `t`**.

Her garden contains `N` types of flowers arranged in a **non-decreasing (sorted) order**.

Your task is to find the **0-based indices** of the two flower types whose sum equals `t`.

> It is guaranteed that at least one valid pair exists.
> If multiple pairs exist, return the **first occurrence**.

---

### Input Format

* First line contains integers `N` and `t`
* Second line contains `N` space-separated integers

---

### Output Format

* Print two space-separated integers representing the indices

---

## [🧩 Erase Overlapping Intervals](https://unstop.com/code/challenge-assessment/250531?moduleId=410)

### Problem Statement

You are given an array of intervals where each interval is represented as
`[start, end]`.

Your task is to return the **minimum number of intervals** that must be removed so that the remaining intervals are **non-overlapping**.

Two intervals are considered overlapping if:

```
current.start < previous.end
```

Intervals that only touch at the boundary are **not overlapping**.

---

### Input Format

* First line contains an integer `N`, the number of intervals
* Second line contains an integer `M` (always `2`)
* Next `N` lines contain two space-separated integers representing each interval

---

### Output Format

* Print a single integer representing the minimum number of intervals to remove

---

## 📌 End of Day 6

All problems listed above were solved as part of **Day 6** of the challenge.

---