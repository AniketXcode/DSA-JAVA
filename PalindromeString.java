public class PalindromeString {

  public static boolean isPalindrome(String s) {
    int left = 0, right = s.length() - 1;

    while (left < right) {
      if (s.charAt(left) != s.charAt(right)) {
        return false;
      }
      left++;
      right--;
    }
    return true;
  }

  public static void main(String[] args) {
    String s = "madam";
    System.out.println(isPalindrome(s));
  }
}

// 📝Q22–

// Check Palindrome String⭐
// Problem

// Given
// a string, check
// whether it
// is a
// palindrome or not.

// Palindrome=
// A string
// that reads
// the same
// forward and backward.

// Examples

// "madam"→Palindrome

// "racecar"→Palindrome

// "hello"→
// Not a Palindrome

// "121"→Palindrome

// ⭐Approach–
// Two Pointer

// Method (Best & Easiest)

// left = 0

// right = n - 1

// Check:

// if s[left] != s[right] → NOT a palindrome

// Move pointers:

// left++
// right--

// Until left >= right

// If loop completes → palindrome

// ⭐ Important Notes

// Case-sensitive? "Madam" ≠ "madam" (depends on question)

// You can convert to lowercase for ignoring cases

// Spaces and punctuation generally ignored (optional)

// ⭐ Time & Space Complexity
// Complexity Value

// Time O(n)

// Space O(1)
// ⭐

// Java Code (Two Pointer Method)

// ⭐ Output

// true