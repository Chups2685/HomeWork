package com.company;

public class HW1 {
    public static void main(String[] args) {
        byte x = 42, y = 15;// x = 00101010 , y = 00001111
        System.out.println(x | y);// получилось 00101111 или 47
        System.out.println(x & y);// получилось 00001010 или 10
        System.out.println(x ^ y);// получилось 00100101 или 37
        System.out.println(~x);// получилось 11010101 или -43
        System.out.println(~y);// получилось 11110000 или -16
        int c = x << 1;// сдвигая биты на 1 бит влево мы умножаем число на 2 в 1-ой степени полчится 42*2=84 01010100
        int a = y << 1;// 15*2 = 30  00011110
        System.out.println(c);// 84
        System.out.println(a);// 30
        int b = x >> 1;// при сдвиге вправо на 2 бита исходное число делим на 2 в степени 1
        int d = y >> 1;
        System.out.println(b);// 42/2= 21
        System.out.println(d);// 15/2=7.5 округляем в меньшую сторону =7 или 00000111
        int f = x >>> 1;// 00010101 = 21
        int h = y >>> 1;// 0000111 = 7
        System.out.println(f);
        System.out.println(h);

        byte t = -42, g = -15;// x = 11010110, y = 11110001
        System.out.println(t | g);// получилось 11110111 = -9
        System.out.println(t & g);// получилось 11010000 = -48
        System.out.println(t ^ g);// получилось 00100111 = 39
        System.out.println(~t);// получилось 00101001 = 41
        System.out.println(~g);// получилось 00001110 = 14
        int r = t << 1;// сдвигая биты на 1 бит влево мы умножаем число на 2 в 1-ой степени полчится -42*2=-84 10101100
        int w = g << 1;// -15*2 = -30 или 11100010
        System.out.println(r);// -84
        System.out.println(w);// -30
        int v = t >> 2;// при сдвиге вправо на 2 бита исходное число делим на 2 в степени 2
        int n = g >> 2;// сдвигаем вправо с сохранением знакового бита
        System.out.println(v);// -42/4= -10.5 округляем в меньшую сторону = -11 11110101
        System.out.println(n);// -15/4=-3.75 = -4 или 11111100
        System.out.println(t>>>1);// сдвигаем вправо без сохранения знакового бита 11010110>>>1 = 01101011 ????
        System.out.println(g>>>1);// сдвигаем вправо без сохранения знакового бита 11110001>>>1 = 01111000???

        //float e = 42.5; // побитовые операторы применяются только к целочисленным числам
        //System.out.println(~e);// java: bad operand type float for unary operator '~'
    }
}
