public class ReverseString {

  public static String reverse(String s) {
    char[] arr = s.toCharArray();
    int left = 0, right = arr.length - 1;

    while (left < right) {
      char temp = arr[left];
      arr[left] = arr[right];
      arr[right] = temp;

      left++;
      right--;
    }

    return new String(arr);
  }

  public static void main(String[] args) {
    String s = "hello";
    System.out.println(reverse(s)); // olleh
  }
}

// 📝 Q21 – Reverse a String
// ⭐ Problem

// Given a string, return the reversed string.

// Example

// Input: "hello"
// Output: "olleh"

// Input: "abcd"
// Output: "dcba"

// ⭐ Approach 1 – Two Pointer Method (Best, Easy)

// left = 0

// right = n - 1

// Swap characters while:

// left < right

// left++

// right--

// Result → reversed string

// ⭐ Approach 2 – Using StringBuilder reverse()

// Very easy:

// new StringBuilder(s).reverse().toString();

// ⭐ Approach 3 – Using Loop (Append Backwards)

// Loop from end to start and build answer.

// ⭐ Time & Space Complexity
// Method Time Space
// Two pointer O(n) O(1)
// StringBuilder O(n) O(n)
// Loop + new string O(n) O(n)
// ⭐ Java Code (Two Pointer Method)

// ⭐ Output

// olleh