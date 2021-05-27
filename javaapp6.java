package com.programavimo_praktika;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class javaapp6 {
    public static void main(String[] args) throws Exception {
        int n = 0;
        System.out.println("Darba atliko: Karolis Pociunas ISI-19I");
        System.out.println("Masyvo dydi: ");
        BufferedReader mas_dydis = new BufferedReader(new InputStreamReader(System.in));
        int m_dydis = Integer.parseInt(mas_dydis.readLine());
        int masyvas[] = new int[m_dydis];

        while (n != m_dydis) {
            System.out.println("Iveskite " + (n+1) + "-aji masyvo elementa: ");
            BufferedReader elementas = new BufferedReader(new InputStreamReader(System.in));
            int mas_elementas = Integer.parseInt(elementas.readLine());
            masyvas[n] = mas_elementas;
            n = n + 1;
        }
        System.out.println("Jusu ivestas masyvas: ");
        for (int skaicius: masyvas) {
            System.out.println(skaicius);
        }
        int pakeitimai = 0;
        System.out.println("Pakoreguotas masyvas: ");
        for (int skaicius: masyvas) {
            if(skaicius < 0){
                skaicius = 0;
                pakeitimai = pakeitimai +1;
            }
            System.out.println(skaicius);
        }
        System.out.println("Pakeitimu skaicius: " + pakeitimai);
    }
}