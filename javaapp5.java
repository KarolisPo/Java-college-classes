package com.programavimo_praktika;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class javaapp5 {
    public static void main(String[] args) throws Exception {
        System.out.println("Darba atliko: Karolis Pociunas ISI-19I");
        System.out.println("Iveskite A pradzia: ");
        BufferedReader as_pradzia = new BufferedReader(new InputStreamReader(System.in));
        int a_pradzia = Integer.parseInt(as_pradzia.readLine());
        System.out.println("Iveskite A pabaiga: ");
        BufferedReader as_pabaiga = new BufferedReader(new InputStreamReader(System.in));
        int a_pabaiga = Integer.parseInt(as_pabaiga.readLine());
        System.out.println("Iveskite A kitimo zingsni: ");
        BufferedReader hs = new BufferedReader(new InputStreamReader(System.in));
        int h = Integer.parseInt(hs.readLine());
        System.out.println("Iveskite skaiciu B: ");
        BufferedReader bs = new BufferedReader(new InputStreamReader(System.in));
        int b = Integer.parseInt(bs.readLine());


        while (a_pradzia <= a_pabaiga) {
            if (a_pradzia > 0 && b > 0) {
                int atsakymas = a_pradzia + b;
                System.out.println("Y= a + b = " + atsakymas);
            } else {
                System.out.println("Y = a^2 + b^2 = " + (b*b) + (a_pradzia*a_pradzia));
            }
            a_pradzia = a_pradzia + h;
        }
    }
}
