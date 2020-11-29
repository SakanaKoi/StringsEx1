package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int x = sc.nextInt();
        System.out.println(Integer.toBinaryString(x));
        System.out.println(Integer.toOctalString(x));
        System.out.println(Integer.toHexString(x));
        System.out.println(x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE ? "YES":"NO");
        System.out.println(x >= Short.MIN_VALUE && x <= Short.MAX_VALUE ? "YES":"NO");
    }
}
