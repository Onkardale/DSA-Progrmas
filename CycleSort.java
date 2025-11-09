package KunalKushwah;

public class CycleSort {
    public static void main(String[] args) {
        int arr[] = {3,1,5,2,4};
        int count = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i+1]) {
                    count++;
                }

            }


        System.out.println(count);
    }
}
