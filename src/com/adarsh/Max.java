package com.adarsh;

public class Max {
    public static void main(String[] args) {
        int[] arr = {2,5,6,9};
        System.out.println(maxRange(arr,1,3));
    }

    //imagine that array is not empty
    static int maxRange(int[] arr,int start,int end) {
        int maxVal = arr[start];
        for (int i=start; i<= end; i++){
            if (arr[i]>maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
