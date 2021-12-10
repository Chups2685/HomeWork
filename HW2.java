package com.company;

public class HW2 {
    public static void main(String[] args) {
        // write your code here
        int a = 2, b = 8;
        System.out.println(5 + a / b);
        System.out.println((5 + a) / b);
        System.out.println((5 + a++) / b);
        System.out.println((5 + a++) / --b);
        System.out.println((5 * a >> a++) / --b);
        System.out.println((5 + 7 > 20 ? 68 : 22 * a >> a++) / --b);
        //????????System.out.println((5 + 7 > 20 ? 68 >= 68 : 22 * a >> a++) / --b);????
        System.out.println(6 - a > 3 && 12 * 12 <= 119);
        System.out.println(true && false);
    }
}
