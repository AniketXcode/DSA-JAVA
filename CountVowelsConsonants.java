public class CountVowelsConsonants {

  public static void count(String s) {
    s = s.toLowerCase();

    int vowels = 0;
    int consonants = 0;

    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);

      if (ch >= 'a' && ch <= 'z') {
        if (ch == 'a' || ch == 'e' || ch == 'i' ||
            ch == 'o' || ch == 'u') {
          vowels++;
        } else {
          consonants++;
        }
      }
    }

    System.out.println("Vowels: " + vowels);
    System.out.println("Consonants: " + consonants);
  }

  public static void main(String[] args) {
    String s = "hello world";
    count(s);
  }
}

// Q23 – Count Vowels and Consonants
// ⭐ Problem

// Given a string, count the number of vowels and consonants in it.

// Vowels

// a, e, i, o, u (and their uppercase forms)

// Consonants

// All alphabet characters except vowels

// ⭐ Example

// Input:
// "hello world"

// Output:

// Vowels = 3 (e, o, o)

// Consonants = 7 (h, l, l, w, r, l, d)

// (Spaces and special characters are ignored)

// ⭐ Logic / Idea (Very Easy)

// Convert string to lowercase (to handle case easily)

// Loop through each character

// If character is a letter (a–z):

// If it is a vowel → vowel count++

// Else → consonant count++

// Ignore spaces, numbers, symbols

// ⭐ Algorithm (Steps)

// vowels = 0, consonants = 0

// For each character ch in string:

// If ch is between 'a' and 'z':

// If ch is vowel → vowels++

// Else → consonants++

// Print counts

// ⭐ Time & Space Complexity

// Time: O(n) (string length)

// Space: O(1)

// ⭐ Output
// Vowels: 3
// Consonants: 7