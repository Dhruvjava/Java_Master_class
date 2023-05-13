package com.cb.lession41;

import java.util.Arrays;

public class ArraysMain {
    public static void main(String[] args) {
        int[] number = new int[3];
        Arrays.fill(number,-2);
        number[0] = 3;
        System.out.println(Arrays.toString(number));

        String[] names = new String[3];
        Arrays.fill(names,"foo");
        names[1] = "Dhruv";
        System.out.println(Arrays.toString(names));

    }
}
