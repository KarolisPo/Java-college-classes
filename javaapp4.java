package com.programavimo_praktika;

import java.text.NumberFormat;
import java.io.*;

public class javaapp4 {
    public static void main(String[] args) throws Exception {
        System.out.println("Darba atliko: Karolis Pociunas ISI-19I");
        System.out.println("Iveskite skaiciu A: ");
        BufferedReader as = new BufferedReader(new InputStreamReader(System.in));
        double a = Double.parseDouble(as.readLine());
        System.out.println("Iveskite skaiciu B: ");
        BufferedReader bs =new BufferedReader(new InputStreamReader(System.in));
        double b = Double.parseDouble (bs.readLine());

        NumberFormat apvalinimas = NumberFormat.getNumberInstance();
        apvalinimas.setMinimumFractionDigits(4);
        apvalinimas.setMaximumFractionDigits(4);

        if(a>0 && b>0){
            System.out.println("y = a / b = " + apvalinimas.format(a+b));
        }
        else{
            System.out.println("y = a + b = " + apvalinimas.format((a*a)+(b*b)));
        }
    }
}