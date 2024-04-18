package com.codemarvel;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveElementinArray {
    public static void main(String[] args) {
        int[] arr = {11,22,33,11,33,44,55,66,77,22};
        int[] arr2 = getRemove(arr);
        System.out.println(Arrays.toString(arr2));
    }
    public static int[] getRemove(int[] arr){
        Set<Integer> set = new HashSet<>();
        for(int i : arr){
            set.add(i);
        }
        int[] array = new int[set.size()];
        int count = 0;
        for(int x : set){
            array[count++]=x;
        }
        return array;
    }
}
