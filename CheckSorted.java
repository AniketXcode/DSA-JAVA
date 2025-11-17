public class CheckSorted {

  public static boolean isSorted(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] > arr[i + 1]) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    int[] arr = { 5, 10, 15, 20 };
    System.out.println("Is the array sorted? " + isSorted(arr));
  }
}

// 📝 Q3 – Check if Array is Sorted (NOTES)
// ⭐ Definition

// Agar array ke elements ascending (non-decreasing) order me hon, to array
// sorted hota hai.

// Example of sorted array:
// [5, 10, 10, 20, 30]

// Example of not sorted array:
// [5, 3, 10] (because 5 > 3)

// ⭐ Logic / Idea

// Har element ko next element se compare karo.

// Agar kabhi bhi arr[i] > arr[i+1] mil jaye → array sorted nahi hai.

// Agar loop complete ho jaye → array sorted hai.

// This is the simplest check.

// ⭐ Why compare adjacent elements?

// Because sorted array me har previous element next element se chhota ya
// barabar hota hai.

// ⭐ Algorithm (Easy Steps)

// i = 0 se start karo

// Check: arr[i] <= arr[i+1]

// Agar true hai → aage badho

// Agar false mila → return false

// Loop khatam ho jaye → return true

// ⭐ Time Complexity

// O(n) → sirf ek loop chal raha hai

// Very efficient

// ⭐ Space Complexity

// O(1) → extra memory nahi lagti

// ⭐ Java Code (For Reference)
// public static boolean isSorted(int[] arr) {
// for (int i = 0; i < arr.length - 1; i++) {
// if (arr[i] > arr[i + 1]) {
// return false;
// }
// }
// return true;
// }

// ⭐ Important Points

// Duplicate values allowed: [10, 10, 20] → sorted

// Negative values allowed

// Single-element array → always sorted

// Two-element array → simple compare