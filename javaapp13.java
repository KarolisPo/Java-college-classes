package com.programavimo_praktika;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;


class mas {
    int x = 1;
    int y = 0;
    int stulpelis = 20;
    int eilute = 20;
    int m = 0;
    int n = 0;

    int masyvas[][] = new int[100][1000];
    Random atsitiktinis_a = new Random();

    void randomMasyvas() {
        System.out.println("Sugeneruotas masyvas: ");
        for (int i = 0; i < eilute; i++) {
            for (int j = 0; j < stulpelis; j++) {
                int roll_a = atsitiktinis_a.nextInt(10) + 1;
                masyvas[i][j] = roll_a;
            }
        }
    }

    void spausdintiMasyva(){

        System.out.println("Sugeneruotas masyvas: ");
        for (int i = 0; i < eilute; i++) {
            for (int j = 0; j < stulpelis; j++) {
                if (masyvas[i][j] < 10) {
                    System.out.print(" " + masyvas[i][j] + "  ");
                } else {
                    System.out.print(" " + masyvas[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    void ivestiElementa() throws IOException {
        System.out.println("Iveskite eilutes numeri (1-20): ");
        BufferedReader e = new BufferedReader(new InputStreamReader(System.in));
        int eil = Integer.parseInt(e.readLine());
        System.out.println("Iveskite stulpelio numeri numeri (1-20) : ");
        BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
        int stulp = Integer.parseInt(s.readLine());
        System.out.println("Iveskite skaiciu i kuri norite pakeisti (1-10) : ");
        BufferedReader sk = new BufferedReader(new InputStreamReader(System.in));
        int skaicius = Integer.parseInt(sk.readLine());
        for (int i = 0; i < eilute; i++) {
            for (int j = 0; j < stulpelis; j++) {
                if (i == eil - 1 && j == stulp - 1) {
                    masyvas[i][j] = skaicius;
                }
            }
        }
    }
    void pridetiEilStulp() throws IOException {
        System.out.println("Jeigu norite prideti eilute iveskite 1.");
        System.out.println("Jeigu norite prideti stulpeli iveskite 2.");
        BufferedReader ex = new BufferedReader(new InputStreamReader(System.in));
        int prideti = Integer.parseInt(ex.readLine());


        if (prideti == 1) {
            System.out.println("Generuoti eilute atsitiktinai 1.");
            System.out.println("Ivesti eilute ranka 2.");
            BufferedReader pa = new BufferedReader(new InputStreamReader(System.in));
            int gen_pasirinkimas = Integer.parseInt(pa.readLine());
            n++;
            eilute = eilute + 1;



            if (gen_pasirinkimas == 1) {
                for (int i = 19+n; i < eilute; i++) {
                    for (int j = 0; j < stulpelis; j++) {
                        int roll_a = atsitiktinis_a.nextInt(10) + 1;
                        masyvas[i][j] = roll_a;
                    }
                }
                System.out.println("Gautas masyvas:");
                for (int i = 0; i < eilute; i++) {
                    for (int j = 0; j < stulpelis; j++) {
                        if (masyvas[i][j] < 10) {
                            System.out.print(" " + masyvas[i][j] + "  ");
                        } else {
                            System.out.print(" " + masyvas[i][j] + " ");
                        }

                    }
                    System.out.println();
                }
                System.out.println();
            } else if (gen_pasirinkimas == 2) {
                for (int i = 19+n; i < eilute; i++) {
                    for (int j = 0; j < stulpelis; j++) {
                        System.out.println("Iveskite " + (j + 1) + " -aji elementa: ");
                        BufferedReader elem = new BufferedReader(new InputStreamReader(System.in));
                        int element = Integer.parseInt(elem.readLine());
                        masyvas[i][j] = element;
                    }
                }
                System.out.println("Jusu masyvas:");
                for (int i = 0; i < eilute; i++) {
                    for (int j = 0; j < stulpelis; j++) {
                        if (masyvas[i][j] < 10) {
                            System.out.print(" " + masyvas[i][j] + "  ");
                        } else {
                            System.out.print(" " + masyvas[i][j] + " ");
                        }

                    }
                    System.out.println();
                }
                System.out.println();
            }
        } else if (prideti == 2) {
            System.out.println("Generuoti stulpeli atsitiktinai 1.");
            System.out.println("Ivesti stulpeli ranka 2.");
            BufferedReader pa = new BufferedReader(new InputStreamReader(System.in));
            int gen_pasirinkimas = Integer.parseInt(pa.readLine());
            m++;
            stulpelis = stulpelis +1;

            if (gen_pasirinkimas == 1) {
                for (int i = 0; i < eilute; i++) {
                    for (int j = 19+m; j < stulpelis; j++) {
                        int roll_a = atsitiktinis_a.nextInt(10) + 1;
                        masyvas[i][j] = roll_a;
                    }
                }
                System.out.println("Gautas masyvas:");
                for (int i = 0; i < eilute; i++) {
                    for (int j = 0; j < stulpelis; j++) {
                        if (masyvas[i][j] < 10) {
                            System.out.print(" " + masyvas[i][j] + "  ");
                        } else {
                            System.out.print(" " + masyvas[i][j] + " ");
                        }

                    }
                    System.out.println();
                }
                System.out.println();
                System.out.println("m= "+m);
                System.out.println("Stulpelis " + stulpelis);
            }

            else if (gen_pasirinkimas == 2) {
                for (int i = 0; i < eilute; i++) {
                    for (int j = 19+m; j < stulpelis; j++) {
                        System.out.println("Iveskite " + (i + 1) + " -aji elementa: ");
                        BufferedReader elem = new BufferedReader(new InputStreamReader(System.in));
                        int element = Integer.parseInt(elem.readLine());
                        masyvas[i][j] = element;
                    }
                }
                System.out.println("Jusu masyvas:");
                for (int i = 0; i < eilute; i++) {
                    for (int j = 0; j < stulpelis; j++) {
                        if (masyvas[i][j] < 10) {
                            System.out.print(" " + masyvas[i][j] + "  ");
                        } else {
                            System.out.print(" " + masyvas[i][j] + " ");
                        }

                    }
                    System.out.println();
                }
                System.out.println();

            }
        }
    }
    void pasalintiEilStulp() throws IOException {
        System.out.println("Pasalinti eilute 1.");
        System.out.println("Pasalinti stulpeli 2.");
        BufferedReader pa = new BufferedReader(new InputStreamReader(System.in));
        int pasalinti = Integer.parseInt(pa.readLine());

        if (pasalinti == 1){
            eilute = eilute - 1;
            System.out.println("Masyvas pasalinus eilute: ");
            for (int i = 0; i < eilute; i++) {
                for (int j = 0; j < stulpelis; j++) {
                    if (masyvas[i][j] < 10) {
                        System.out.print(" " + masyvas[i][j] + "  ");
                    } else {
                        System.out.print(" " + masyvas[i][j] + " ");
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
        else if (pasalinti == 2){
            stulpelis = stulpelis-1;
            System.out.println("Masyvas pasalinus stulpeli: ");
            for (int i = 0; i < eilute; i++) {
                for (int j = 0; j < stulpelis; j++) {
                    if (masyvas[i][j] < 10) {
                        System.out.print(" " + masyvas[i][j] + "  ");
                    } else {
                        System.out.print(" " + masyvas[i][j] + " ");
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
    }




}
public class javaapp13 {




    public static void main(String[] args) throws Exception {
        int x = 1;

        mas A = new mas();
        A.randomMasyvas();

        System.out.println("Darba atliko: Karolis Pociunas ISI-19I");

        while (x == 1) {
            try {
                System.out.println("JEI NORITE SPAUSDINTI MASYVO TURINĮ SPAUSKITE  1. ");
                System.out.println("JEI NORITE PAKEISTI (ĮVESTI) MASYVO ELEMENTUS, SPAUSKITE  2. ");
                System.out.println("JEI NORITE PRIDĖTI Į MASYVĄ ELEMENTĄ, SPAUSKITE  3. ");
                System.out.println("NORITE PAŠALINTI IŠ MASYVO ELEMENTĄ, SPAUSKITE  4. ");
                System.out.println("JEI NORITE BAIGTI,  SPAUSKITE 5. ");
                BufferedReader iv = new BufferedReader(new InputStreamReader(System.in));
                int pasirinkimas = Integer.parseInt(iv.readLine());

                if(pasirinkimas == 1){
                    A.spausdintiMasyva();
                }
                else if (pasirinkimas == 2){
                    A.ivestiElementa();
                }
                else if (pasirinkimas == 3){
                    A.pridetiEilStulp();
                }
                else if (pasirinkimas == 4){
                    A.pasalintiEilStulp();
                }
                else{
                    System.out.println("Programa isjungiama");
                    break;
                }

            } catch (Exception e) {

            }
            }
        }
    }