package com.cb;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
//        int amount = 1_000_000_008;
//        System.out.println(amount);

//        String Vars

        String code = "Code";
        String brains = "Brains";
        System.out.println(code);
        System.out.println(brains);
//        Concatinate
        String brand = code + brains;
        System.out.println(brand);
//        ToUppercase
        System.out.println(brand.toUpperCase());
//        lowercase
        System.out.println(brand.toLowerCase());
//        substring -> part of string
        System.out.println(brand.substring(0,4));
//        check that is String empty
        System.out.println("     ".isEmpty());
//        check is the given String blank
        System.out.println("     ".isBlank());
//
        System.out.println("  a   ".isBlank());

        System.out.println("  a   ");
//        remove white spaces
        System.out.println("  a   ".trim());

    }
}
