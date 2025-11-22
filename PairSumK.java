import java.util.HashMap;

public class PairSumK {

  public static void findPairs(int[] arr, int K) {
    HashMap<Integer, Integer> map = new HashMap<>();

    for (int num : arr) {
      int remaining = K - num;

      // If the remaining number exists in map -> we found pairs
      if (map.containsKey(remaining)) {
        int count = map.get(remaining);

        while (count-- > 0) {
          System.out.println("(" + remaining + ", " + num + ")");
        }
      }

      // Add current element to map
      map.put(num, map.getOrDefault(num, 0) + 1);
    }
  }

  public static void main(String[] args) {
    int[] arr = { 1, 5, 7, -1, 5 };
    int K = 6;

    findPairs(arr, K);
  }
}

// 📝 Q12 – Find All Pairs With Sum K
// ⭐ Problem

// Given an array and an integer K,
// find all pairs (a, b) such that:

// a + b = K

// Example:
// Input: arr = [1, 5, 7, -1, 5], K = 6
// Output pairs:
// (1,5)
// (7,-1)
// (1,5) again (duplicate allowed based on index)

// ⭐ Approach 1 (Brute Force – O(n²))

// Check every possible pair.
// Not recommended for large arrays.

// ⭐ Approach 2 (Optimal – HashMap) — O(n)

// Yeh sabse fastest aur interview friendly method.

// 🔥 Key Idea

// If current element = x,
// we need K - x to form a pair.

// Example:
// If arr[i] = 4 and K = 10
// → we need 6 to form a valid pair.

// HashMap stores frequencies of elements seen so far.

// ⭐ Algorithm (Steps)

// Ek HashMap banao (value → frequency)

// Loop array:

// remaining = K - arr[i]

// Check if remaining map me hai
// → pair mil gaya

// current element ko map me add/update karo

// Saare pairs print ya store karo

// ⭐ Time & Space Complexity
// Complexity Value
// Time O(n)
// Space O(n)

// ⭐ Output
// (1, 5)
// (7, -1)
// (1, 5)
