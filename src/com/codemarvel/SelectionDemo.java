package com.codemarvel;

import java.util.Arrays;

public class SelectionDemo {
    public static void main(String[] args) {
        int[] arr={-32,-21,-51,0,1,5,4,3,2,1};
        getSelection(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void getSelection(int[] arr){
        for(int i=0;i< arr.length;++i){
            int end = arr.length-i-1;
            int max = getMax(arr,0,end);
            getSwap(arr,max,end);
        }
    }
    public static void getSwap(int[] arr,int start,int end){
        int temp = arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
    public static int getMax(int[] arr,int start,int end){
        int max = 0;
        for(int i =start;i<=end;++i){
            if(arr[i]>arr[max]){
                max = i;
            }
        }
        return max;
    }
}
