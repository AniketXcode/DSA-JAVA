public class MoveZeroes {

  public static void moveZeroes(int[] arr) {
    int j = 0;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != 0) {
        arr[j] = arr[i];
        j++;
      }
    }

    while (j < arr.length) {
      arr[j] = 0;
      j++;
    }
  }

  public static void main(String[] args) {
    int[] arr = { 0, 1, 0, 3, 12 };
    moveZeroes(arr);

    for (int x : arr) {
      System.out.print(x + " ");
    }
  }
}

// 📝 Q6 – Move All Zeroes to End
// ⭐ Problem

// Given an array, move all 0s to the end, while keeping non-zero elements in
// the same order.

// Example

// Input:
// [0, 1, 0, 3, 12]
// Output:
// [1, 3, 12, 0, 0]

// ⭐ Logic / Idea (Two Pointer Method)

// We don’t want to lose order, so we must shift non-zero elements first.

// Steps:

// Make a pointer j = 0 → this will place non-zero elements.

// Loop through array with i:

// If arr[i] != 0,

// Copy value to arr[j]

// j++

// After loop ends, fill remaining positions with 0.

// ⭐ Why This Works?

// Pehle saare non-zero elements left side me aa jate hain

// Baad me jitne places bachte hain, waha zero fill kar dete hain

// Order maintain rehta hai

// ⭐ Time Complexity

// O(n) → single pass

// ⭐ Space Complexity

// O(1) → no extra array

// ⭐ Output

// 1 3 12 0 0