package DAY01;

public class LargestElement {

  public static int findLargest(int[] arr) {
    int largest = arr[0];

    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > largest) {
        largest = arr[i];
      }
    }
    return largest;
  }

  public static void main(String[] args) {

    int[] arr = { 10, 40, 20, 5 };

    int result = findLargest(arr);
    System.out.println("Largest element is: " + result);
  }
}