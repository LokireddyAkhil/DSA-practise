package SortingAlgorithims;

import java.util.Arrays;

public class MergeSort {
    // Merge Sort function
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            // Recursively sort the first and second halves
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    // Merge function
    public static void merge(int[] arr, int left, int mid, int right) {
        // Find sizes of two subarrays
        int leftSize = mid - left + 1;
        int rightSize = right - mid;

        // Create temp arrays
        int[] leftArray = new int[leftSize];
        int[] rightArray = new int[rightSize];

        // Copy data to temp arrays
        System.arraycopy(arr, left, leftArray, 0, leftSize);
        System.arraycopy(arr, mid + 1, rightArray, 0, rightSize);

        // Merge the temp arrays back into the original array
        int i = 0, j = 0, k = left;
        while (i < leftSize && j < rightSize) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of leftArray[], if any
        while (i < leftSize) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy remaining elements of rightArray[], if any
        while (j < rightSize) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    // Main method to test the Merge Sort
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
        System.out.println("Original array: " + Arrays.toString(arr));

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
