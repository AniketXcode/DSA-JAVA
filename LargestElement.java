public class LargestElement {

  public static int findLargest(int[] arr) {
    int largest = arr[0];

    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > largest) {
        largest = arr[i];
      }
    }
    return largest;
  }

  public static void main(String[] args) {

    int[] arr = { 10, 40, 20, 5 };

    int result = findLargest(arr);
    System.out.println("Largest element is: " + result);
  }
}

// 📌 01 – Find the Largest Element in an Array
// 📝 Problem

// You are given an array.
// Your task is to find the largest number in the array.

// Example

// Input: [10, 40, 20, 5]
// Output: 40

// 💡 Approach (Easy Explanation)

// Assume the first number is the largest

// Loop through the array

// If a number is bigger than current largest → update it

// Return the final largest number

// ⏱ Complexity

// Time: O(n)

// Space: O(1)

// 💻 Java Code
// public class LargestElement {

// public static int findLargest(int[] arr) {
// int largest = arr[0];

// for (int i = 1; i < arr.length; i++) {
// if (arr[i] > largest) {
// largest = arr[i];
// }
// }
// return largest;
// }

// public static void main(String[] args) {
// int[] arr = {10, 40, 20, 5};
// System.out.println("Largest element is: " + findLargest(arr));
// }
// }

// ✅ Output

// Largest element is: 40
