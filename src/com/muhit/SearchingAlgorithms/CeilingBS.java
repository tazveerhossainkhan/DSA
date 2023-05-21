package com.muhit.SearchingAlgorithms;

public class CeilingBS {
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        int target = 15;
        int ans = ceiling(arr,target);
        if(ans==-1)
        {
            System.out.println("Target is not exist");
        }
        else {
            System.out.print(ans);
        }
    }
    static int ceiling(int[] arr, int target)
    {
        if(target>arr[arr.length -1])
        {
            return -1;
        }
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
        return start;
    }
}
