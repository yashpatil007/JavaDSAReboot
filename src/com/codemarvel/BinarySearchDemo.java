package com.codemarvel;

public class BinarySearchDemo {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1,0,1,2,3};
        System.out.println(isAcending(arr,3));
    }
    public static int getBinary(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            } else if(target<arr[mid]){
                end=mid-1;
            } else {
                return mid;
            }
        }
        return -1;
    }


    public static int isAcending(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        boolean isAsc = arr[start]<arr[end];
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target==arr[mid]){
                return mid;
            }
            if(isAsc){
                if(target>arr[mid]){
                    start = mid+1;
                } else {
                    end=mid-1;
                }
            } else {
                if(target<arr[mid]){
                    start = mid+1;
                } else {
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}
