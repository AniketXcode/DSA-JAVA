import java.util.HashSet;

public class SubarraySumZero {

  public static boolean hasZeroSumSubarray(int[] arr) {
    HashSet<Integer> set = new HashSet<>();
    int prefixSum = 0;

    for (int num : arr) {
      prefixSum += num;

      if (prefixSum == 0 || set.contains(prefixSum) || num == 0) {
        return true;
      }

      set.add(prefixSum);
    }

    return false;
  }

  public static void main(String[] args) {
    int[] arr = { 4, 2, -3, 1, 6 };

    if (hasZeroSumSubarray(arr)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}

// 📝 Q14 – Subarray Sum Equals 0
// ⭐ Problem

// Given an array, check whether there exists any subarray whose sum is 0.

// Example

// Input:
// [4, 2, -3, 1, 6]
// Output:
// Yes
// (Because subarray [2, -3, 1] has sum 0)

// Input:
// [4, 2, 0, 1]
// Output:
// Yes
// (Because 0 itself is a subarray)

// Input:
// [1, 2, 3]
// Output:
// No

// ⭐ Brute Force (O(n²))

// Check all subarrays.
// But slow → avoid in interviews.

// ⭐ Optimal Method – Prefix Sum + HashSet (O(n))

// Yeh sabse fast aur sabse famous solution hai.

// 🔥 Key Observations

// Subarray sum = 0 exists if ANY of these happens:

// 1️⃣ Prefix sum becomes 0
// 2️⃣ Same prefix sum repeats
// 3️⃣ Element is 0

// Why?
// If prefixSum repeats,
// matlab beech ka subarray sum 0 hai:

// prefixSum(i) == prefixSum(j)
// → sum(i+1 to j) = 0

// ⭐ Algorithm (Steps)

// HashSet banao

// prefixSum = 0 start karo

// Loop array:

// prefixSum += arr[i]

// If prefixSum == 0 → subarray exists

// If prefixSum exists in set → subarray exists

// Add prefixSum to set

// Loop complete → no subarray

// ⭐ Time & Space Complexity
// Complexity Value
// Time O(n)
// Space O(n)

// ⭐ Output

// Yes