package com.codemarvel;

public class MountainArrayQuestion {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,4,3,2,1};
        int x = getMountain(arr);
        System.out.println(x);
    }
    public static int getMountain(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end = mid;
            } else {
                start = mid+1;
            }
        }
        return end;
    }
}
