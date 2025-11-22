import java.util.HashMap;

public class LongestSubarraySumK {

  public static int longestSubarray(int[] arr, int K) {
    HashMap<Integer, Integer> map = new HashMap<>();
    int prefixSum = 0;
    int maxLen = 0;

    for (int i = 0; i < arr.length; i++) {
      prefixSum += arr[i];

      if (prefixSum == K) {
        maxLen = i + 1;
      }

      if (map.containsKey(prefixSum - K)) {
        int len = i - map.get(prefixSum - K);
        maxLen = Math.max(maxLen, len);
      }

      if (!map.containsKey(prefixSum)) {
        map.put(prefixSum, i);
      }
    }

    return maxLen;
  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 1, 1, 1, 1 };
    int K = 3;

    System.out.println("Longest Subarray Length: " + longestSubarray(arr, K));
  }
}

// 📝 Q11 – Longest Subarray With Sum K
// ⭐ Problem

// Given an array and a value K,
// find the length of the longest subarray whose sum is exactly K.

// Example

// Input:
// arr = [1, 2, 3, 1, 1, 1, 1], K = 3
// Output:
// 3
// (Subarray: [1, 1, 1] or [1, 2])

// ⭐ Approach 1 (Naive / Brute Force)

// Check all subarrays → O(n²)
// Exam or interview me avoid karo.

// ⭐ Approach 2 (Optimal – Prefix Sum + HashMap) — O(n)

// Yahi sabse important, sabse fast, sabse famous solution.

// 🔥 Key Idea

// Prefix sum use karo:

// prefixSum = arr[0] + arr[1] + ... + arr[i]

// To find subarray sum K:

// prefixSum - K should exist in map

// Agar prefixSum - K map me hai, matlab
// uske baad se lekar current index tak ka sum = K

// 🔥 Important Point

// HashMap store karega:

// sum → first index jaha sum mila

// ⭐ Algorithm (Steps)

// map banao (sum → index)

// prefixSum = 0

// Loop through array

// Update:

// prefixSum += arr[i]

// If prefixSum == K → longest subarray length = i + 1

// Check if prefixSum - K map me present:

// Means subarray mil gaya

// Length: i - map.get(prefixSum - K)

// Agar prefixSum map me pehli baar dekha

// map.put(prefixSum, i)

// ⭐ Time & Space Complexity
// Complexity Value
// Time O(n)
// Space O(n)

// ⭐ Output

// Longest Subarray Length: 3