package com.muhit.SearchingAlgorithms;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={2,3,44,11,34,55,66,13};
        int target= 55;
        int ans = linearSearch(arr,target);
        System.out.println(ans);

    }
    static int linearSearch(int[] arr,int target)
    {
        //if array is empty, then return -1 as target value is not found
        if(arr.length==0)
        {
            return -1;
        }
        //check weather target value is in the array or not
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i]==target)
            {
                return i;
            }
        }
        //this will execute if array travarsal is completed but target value is not found
        return -1;
    }
}
