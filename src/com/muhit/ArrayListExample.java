package com.muhit;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(132);
        list.add(122);
        list.add(142);
        list.add(152);
        list.add(162);
        list.add(127);
        list.add(12);
        list.add(512);
        list.add(122);
        list.add(142);
        list.add(12);
        list.add(12);
        list.add(1278);
        list.add(162);
        list.add(152);
        list.add(120);
        list.add(1200);
        list.add(17772);
        list.add(33772);
        System.out.println(list);
        System.out.println("Change made");
        System.out.println(list.contains(321));
        list.add(11);
        list.remove(10);
        System.out.println(list);
        ArrayList<Integer> list1 = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            list1.add(input.nextInt());
        }
        System.out.println(list1);
    }
}
