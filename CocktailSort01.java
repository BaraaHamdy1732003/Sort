import java.util.Arrays;

public class CocktailSort01 {

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 4, 9, 1, 3, 7, 6};
        System.out.println("Original array: " + Arrays.toString(arr));
        cocktailSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    public static void cocktailSort(int[] arr) {
        boolean swapped = true;
        int start = 0;
        int end = arr.length - 1;

        while (swapped) {
            swapped = false;

            // Move the largest element to the end
            for (int i = start; i < end; i++) {
                if (arr[i] > arr[i+1]) {
                    swap(arr, i, i+1);
                    swapped = true;
                }
            }
            end--;
            printArray(arr);

            // If no swaps occurred, the array is sorted
            if (!swapped) {
                break;
            }

            swapped = false;

            // Move the smallest element to the start
            for (int i = end - 1; i >= start; i--) {
                if (arr[i] > arr[i+1]) {
                    swap(arr, i, i+1);
                    swapped = true;
                }
            }
            start++;
            printArray(arr);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
