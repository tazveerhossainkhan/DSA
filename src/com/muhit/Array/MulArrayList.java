package com.muhit.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class MulArrayList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < 2; i++) {
            list.get(i).add(input.nextInt());
        }

    }
}
