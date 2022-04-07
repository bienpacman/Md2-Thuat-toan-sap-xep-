package com.company;

public class BubbleSort {

    public static void main(String[] args) {
        // write your code here
        int array[] = {4, 5, 2, 1, 7, 8, 6};
        bubbleSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
    }

        public static void bubbleSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {

            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
    }
//    public static void bubbleSort(int[] list) {
//
//        for (int k = 1; k < list.length ; k++) {
//
//            for (int i = 0; i < list.length - k; i++) {
//                if (list[i] > list[i + 1]) {
//                    int temp = list[i];
//                    list[i] = list[i + 1];
//                    list[i + 1] = temp;
//
//                }
//            }
//        }
//    }
}
