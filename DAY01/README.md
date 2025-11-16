🚀 Day 01 — Find the Largest Element in an Array
📘 Problem Statement

Given an array of integers, find and return the largest (maximum) element from the array.

Example

Input:
[10, 40, 20, 5]
Output:
40

🎯 Objective

Understand how to scan an array

Learn comparison logic

Build basic DSA foundation

Practice writing clean code

🧠 Approach (Simple Explanation)

Assume the first element is the largest

Loop through the array

Compare each element with largest

If an element is bigger → update largest

Return the final value

This is the simplest and most efficient method.

⏱ Time & Space Complexity
Operation Complexity
Time O(n) (we scan every element)
Space O(1) (no extra space used)
💻 Java Code Implementation
public class LargestElement {

    public static int findLargest(int[] arr) {
        int largest = arr[0]; // assume first element is largest

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {

        int[] arr = {10, 40, 20, 5};

        int result = findLargest(arr);
        System.out.println("Largest element is: " + result);
    }

}

📝 Sample Input
10 40 20 5

📝 Sample Output
Largest element is: 40

🌟 What I Learned Today

How to iterate through an array

How comparison works

How to assume a value and update it

How to write clean and readable code

🔥 Day 01 Completed Successfully!

This is the first step of my 100 Days DSA Challenge.
Let’s keep growing every day! 💪🚀
