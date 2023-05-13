package com.cb.lession39;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Point pointA = new Point(10, 10);
        Point pointB = pointA;
        pointA.x = 100;
        System.out.println("pointA = " + pointA);
        System.out.println("pointB = " + pointB);

        pointB = new Point(200, 55);
        System.out.println("pointA = " + pointA);
        System.out.println("pointB = " + pointB);
    }
}
