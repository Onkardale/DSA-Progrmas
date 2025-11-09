package KunalKushwah;

//steps
// 1) find the middle element.
// 2) target > mid => search in the right else search in the left.
// 3) if middle elements == target element
public class BinarySearch {
    public static void main(String[] args) {
        int target = 12;
        int[] arr = {2, 4, 6, 9, 11, 12, 14, 20, 36, 48};
        int result = binarySearch(arr,target);

        if (result == -1){
            System.out.println("Element Not Found");
        }else {
            System.out.println("Element found in index: "+ result);
        }

    }

    public static  int binarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;


        for (; left <= right ;){
            int mid = left +(right - left ) / 2;
            System.out.println("mid "+mid);
            if (arr[mid] == target){
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
                System.out.println("left "+left);
            }else {
                right = mid - 1;
                System.out.println("right "+right);
            }

            }
        return  - 1;
        }
    }



















































