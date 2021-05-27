package com.programavimo_praktika;

import java.text.NumberFormat;

public class javaapp2 {
    public static void main(String[] args) {
        double a = 2.000;
        double b = 5.1256;
        double c = 4.4444;

        NumberFormat apvalinimas = NumberFormat.getNumberInstance();
        apvalinimas.setMinimumFractionDigits(4);
        apvalinimas.setMaximumFractionDigits(4);

        System.out.println("Darba atliko: Karolis Pociunas ISI-19I");
        System.out.println("A=" + a);
        System.out.println("B=" + b);
        System.out.println("C=" + c);
        System.out.println("=================================");
        System.out.println("A + B = " + apvalinimas.format(a+b));
        System.out.println("A + C = " + apvalinimas.format(a+c));
        System.out.println("A / B = " + apvalinimas.format(a/b));
        System.out.println("A / C = " + apvalinimas.format(a/c));
        System.out.println("A * B = " + apvalinimas.format(a*b));
        System.out.println("A * C = " + apvalinimas.format(a*c));

    }
}
