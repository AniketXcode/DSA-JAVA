public class MajorityElement {

  public static int majorityElement(int[] arr) {
    int candidate = 0, count = 0;

    // Step 1: Find candidate
    for (int num : arr) {
      if (count == 0) {
        candidate = num;
        count = 1;
      } else if (num == candidate) {
        count++;
      } else {
        count--;
      }
    }

    // Step 2: (Optional) verify the candidate
    int freq = 0;
    for (int num : arr) {
      if (num == candidate)
        freq++;
    }

    if (freq > arr.length / 2) {
      return candidate;
    }

    return -1; // no majority element
  }

  public static void main(String[] args) {
    int[] arr = { 2, 2, 1, 1, 1, 2, 2 };
    System.out.println("Majority Element: " + majorityElement(arr));
  }

}

// 📝Q15–

// Majority Element (Moore’s Voting Algorithm)
// ⭐ Problem

// Given an array, find the majority element.
// Majority element = the element that appears more than n/2 times.

// Example:
// Input: [2, 2, 1, 1, 1, 2, 2]
// Output: 2

// ⭐ Why Moore’s Voting?

// Normal counting → O(n) time but O(n) extra space.
// But Moore’s Voting Algorithm →

// O(n) time

// O(1) space

// Ultra famous interview question

// ⭐ Key Idea

// Majority element will always
// cancel out all other elements,
// but still remain at the end.

// We use a count and candidate.

// ⭐

// Algorithm (Very Simple)
// Step 1: Find Candidate

// candidate = arr[0]

// count = 1

// Loop array:

// If arr[i] == candidate → count++

// Else → count--

// If count == 0:

// candidate = arr[i]

// count = 1

// Step 2: Optional Verification

// Check if candidate really appears > n/2 times.

// ⭐ Why It Works?

// Majority element has more occurrences

// Cancels out all other numbers

// End me wahi bachta hai

// ⭐ Time & Space Complexity

// Time: O(n)

// Space: O(1)

// ⭐ Output

// Majority Element: 2