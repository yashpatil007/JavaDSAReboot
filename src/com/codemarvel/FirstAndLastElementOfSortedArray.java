package com.codemarvel;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FirstAndLastElementOfSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,3,3,3,4,5};
        int [] arr2 = getFindIndex(arr,3);
        System.out.println(Arrays.toString(arr2));
    }
    public static int[] getFindIndex(int[] arr,int target){
        int[] ans = {-1,-1};
        int a = getFind(arr,target,true);
        int b = getFind(arr,target,false);
        ans[0] = a;
        ans[1]=b;
        return ans;
    }
    public static int getFind(int[] arr, int target,boolean isFind){
        int ans = -1;
        int start =0;
        int end =arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target<arr[mid]){
                end = mid-1;
            } else if (target>arr[mid]){
                start = mid+1;
            } else {
                ans = mid;
                if(isFind){
                    end = mid-1;
                } else {
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}
