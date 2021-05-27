package com.programavimo_praktika;

import java.util.Scanner;
import java.lang.Math;

class pitagoras{
    final double pi = 3.14;
    final double g = 9.8;
    public static double aukstis, spindulys, l, svoris, plotas;
    final double storis = 0.001;

    public static void setkugis (double newh, double newr) {
        aukstis = newh;
        spindulys = newr;
    }
    public double izambine(){
        l = Math.sqrt(Math.pow(aukstis, 2) + Math.pow(spindulys, 2));
        return l;
    }
}

class kugis extends pitagoras{

    public double pavirsiausPlotas() {
        plotas = (pi*Math.pow(spindulys,2)) + (pi*spindulys*l);

        return plotas;
    }

    public static void kugioSvoris(double newSvoris){
        svoris = newSvoris;
    }

    public double kugioMase(){
        double mase = svoris*plotas*storis;
        return mase;
    }
        }


public class javaapp15 {
    public static void main(String[] args) throws Exception {
        kugis k = new kugis();
        boolean x = true;
        try{
            while (x = true){
                System.out.println();
                System.out.println("Pasirinkite veiksma kuri norite atlikti:");
                System.out.println("1. Ivesti kugio auksti ir spinduli.");
                System.out.println("2. Rasti kugio sudaromaja");
                System.out.println("3. Kugio pavirsiaus plotas");
                System.out.println("4. Ivesti kugio medziagos svori.");
                System.out.println("5. Kugio mase.");
                System.out.println("6. Baigti.");

                Scanner myOpt = new Scanner(System.in);
                int pasirinkimas = myOpt.nextInt();

                if (pasirinkimas == 1){

                    System.out.println("Iveskite kugio auksti metrais:");
                    Scanner myaukst = new Scanner(System.in);
                    double aukst = myaukst.nextDouble();

                    System.out.println("Iveskite kugio pagrindo spinduli metrais:");
                    Scanner myilg = new Scanner(System.in);
                    double ilg = myilg.nextDouble();

                    k.setkugis(aukst, ilg);

                }
                else if (pasirinkimas == 2){
                    System.out.println("Kugio sudaromoji yra: ");
                    System.out.println(String.format("%,.2f",k.izambine()));
                }
                else if (pasirinkimas == 3){
                    System.out.println("Kugio pavirsiaus plotas yra: ");
                    System.out.println(String.format("%,.2f",k.pavirsiausPlotas()) + " kv m");
                }
                else if (pasirinkimas == 4) {
                    System.out.println("Iveskite kiek kg sveria kvadratinis metras medziagos: ");
                    Scanner mySvoris = new Scanner(System.in);
                    double svoris = mySvoris.nextDouble();

                    k.kugioSvoris(svoris);
                }
                else if (pasirinkimas == 5) {
                    System.out.println("Kugio mase yra: " + String.format("%,.2f",k.kugioMase()) + " kg.");
                }
                else if( pasirinkimas == 6){
                    System.out.println("Programa isjungiama...");
                    break;
                }
                else{
                    System.out.println("Klaidingas pasirinkimas.");
                }
            }

        }catch (Exception e){
            System.out.println("Klaidinga ivestis.");
        }


    }
}
