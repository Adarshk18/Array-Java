package com.adarsh;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5);
        /*list.add(23);
        list.add(13);
        list.add(41);
        list.add(2);
        list.add(83);
        list.add(20);
        list.add(43);

        System.out.println(list.contains(43));
        System.out.println(list);
        list.set(3,98);
        System.out.println(list);
        list.remove(3);

        System.out.println(list);*/
        for (int i=0; i<5; i++){
            list.add(in.nextInt());
        }

        //get items
        for (int i=0; i<5; i++){
            System.out.println(list.get(i));
        }
        System.out.println(list);
    }
}
