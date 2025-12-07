public class CountInversions {

  public static int mergeSort(int[] arr, int left, int right) {
    int count = 0;

    if (left < right) {
      int mid = (left + right) / 2;

      count += mergeSort(arr, left, mid);
      count += mergeSort(arr, mid + 1, right);
      count += merge(arr, left, mid, right);
    }

    return count;
  }

  public static int merge(int[] arr, int left, int mid, int right) {
    int[] temp = new int[right - left + 1];
    int i = left, j = mid + 1, k = 0;
    int inversions = 0;

    while (i <= mid && j <= right) {
      if (arr[i] <= arr[j]) {
        temp[k++] = arr[i++];
      } else {
        temp[k++] = arr[j++];
        inversions += (mid - i + 1); 
      }
    }

    while (i <= mid)
      temp[k++] = arr[i++];
    while (j <= right)
      temp[k++] = arr[j++];

    
    for (int x = 0; x < temp.length; x++) {
      arr[left + x] = temp[x];
    }

    return inversions;
  }

  public static void main(String[] args) {
    int[] arr = { 2, 4, 1, 3, 5 };
    int result = mergeSort(arr, 0, arr.length - 1);

    System.out.println("Total Inversions: " + result);
  }
}

// 📝 Q20 – Count Inversions in an Array
// ⭐ Problem

// An inversion means a pair of elements (i, j) such that:

// i < j AND arr[i] > arr[j]

// Aapko array me total inversions count karna hai.

// ⭐ Example

// Input:
// [2, 4, 1, 3, 5]

// Inversions:

// (2,1)

// (4,1)

// (4,3)

// Total = 3

// ⭐ Why This Matters?

// Inversions tell how “unsorted” an array is.

// Sorted array → 0 inversions

// Completely reversed array → maximum inversions

// ⭐ Approach 1 (Brute Force – O(n²))

// Check every pair (i, j):

// for i=0 to n-1
// for j=i+1 to n-1
// if arr[i] > arr[j]
// count++

// But this is too slow.
// Interview me NOT used.

// ⭐ Approach 2 – Modified Merge Sort (O(n log n)) — Optimal

// Most famous and fastest method.

// 🔥 Main Idea

// During merge sort, when right element < left element,
// wo jitne bhi left wale elements bache honge →
// sab inversion banate hain.

// Example:

// Left: [2, 4]
// Right: [1, 3]

// When 1 < 2 →
// Inversions = 2 (2,1) and (4,1)

// ⭐ Algorithm (Easy Explanation)

// Normal merge sort jaise two parts me array ko divide karo

// Merge karte time:

// Agar left[i] <= right[j] → no inversion

// Agar left[i] > right[j]

// Inversions += (remaining elements in left array)

// Merge sort finally total inversions return karega

// ⭐ Time & Space Complexity
// Type Value
// Time O(n log n)
// Space O(n)

// ⭐ Output

// Total Inversions: 3