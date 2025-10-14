public class Bubblesort {
  public static void main(String[] args) {
    int[] arr = { 7, 8, 3, 1, 2 };
    for (int i = 0; i < arr.length - 1; i++) { // outer loop
      for (int j = 0; j < arr.length - i - 1; j++) { // inner loop
        if (arr[j] > arr[j + 1]) {
          // swap
          int swap = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = swap;
        }
      }
    }
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);

    }

  }
}