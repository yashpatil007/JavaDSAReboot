package com.codemarvel;

public class PerfectSquare {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(100));
    }
    public static boolean isPerfectSquare(int num) {
        int start = 0;
        int end = num;
        while(start<=end){
            int mid = start + (end- start)/2;
            if(mid*mid<num){
                start = mid+1;
            } else if(mid*mid>num){
                end = mid-1;
            } else {
                return true;
            }
        }
        return false;
    }
}
