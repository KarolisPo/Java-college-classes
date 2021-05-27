package com.programavimo_praktika;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class javaapp7 {
    public static void main(String[] args) throws Exception {
        int n = 0;
        int m = 0;

        System.out.println("Darba atliko: Karolis Pociunas ISI-19I");
        int a_masyvas[] = new int[10];
        int b_masyvas[] = new int[10];
            while (n != 10 && m != 10) {
                System.out.println("Generuojamas atsitiktinis A masyvas...");
                System.out.println("Gautas masyvas A: ");
                Random atsitiktinis_a = new Random();
                for (int i = 0; i < 10; i++) {
                    int roll_a = atsitiktinis_a.nextInt(10) + 1;
                    System.out.println(roll_a);
                    a_masyvas[m] = roll_a;
                    m = m + 1;
                }
                System.out.println("Generuojamas atsitiktinis B masyvas...");
                System.out.println("Gautas masyvas B: ");
                Random atsitiktinis_b = new Random();
                for (int i = 0; i < 10; i++) {
                    int roll_b = atsitiktinis_b.nextInt(10) + 1;
                    System.out.println(roll_b);
                    b_masyvas[n] = roll_b;
                    n = n + 1;
                }
            }
            System.out.println("Iveskite masyva A: ");
            m = 0;
            n = 0;
            while (m != 10 && n != 10) {
                for (int skaicius : a_masyvas) {
                    System.out.println("Iveskite A masyvo " + (m + 1) + "-aji elementa: ");
                    BufferedReader elementas = new BufferedReader(new InputStreamReader(System.in));
                    int mas_elementas = Integer.parseInt(elementas.readLine());
                    if (skaicius > mas_elementas) {
                        a_masyvas[m] = 0;
                    } else {
                        a_masyvas[m] = mas_elementas;
                    }
                    m = m + 1;

                }
                System.out.println("Salygos pakeistas masyvas A: ");
                for (int skaicius : a_masyvas) {
                    System.out.println(skaicius);
                }
                for (int skaicius : b_masyvas) {
                    System.out.println("Iveskite B masyvo " + (n + 1) + "-aji elementa: ");
                    BufferedReader elementas = new BufferedReader(new InputStreamReader(System.in));
                    int mas_elementas = Integer.parseInt(elementas.readLine());
                    if (skaicius > mas_elementas) {
                        a_masyvas[n] = 0;
                    } else {
                        a_masyvas[n] = mas_elementas;
                    }
                    n = n + 1;

                }
                System.out.println("Salygos pakeistas masyvas B: ");
                for (int skaicius : a_masyvas) {
                    System.out.println(skaicius);
                }
            }


    }
}