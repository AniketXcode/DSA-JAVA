import java.util.HashSet;

public class RemoveDuplicateChars {

  public static String removeDuplicates(String s) {
    HashSet<Character> set = new HashSet<>();
    StringBuilder result = new StringBuilder();

    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);

      if (!set.contains(ch)) {
        set.add(ch);
        result.append(ch);
      }
    }
    return result.toString();
  }

  public static void main(String[] args) {
    String s = "programming";
    System.out.println(removeDuplicates(s));
  }
}

// 📝 Q24 – Remove All Duplicate Characters from a String
// ⭐ Problem

// Given a string, remove duplicate characters and keep only the first
// occurrence of each character.

// Example

// Input: "programming"
// Output: "progamin"

// Input: "aabbcc"
// Output: "abc"

// ⭐ Important Points

// Order same rehna chahiye (first occurrence stays)

// Case-sensitive ho sakta hai (depends on question)

// Space aur special characters bhi characters hi hote hain (agar ignore nahi
// bola ho)

// ⭐ Best Idea (Using HashSet)

// Ek HashSet banao to track characters already seen

// Ek StringBuilder banao result ke liye

// String ke har character ke liye:

// Agar set me nahi hai → add to result + set

// Agar already hai → skip

// ⭐ Algorithm (Easy Steps)

// HashSet<Character> seen create karo

// StringBuilder result create karo

// Loop through string:

// If char not in seen:

// add to seen

// append to result

// result.toString() return karo

// ⭐ Time & Space Complexity

// Time: O(n)

// Space: O(n)

// ⭐ Output

// progamin