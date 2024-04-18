package com.codemarvel;

public class CoinProblem {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(10));
    }

//    public static int arrangeCoins(int n) {
//        long start = 0;
//        long end = n;
//        while (start <= end) {
//            long mid = start + (end - start) / 2;
//            long coinsNeeded = (mid * (mid + 1)) / 2;
//            if (coinsNeeded == n) {
//                return (int) mid;
//            } else if (coinsNeeded < n) {
//                start = mid + 1;
//            } else {
//                end = mid - 1;
//            }
//        }
//        return (int) end;
//    }
public static int arrangeCoins(int n) {
    long start = 0;
    long end = n;
    while (start <= end) {
        long mid = start + (end - start) / 2;
//        long coinsNeeded = (mid * (mid + 1)) / 2;
        if (mid == n) {
            if(mid%2==0){
                return (int)(mid/2)-1;
            } else {
                return (int)mid/2;
            }
        } else if (mid < n) {
            start = mid + 1;
        } else {
            end = mid - 1;
        }
    }
    return -1;
}
}