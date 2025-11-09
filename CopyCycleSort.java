package KunalKushwah;

public class CopyCycleSort {
    public static void cycleSort(int[] arr) {
            int n = arr.length;

            // Traverse array elements and put them on the right place
            for (int cycleStart = 0; cycleStart < n - 1; cycleStart++) {
                int item = arr[cycleStart];
                int pos = cycleStart;

                // Find where to put the item
                for (int i = cycleStart + 1; i < n; i++) {
                    if (arr[i] < item)
                        pos++;
                }

                // If item is already in correct position, continue
                if (pos == cycleStart)
                    continue;

                // Skip duplicates
                while (item == arr[pos])
                    pos += 1;

                // Put item to its right position
                int temp = arr[pos];
                arr[pos] = item;
                item = temp;

                // Rotate rest of the cycle
                while (pos != cycleStart) {
                    pos = cycleStart;
                    for (int i = cycleStart + 1; i < n; i++) {
                        if (arr[i] < item)
                            pos++;
                    }

                    while (item == arr[pos])
                        pos += 1;

                    temp = arr[pos];
                    arr[pos] = item;
                    item = temp;
                }
            }
        }

        public static void main(String[] args) {
            int[] arr = {3, 1, 5, 2, 4};

            cycleSort(arr);

            System.out.print("Sorted array: ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }

