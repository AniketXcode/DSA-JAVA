public class ProductArrayExceptSelf {

  public static int[] productExceptSelf(int[] arr) {
    int n = arr.length;
    int[] result = new int[n];

    // Step 1: Prefix products
    result[0] = 1;
    for (int i = 1; i < n; i++) {
      result[i] = result[i - 1] * arr[i - 1];
    }

    // Step 2: Suffix product
    int suffix = 1;
    for (int i = n - 1; i >= 0; i--) {
      result[i] = result[i] * suffix;
      suffix *= arr[i];
    }

    return result;
  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4 };
    int[] res = productExceptSelf(arr);

    for (int num : res) {
      System.out.print(num + " ");
    }
  }
}

// 📝 Q16 – Product of Array Except Self
// ⭐ Problem

// Given an array arr[],
// return another array result[] such that:

// result[i] = product of all elements except arr[i]

// ⚠ Important:

// You cannot use division.

// Must run in O(n) time.

// Space O(1) (excluding output array) — interview requirement.

// ⭐ Example

// Input:
// [1, 2, 3, 4]

// Output:
// [24, 12, 8, 6]

// Explanation:

// For index 0 → 2×3×4 = 24

// For index 1 → 1×3×4 = 12

// For index 2 → 1×2×4 = 8

// For index 3 → 1×2×3 = 6

// ⭐ Why Not Use Division?

// Because division fails when a zero exists.
// And interviewer wants logical understanding, not shortcuts.

// ⭐ Optimal Approach (O(n), No Division)
// 🔥 Idea

// Use prefix product and suffix product.

// For every index i:

// result[i] = (product of left elements) × (product of right elements)

// So we do it in 2 passes:
// ⭐ Step 1 — Build Prefix Product Array

// For each index, store product of all elements to its left.

// Example for [1, 2, 3, 4]:

// Prefix =
// [1, 1, 2, 6]

// ⭐ Step 2 — Multiply With Suffix Product

// Traverse from right side and keep multiplying suffix value.

// Suffix values (from right):
// 1, 4, 12, 24

// Final result:
// [24, 12, 8, 6]

// ⭐ Time & Space Complexity
// Type Value
// Time O(n)
// Space O(1) (output array not counted)

// ⭐ Output

// 24 12 8 6