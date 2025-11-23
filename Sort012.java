public class Sort012 {

  public static void sortColors(int[] arr) {
    int low = 0, mid = 0, high = arr.length - 1;

    while (mid <= high) {
      if (arr[mid] == 0) {
        int temp = arr[mid];
        arr[mid] = arr[low];
        arr[low] = temp;
        low++;
        mid++;
      } else if (arr[mid] == 1) {
        mid++;
      } else {
        int temp = arr[mid];
        arr[mid] = arr[high];
        arr[high] = temp;
        high--;
      }
    }
  }

  public static void main(String[] args) {
    int[] arr = { 2, 0, 2, 1, 1, 0 };

    sortColors(arr);

    for (int num : arr) {
      System.out.print(num + " ");
    }
  }
}

// 📝 Q13 – Sort 0s, 1s, and 2s (Dutch National Flag Algorithm)
// ⭐ Problem

// Given an array containing only 0, 1, and 2,
// sort the array without using any sorting algorithm.

// Example:
// Input: [2, 0, 2, 1, 1, 0]
// Output: [0, 0, 1, 1, 2, 2]

// ⭐ Why Not Use Normal Sorting?

// Normal sorting → O(n log n)
// But this problem can be solved in O(n) with O(1) space.

// ⭐ Dutch National Flag Algorithm (DNF Algorithm)

// Most famous and optimal method.

// We maintain 3 pointers:

// low → 0s ka area

// mid → current element

// high → 2s ka area

// Regions:
// 0 to low-1 → 0s
// low to mid-1 → 1s
// mid to high → unknown
// high+1 to end → 2s

// ⭐ Algorithm (Very Easy):
// Step 1

// If arr[mid] == 0:

// swap arr[mid] & arr[low]

// low++ and mid++

// Step 2

// If arr[mid] == 1:

// mid++

// Step 3

// If arr[mid] == 2:

// swap arr[mid] & arr[high]

// high--
// (mid not increased here)

// ⭐ Time & Space Complexity

// Time: O(n)

// Space: O(1)

// Single pass!

// ⭐ Output

// 0 0 1 1 2 2