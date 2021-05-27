package com.programavimo_praktika;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Random;

class masyvas {
    int mas[] = new int[10];

    void kurtiMasyva() {
        int n = 0;
        while (n != 10) {
            Random atsitiktinis_a = new Random();
            for (int i = 0; i < 10; i++) {
                int roll_a = atsitiktinis_a.nextInt(10) + 1;
                System.out.println(roll_a);
                mas[n] = roll_a;
                n = n + 1;
            }
        }
    }

    void ivestiRanka() {
        int n = 0;
        while (n != 10) {
            for (int skaicius : mas) {
                System.out.println("Iveskite masyvo " + (n + 1) + "-aji elementa: ");
                BufferedReader elementas = new BufferedReader(new InputStreamReader(System.in));
                int mas_elementas = 0;
                try {
                    mas_elementas = Integer.parseInt(elementas.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (skaicius > mas_elementas) {
                    mas[n] = 0;
                } else {
                    mas[n] = mas_elementas;
                }
                n = n + 1;

            }
        }
    }

    void isvestiPakeista() {
        for (int skaicius : mas) {
            System.out.println(skaicius);
        }
    }
}


public class javaapp12 {

    public static void main(String[] args) throws Exception {
        masyvas A = new masyvas();
        masyvas B = new masyvas();

        System.out.println("Gautas masyvas A:");
        A.kurtiMasyva();
        System.out.println("Gautas masyvas B:");
        B.kurtiMasyva();

        A.ivestiRanka();
        System.out.println("Salygos pakeistas masyvas A:");
        A.isvestiPakeista();

        B.ivestiRanka();
        System.out.println("Salygos pakeistas masyvas B:");
        B.isvestiPakeista();



    }
}