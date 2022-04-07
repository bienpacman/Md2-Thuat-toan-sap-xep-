package com.company;

public class InsertionSort {
    public static void main(String[] args) {
        int array[] = {4, 7, 2, 6, 1, 9, 5};
        insertionSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }

    }

    public static void insertionSort(int arr[]) {
        int pos, x;
        for (int i = 0; i < arr.length; i++) {
            x = arr[i];
            pos = i;
            while (pos > 0 && x < arr[pos - 1]) {
                arr[pos] = arr[pos - 1];
                pos--;
            }
            arr[pos] = x;
        }
    }
}
