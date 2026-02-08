
---


# [Erase Overlapping Intervals](https://unstop.com/code/challenge-assessment/250531?moduleId=410)

## 📌 Problem Statement

You are given a list of intervals, where each interval is represented as  
`[start, end]`.

Your task is to determine the **minimum number of intervals that must be removed** so that the remaining intervals are **non-overlapping**.

### Definition of Overlap
Two intervals overlap if:
```

current.start < previous.end

```

Intervals that just touch at the boundary (e.g. `[1,2]` and `[2,3]`) are **not overlapping**.

---

## 🎯 Goal

Return the **minimum number of intervals to remove** such that no two remaining intervals overlap.

---

## 🧠 Key Insight (Greedy)

When two intervals overlap, **at least one of them must be removed**.

To minimize future overlaps, it is always better to:
> **Keep the interval that ends earliest**

This greedy choice guarantees an optimal result.

---

## ✅ Final Approach (Correct & Optimal)

### Core Strategy
Use a **greedy algorithm based on interval end times**.

---

## 🔧 Important Change (What Fixed the Bug)

### ❌ Earlier Mistake
- Intervals were sorted by **start time**
- Replacement logic was used during overlaps
- This caused **edge-case failures** on large inputs (off-by-one error)

### ✅ Correct Fix
- Sort intervals by **end time**
- Do **not replace** intervals during overlap
- Always keep the interval with the smallest end

This ensures the greedy choice is **always optimal**.

---

## 🪜 Step-by-Step Approach

1. **Sort all intervals by their end time** (ascending)
2. Keep track of the **last selected interval**
3. Traverse the remaining intervals:
   - If the current interval **overlaps** with the last kept one  
     → increment the removal count
   - If it **does not overlap**  
     → keep it and update the reference
4. Continue until all intervals are processed
5. Return the total removal count

---

## ✅ Why This Works

- The interval that ends earliest leaves the **maximum space** for future intervals
- Sorting by end time removes the need for complex replacement logic
- This greedy strategy is **provably optimal**

---

## ⏱️ Complexity

- **Time Complexity:** `O(N log N)` (due to sorting)
- **Space Complexity:** `O(1)` extra space

---

## 🏁 Final Notes

✔ Handles large inputs correctly  
✔ No edge-case failures  
✔ Simple and interview-friendly  
✔ Standard greedy solution  

---