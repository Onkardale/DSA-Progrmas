public class LinearSearch {
  public static void main(String[] args) {
    int[] arr = { 18, 12, 9, 14, 77, 50 };
    int target = 14;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == target) {
        System.out.println("yes , it is index in: " + i);
      }

    }
  }
}
