package com.adarsh;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*String[] arr = new String[4];
        System.out.println(arr[0]);*/

        /*int[] arr = new int[5];
        arr[0] = 21;
        arr[1] = 12;
        arr[2] = 45;
        arr[3] = 31;
        arr[4] = 23;
        System.out.println(arr[4]);*/

        //input using for loop
        /*for (int i=0; i< arr.length; i++){
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));*/

        /*for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        for (int num: arr){
            System.out.println(num + " ");*/

        //arrays of objects
        String[] str = new String[4];
        System.out.println("Enter the elements: ");
        for (int i=0; i< str.length; i++){
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
        }
    }

