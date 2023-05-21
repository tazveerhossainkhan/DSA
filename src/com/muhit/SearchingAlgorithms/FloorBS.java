package com.muhit.SearchingAlgorithms;

public class FloorBS {
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        int target = 1;
        int ans = floor(arr,target);
        System.out.print(ans);

    }
    static int floor(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length-1;
        while (start <= end)
        {
            int mid = start + (end-start)/2 ;  //mid = start+end /2 not used because if I have a very large array than it can be overflow the range of int.
            if(arr[mid] > target)
            {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return end;
    }
}
