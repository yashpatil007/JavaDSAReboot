package com.codemarvel;

public class IsPlaindrome {
    public static void main(String[] args) {
        int x = 12122;
        System.out.println(isPalindrome(x));
    }
    public static boolean isPalindrome(int x){
        if(x<0){
            return false;
        }
        int compare = x;
        int rev=0;
        while(x>0){
            int y=x%10;
            rev=rev*10+y;
            x/=10;
        }
        return compare==rev;
    }
}
