package com.codemarvel;

public class FindStringChar {
    public static void main(String[] args) {
        String string = "Heelo";
        char ch = 'o';
        System.out.println(getFind(string,ch));
    }
    public static int getFind(String string,char ch){
        for(int i=0;i<string.length();i++){
            if(string.charAt(i)==ch){
                return i;
            }
        }
        return -1;
    }
}
