package com.codemarvel;

public class SquareDemo {
    public static void main(String[] args) {
        System.out.println(getSquareRoot(25));
    }
    public static int getSquareRoot(int n){
        int start = 0;
        int end = n;
        while(start<=end){
            int mid = start +(end-start)/2;
            if(mid*mid<n){
                start = mid+1;
            } else if (mid*mid>n) {
                end = mid-1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
