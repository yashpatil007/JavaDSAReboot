package com.codemarvel;

import java.util.Arrays;

public class BubbleDemo {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        getBubble(arr);
        System.out.println(Arrays.toString(arr));
        int x = arr.length-1;
        System.out.println("Second largest Element : "+x);
    }
    public static void getBubble(int[] arr){
        for(int i=0;i< arr.length;++i){
            for(int j =1;j< arr.length-i;++j){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }
}
