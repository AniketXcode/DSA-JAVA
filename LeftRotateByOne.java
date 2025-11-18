public class LeftRotateByOne {

  public static void leftRotate(int[] arr) {
    int temp = arr[0];
    for (int i = 0; i < arr.length - 1; i++) {
      arr[i] = arr[i + 1];
    }

    arr[arr.length - 1] = temp;
  }

  public static void main(String[] args) {
    int[] arr = { 10, 20, 30, 40 };

    leftRotate(arr);

    System.out.print("Array after rotation: ");
    for (int num : arr) {
      System.out.print(num + " ");
    }
  }
}

// 📝 Q5 – Left Rotate Array by 1 (NOTES)
// ⭐ What is Left Rotation?

// Left rotation means:

// Array ka pehla element last position par chala jata hai

// Baaki saare elements one step left shift ho jate hain

// Example

// Input:
// [10, 20, 30, 40]
// Output:
// [20, 30, 40, 10]

// ⭐ Why It's Easy?

// Because you only need to:

// First element store karo

// Baaki elements left shift

// Last position me stored element daal do

// ⭐ Algorithm (Steps)

// temp = arr[0]

// For i = 0 to n-2:

// arr[i] = arr[i+1]

// arr[n-1] = temp

// Array rotated!

// ⭐ Key Points

// Rotation is in-place

// No extra array required

// Works for any size array

// ⭐ Time & Space Complexity

// Time: O(n) (ek loop chalega)

// Space: O(1) (sirf ek temp use hota hai)

// ⭐ Java Code (Reference)
// public static void leftRotate(int[] arr) {
// int temp = arr[0];

// for (int i = 0; i < arr.length - 1; i++) {
// arr[i] = arr[i + 1];
// }

// arr[arr.length - 1] = temp;
// }

// ⭐ Output Example

// Input:
// [10, 20, 30, 40]
// Output:
// [20, 30, 40, 10]