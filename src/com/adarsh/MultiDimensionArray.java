package com.adarsh;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionArray {
    public static void main(String[] args) {

        //int[][] arr = new int[3][];
        Scanner in = new Scanner(System.in);
        /*int[][] arr = {
        {2,4,6},
        {1,7,9},
        {3,1,5}
        };*/
        int[][]arr =  new int[3][3];
        System.out.println(arr.length);

        for (int i=0; i<arr.length; i++){
            for (int j=0; j< arr[i].length; j++){
               arr[i][j] = in.nextInt();
            }

        }

       /* for (int i=0; i<arr.length; i++){
            for (int j=0; j< arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }*/

       /* for (int i=0; i<arr.length; i++){
            System.out.println(Arrays.toString(arr[i]));
        }*/

        for (int[] a: arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
