package com.codemarvel;

public class Remove_Element {
    public static void main(String[] args) {
        int[] arr={2,4,5,6,2,2};
        System.out.println(removeElement(arr,2));
    }
    public static int removeElement(int[] nums,int val){
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

}
