package com.codemarvel;

public class CielandFloorNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,7,8,9};
        System.out.println(getCiel(arr,5));
    }
    public static int getCiel(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            } else if (target<arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return end;//if we want to ciel then return start and if you want to floor number then return end
    }

}
