package com.codemarvel;

public class BankProblem {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},
                {2,3,4},
                {5,6,7}};
        System.out.println(getReturn(arr));
    }
    public static int getReturn(int[][] arr){
        int ans=0;
        for(int i=0;i<arr.length;++i){
            int sum=0;
            for(int j=0;j< arr[i].length;++j){
                sum+=arr[i][j];
            }
            if(ans<sum){
                ans=sum;
            }
        }
        return ans;
    }
}
