package org.example.Algorithms.sorting;

public class QuickSort {
    public static void sort(int[] arr, int l, int h) {
        if (l < h) {
            int pi = partition(arr, l, h);
            sort(arr, l, pi - 1);
            sort(arr, pi + 1, h);
        }

    }

    private static int partition(int[] arr, int l, int h) {
        int pi = arr[h];
        int i = l - 1;
        for (int j = l; j < h; j++) {
            if (arr[j] < pi) {
                i++;
                swap(arr,i, j);
            }
        }
        swap(arr, i+1, h);
        return i + 1;
    }

    private static void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
