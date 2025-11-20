public class LinearSearch {

  public static int search(int[] arr, int key) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == key) {
        return i;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int[] arr = { 5, 10, 20, 40 };
    int key = 20;

    int index = search(arr, key);
    System.out.println("Index: " + index);
  }
}

// 📝 Q7 – Linear Search
// ⭐ Definition

// Linear Search is the simplest searching technique.
// We check each element one by one until:

// We find the target

// OR we reach the end of the array

// ⭐ When to Use?

// Array sorted ho ya unsorted — dono me chalega

// Small sized arrays ke liye best

// No extra memory required

// ⭐ Example

// Input:
// arr = [5, 10, 20, 40], key = 20
// Output:
// Index: 2

// Input:
// arr = [5, 10, 20], key = 7
// Output:
// Not found

// ⭐ Logic / Idea

// Start from index 0

// Compare each element with key

// If match milta hai → return index

// If loop complete ho jaye → element not present

// ⭐ Algorithm (Steps)

// Loop i = 0 to n - 1

// Check: arr[i] == key

// True → return i

// End tak nahi mila → return -1

// ⭐ Time Complexity

// Worst Case: O(n)

// Best Case: O(1) (first element match)

// ⭐ Space Complexity

// O(1)

// ⭐ Output

// Index: 2
