public class TrappingRainwater {

  public static int trap(int[] height) {
    int n = height.length;
    int[] leftMax = new int[n];
    int[] rightMax = new int[n];

    // Step 1: build leftMax
    leftMax[0] = height[0];
    for (int i = 1; i < n; i++) {
      leftMax[i] = Math.max(leftMax[i - 1], height[i]);
    }

    // Step 2: build rightMax
    rightMax[n - 1] = height[n - 1];
    for (int i = n - 2; i >= 0; i--) {
      rightMax[i] = Math.max(rightMax[i + 1], height[i]);
    }

    // Step 3: calculate water
    int total = 0;
    for (int i = 0; i < n; i++) {
      total += Math.min(leftMax[i], rightMax[i]) - height[i];
    }

    return total;
  }

  public static void main(String[] args) {
    int[] arr = { 3, 0, 2, 0, 4 };
    System.out.println("Trapped water: " + trap(arr));
  }
}

// 📝 Q17 – Trapping Rainwater
// ⭐ Problem

// Given an array where arr[i] represents height of buildings,
// find how much rainwater can be trapped between these buildings.

// Example

// Input:
// [3, 0, 2, 0, 4]
// Output:
// 7

// Explanation:
// Water trapped between bars at different levels sums to 7 units.

// ⭐ Concept (Very Easy Explanation)

// Water building ke upar tabhi ruk sakta hai jab:

// Left side me koi taller building ho
// Right side me koi taller building ho

// Water at index i depends on:

// water[i] = min(maxLeft[i], maxRight[i]) - height[i]

// Agar height choti hai → water fill hoga
// Agar height barabar ya zyada → water = 0

// ⭐ Step-by-Step Logic
// Step 1:

// Har index ke left side ka maximum height nikalo → leftMax[]

// Step 2:

// Har index ke right side ka maximum height nikalo → rightMax[]

// Step 3:

// Water stored at each index:

// water[i] = min(leftMax[i], rightMax[i]) - arr[i]

// Step 4:

// Total water = sab water[i] ka sum

// ⭐ Time & Space Complexity
// Type Value
// Time O(n)
// Space O(n) (for leftMax + rightMax)

// Two-pointer method se space O(1) ho sakta hai,
// but interview me pehle yeh simple method explain karna best hota hai.

// ⭐ Example Walkthrough

// Array:
// [3, 0, 2, 0, 4]

// leftMax

// [3, 3, 3, 3, 4]

// rightMax

// [4, 4, 4, 4, 4]

// water calculation
// i = 0 → 0
// i = 1 → min(3,4) - 0 = 3
// i = 2 → min(3,4) - 2 = 1
// i = 3 → min(3,4) - 0 = 3
// i = 4 → 0

// Total = 7

// ⭐ Output

// Trapped water: 7
