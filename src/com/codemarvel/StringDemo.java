package com.codemarvel;

public class StringDemo {
    public static void main(String[] args) {
        String s = "rahul";
//        System.out.println(getPalindrome(s));
        String x = getRevString(s);
        if(s.equals(x)){
            System.out.println("is Palindrome");
        } else {
            System.out.println("is Not");
        }
    }

    public static int getString(String string) {
        int count = 0;
        for (int i = 1; i < string.length(); ++i) {
            if ('a' == string.charAt(i)) {
                count++;
            }
        }
        return count;
    }
    public static String getString2(String string){
        String name="";
        for(int i=0;i<string.length();++i){
            name = string.replace(" ","");
        }
        return name;
    }
    public static String getRevString(String string){
        StringBuilder reverse = new StringBuilder();
        for(int i=string.length()-1;i>=0;--i){
            reverse.append(string.charAt(i));
        }
        return reverse.toString();
//        String name="";
//        for(int i=string.length()-1;i>=0;--i){
//            name+=string.charAt(i);
//        }
//        return name;
    }
    public static boolean getPalindrome(String string){
        int start = 0;
        int end = string.length()-1;
        while(start<end){
            if(string.charAt(start)==string.charAt(end)){
                return true;
            }
            start++;
            end--;
        }
        return false;
    }
}
