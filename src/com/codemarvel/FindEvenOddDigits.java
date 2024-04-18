package com.codemarvel;

public class FindEvenOddDigits {
    public static void main(String[] args) {
        int[] arr={12,3,2,33,44,3333,333,2234};
        int x = getNum(arr);
        System.out.println(x);
    }
//    public static int getValue(int[] arr){
//        int count=0;
//        for(int i : arr){
//            if(getEven(i)){
//                count++;
//            }
//        }
//        return count;
//    }
//    public static boolean getEven(int num) {
//        int numberOfDigits = digits(num);
//        if(numberOfDigits%2==0){
//            return true;
//        }
//        return false;
//    }
//    public static int digits(int num){
//        int count=0;
//        while(num>0){
//            count++;
//            num/=10;
//        }
//        return count;
//    }
    public static int getNum(int[] arr){
        int count = 0;
        for(int i : arr){
            if(isTrue(i)){
                count++;
            }
        }
        return count;
    }
    public static boolean isTrue(int num){
        int count = digits(num);
        return count % 2 == 0;
    }
    public static int digits(int num){
        int count = 0;
        while(num>0){
            count++;
            num/=10;
        }
        return count;
    }

}
