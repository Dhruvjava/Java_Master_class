package com.cb.lession40;

import java.util.Arrays;

public class ArraysMain {
    public static void main(String[] args) {
//        Arrays
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 123;
        numbers[2] = 65;
        System.out.println("numbers  = "
                + Arrays.toString(numbers));
        System.out.println("Number Size: " + numbers.length);

        int[] number2 = {0, 5, 7, 45, 76, 245};
        System.out.println("number2 = "
                + Arrays.toString(number2));
        number2[1] = 55;

        System.out.println("number2 = "
                + Arrays.toString(number2));
        System.out.println("number2 size =" + number2.length);
    }
}
