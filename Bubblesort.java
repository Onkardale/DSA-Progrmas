package KunalKushwah;

public class Bubblesort {
    public static void main(String[] args) {
        int[] arr ={1 ,7,10,3,2};

        for (int i = 0; i < arr.length - 1 ; i++) {
            for (int j = 0; j <arr.length  - 1 ; j++) {
                if (arr[j] > arr[j+ 1]){
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



