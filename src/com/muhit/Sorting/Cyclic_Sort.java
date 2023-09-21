package com.muhit.Sorting;

import java.util.Arrays;

public class Cyclic_Sort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 4};
        CyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void CyclicSort(int[] arr) {
        //arr[arr[i]-1] = arr[i];
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, correct, i);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
