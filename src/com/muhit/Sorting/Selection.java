package com.muhit.Sorting;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] arr = {3, -1, 5, 4, 2};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr) {
        for (int i = 0; i < arr.length ; i++) {
            /*int selected_max = arr[max(arr, 0, arr.length - i - 1)];
            swap(selected_max, arr[arr.length - i - 1]);*/
            int selected_max = max(arr, 0, arr.length - i - 1);
            swap(arr,selected_max, arr.length - i - 1);
        }
    }

    static int max(int[] arr, int start, int end) {
        int max = start;
        for (int i = start + 1; i <= end; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }
    static void swap(int[] arr, int max_value, int last_value) {
        int temp = arr[max_value];
        arr[max_value] = arr[last_value];
        arr[last_value] = temp;
    }
}
