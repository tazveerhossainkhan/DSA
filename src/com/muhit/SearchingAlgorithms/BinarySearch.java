package com.muhit.SearchingAlgorithms;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={-42,-22,-11,-9,-4,0,2,6,11,21,32,44,69,71,80,99};
        int target = 2;
        int ans = binarySearch(arr,target);
        if(ans==-1)
        {
            System.out.println("Target is not exist");
        }
        else {
            System.out.print(ans);
        }
    }
    static int binarySearch(int[] arr, int target)
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
        return -1;
    }
}
