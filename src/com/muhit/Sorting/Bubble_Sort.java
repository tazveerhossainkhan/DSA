package com.muhit.Sorting;

import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        bubble_sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble_sort(int[] arr) {
        // run the steps n-1 times  (n is the size of array)
        for (int i = 0; i < arr.length - 1; i++) {
            //for each step max item will come at the last respective index
            boolean swap = false;

            for (int j = 1; j < arr.length - i; j++) {
                //item will be swap if the item is smaller than the previous item

                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    swap = true;
                }
            }
            if (swap == false) {
                break;
            }
        }
    }
}
