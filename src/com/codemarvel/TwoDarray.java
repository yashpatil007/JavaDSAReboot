package com.codemarvel;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for(int i=0;i<arr.length;++i){
            for(int j=0;j<arr[i].length;++j){
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
