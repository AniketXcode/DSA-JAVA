import java.util.HashSet;

public class SubarraySumZero {

  public static boolean hasZeroSumSubarray(int[] arr) {
    HashSet<Integer> set = new HashSet<>();
    int prefixSum = 0;

    for (int num : arr) {
      prefixSum += num;

      if (prefixSum == 0 || set.contains(prefixSum) || num == 0) {
        return true;
      }

      set.add(prefixSum);
    }

    return false;
  }

  public static void main(String[] args) {
    int[] arr = { 4, 2, -3, 1, 6 };

    if (hasZeroSumSubarray(arr)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
