package com.codemarvel;

public class CubeRoot {
    public static void main(String[] args) {
        int n = 127;
        System.out.println(isCube(n));
    }
    public static boolean isCube(int n){
        int start = 0;
        int end = n;
        while(start<=end){
            long mid = start + (end - start)/2;
            if(mid*mid*mid<n){
                start = (int) mid+1;
            } else if (mid*mid*mid>n) {
                end = (int)mid-1;
            } else {
                return true;
            }
        }
        return false;
    }
}
