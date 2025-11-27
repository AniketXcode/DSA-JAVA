public class MaximumProductSubarray {

  public static int maxProduct(int[] arr) {
    int maxProd = arr[0];
    int minProd = arr[0];
    int answer = arr[0];

    for (int i = 1; i < arr.length; i++) {

      if (arr[i] < 0) {
        int temp = maxProd;
        maxProd = minProd;
        minProd = temp;
      }

      maxProd = Math.max(arr[i], maxProd * arr[i]);
      minProd = Math.min(arr[i], minProd * arr[i]);

      answer = Math.max(answer, maxProd);
    }

    return answer;
  }

  public static void main(String[] args) {
    int[] arr = { 2, 3, -2, 4 };
    System.out.println("Maximum Product Subarray: " + maxProduct(arr));
  }
}

// 📝 Q18 – Maximum Product Subarray
// ⭐ Problem

// Given an integer array, find the maximum product of any contiguous subarray.

// Example

// Input:
// [2, 3, -2, 4]
// Output:
// 6
// (Because subarray [2, 3] gives max product = 6)

// ⭐ Why This Problem Is Tricky?

// Because product multiply hota hai, and:

// Negative × Negative → positive

// Positive × Negative → negative

// Zero → product reset

// Isliye normal Kadane’s Algorithm yaha kaam nahi karta.

// ⭐ Key Idea (Very Simple!)

// We track two values at each step:

// maxProd → maximum product ending at current index

// minProd → minimum product ending at current index
// (Important because negative numbers can flip answer)

// Example:
// If current number -2 hai:
// minProd × -2 → max ban sakta hai

// ⭐ Algorithm (Steps)

// maxProd = arr[0]

// minProd = arr[0]

// answer = arr[0]

// Loop from i = 1 to n-1:

// If number is negative → swap(maxProd, minProd)

// Update:

// maxProd = max(arr[i], maxProd * arr[i])
// minProd = min(arr[i], minProd * arr[i])

// Update final answer:

// answer = max(answer, maxProd)

// ⭐ Why Swap on Negative?

// Because negative number multiply hote hi:

// Maximum → Minimum ban sakta hai

// Minimum → Maximum ban sakta hai

// So swapping is mandatory.

// ⭐ Time & Space Complexity
// Type Value
// Time O(n)
// Space O(1)

// ⭐ Output

// Maximum Product Subarray: 6