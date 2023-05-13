package com.cb.lession62;

public class SwitchMain {
    public static void main(String[] args) {
        char grade = 'B';
        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
            case 'C':
                System.out.println("Pass");
                break;
            default:
                System.out.println("Fail");
        }

        String result = switch (grade) {
            case 'A' -> "Excellent";
            case 'B', 'C' -> "Pass";
            default -> "Fail";
        };
        System.out.println(result.toUpperCase());
    }
}
