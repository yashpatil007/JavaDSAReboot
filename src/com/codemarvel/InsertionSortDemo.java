package com.codemarvel;

import java.util.Arrays;


public class InsertionSortDemo {
    public static void main(String[] args) {
        int[] arr = {3,2,4,2,13,33};
        getInsertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void getInsertion(int[] arr){
        for(int i=0;i<arr.length-1;++i) {
            for(int j=i+1;j>0;--j){
                if(arr[j]<arr[j-1]){
                    getSwap(arr,j,j-1);
                }
            }
        }
    }
    public static void getSwap(int[] arr,int start,int end){
        int temp = arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
