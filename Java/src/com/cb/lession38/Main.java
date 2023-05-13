package com.cb.lession38;

public class Main {
    public static void main(String[] args) {
        int age = 21;
        int copyAge = increment(age);
        System.out.println(age);
        System.out.println(copyAge);
    }
    static int increment(int age){
        return ++age;
    }
}
