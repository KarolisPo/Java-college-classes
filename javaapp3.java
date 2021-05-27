package com.programavimo_praktika;

import java.text.NumberFormat;
import java.io.*;

public class javaapp3 {
    public static void main(String[] args) throws Exception {
        System.out.println("Darba atliko: Karolis Pociunas ISI-19I");
        System.out.println("Iveskite skaiciu A: ");
        BufferedReader as =new BufferedReader(new InputStreamReader(System.in));
        double a = Double.parseDouble (as.readLine());
        System.out.println("Iveskite skaiciu B: ");
        BufferedReader bs =new BufferedReader(new InputStreamReader(System.in));
        double b = Double.parseDouble (bs.readLine());
        System.out.println("Iveskite skaiciu C: ");
        BufferedReader cs =new BufferedReader(new InputStreamReader(System.in));
        double c = Double.parseDouble (cs.readLine());


        NumberFormat apvalinimas = NumberFormat.getNumberInstance();
        apvalinimas.setMinimumFractionDigits(4);
        apvalinimas.setMaximumFractionDigits(4);

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
