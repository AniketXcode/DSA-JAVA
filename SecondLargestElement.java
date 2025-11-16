public class SecondLargestElement {

  public static int findSecondLargest(int[] arr) {
    int largest = Integer.MIN_VALUE;
    int secondLargest = Integer.MIN_VALUE;

    for (int num : arr) {
      if (num > largest) {
        secondLargest = largest;
        largest = num;
      } else if (num > secondLargest && num != largest) {
        secondLargest = num;
      }
    }
    return secondLargest;
  }

  public static void main(String[] args) {
    int[] arr = { 10, 40, 20, 5 };
    System.out.println("Second largest is: " + findSecondLargest(arr));
  }
}

// Q2 – Find the Second Largest Element in an Array
// 📝 Problem

// Given an array of numbers, find the second largest element in the array.

// Example:
// Input: [10, 40, 20, 5]
// Output: 20

// 💡 Approach (Easy Explanation)

// largest aur secondLargest do variables rakho

// Har number ko check karo:

// Agar number largest se bada hai →
// secondLargest = largest
// largest = number

// Agar number largest se chhota ho lekin secondLargest se bada ho →
// secondLargest = number

// End me secondLargest return karo

// ⏱ Complexity

// Time: O(n)

// Space: O(1)

// ✅ Output

// Second largest is: 20