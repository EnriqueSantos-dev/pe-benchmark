package arapiraca.ufal.gti;

import java.util.Arrays;

public class Main {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = { 83, 49, 22, 11, 67, 35, 88, 94, 38, 68,
                75, 32, 70, 2, 14, 17, 96, 53, 5, 79,
                59, 90, 41, 71, 64, 87, 27, 8, 42, 60,
                1, 72, 76, 45, 63, 33, 99, 7, 51, 89,
                56, 26, 30, 93, 21, 15, 80, 58, 66, 24,
                18, 78, 61, 47, 85, 3, 73, 37, 29, 19,
                9, 92, 12, 55, 69, 36, 44, 81, 20, 46,
                25, 74, 31, 54, 77, 16, 86, 91, 6, 98,
                50, 10, 84, 4, 34, 28, 23, 95, 57, 65,
                43, 40, 62, 52, 48, 82, 97, 39};
        System.out.println("Array original: " + Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Array ordenado: " + Arrays.toString(arr));
    }
}