package com.codemarvel;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        int a =4;
        int n =3;
        for(int i=0;i<n;++i){
            for(int j=0;j<=i;++j){
                System.out.print(a);
            }
            System.out.println(a+"*");
        }
    }
}
