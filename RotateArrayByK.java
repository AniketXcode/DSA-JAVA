public class RotateArrayByK {

  public static void reverse(int[] arr, int start, int end) {
    while (start < end) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
  }

  public static void rotate(int[] arr, int k) {
    int n = arr.length;
    k = k % n;

    reverse(arr, 0, n - 1);
    reverse(arr, 0, k - 1);
    reverse(arr, k, n - 1);
  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
    int k = 3;

    rotate(arr, k);

    for (int num : arr) {
      System.out.print(num + " ");
    }
  }
}

// 📝 Q9 – Rotate Array by K Positions (Right Rotation)
// ⭐ Definition

// Rotate array by K steps to the right means:

// Last K elements → front me aa jate hain

// Baaki elements → right shift ho jate hain

// Example

// Input:
// arr = [1, 2, 3, 4, 5, 6, 7], k = 3
// Output:
// [5, 6, 7, 1, 2, 3, 4]

// ⭐ Key Point

// k array se bada ho sakta hai → isliye:

// k = k % n

// ⭐ Best Method → Reverse Method (3 Step Technique)
// Step 1: Reverse whole array

// [1,2,3,4,5,6,7] → [7,6,5,4,3,2,1]

// Step 2: Reverse first k elements

// If k = 3
// [7,6,5] → [5,6,7]

// Step 3: Reverse remaining elements

// [4,3,2,1] → [1,2,3,4]

// Final array:
// [5,6,7,1,2,3,4]

// ⭐ Why Reverse Method?

// Fastest method

// In-place rotation

// No extra array

// Very popular interview technique

// ⭐ Time & Space Complexity

// Time: O(n)

// Space: O(1)

// ⭐ Output

// 5 6 7 1 2 3 4