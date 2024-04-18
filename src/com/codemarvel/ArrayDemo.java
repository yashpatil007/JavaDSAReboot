package com.codemarvel;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,8,9};
        int x = getArray(arr);
        System.out.println("Element : "+x);
//        getReverse(arr);
//        System.out.println(Arrays.toString(arr));
        System.out.println(getFind(arr,10));
    }
    public static int getArray(int[] arr){
        int max=0;
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }
    public static void getReverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            getSwap(arr,start,end);
            start++;
            end--;
        }
    }
    public static void getSwap(int[] arr,int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end]= temp;
    }
    public static int getFind(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;++i){
            if(target==arr[i]){
                return i;
            }
        }
        return -1;
    }
}
