package com.programavimo_praktika;

import java.util.Locale;
import java.util.Scanner;
import java.io.*;

public class javaapp11 {


    public static void irasytiGale() {
        int x = 0;
        System.out.println("Kiek studentu norite irasyti? : ");
        try {
            Scanner skaicius = new Scanner(System.in);
            int studSk = skaicius.nextInt();
            while (x != studSk) {
                try {
                    System.out.println("Iveskite studento varda: ");
                    Scanner ivestisVardas = new Scanner(System.in);
                    String vardas = ivestisVardas.nextLine();

                    System.out.println("Iveskite studento pavarde: ");
                    Scanner ivestisPavarde = new Scanner(System.in);
                    String pavarde = ivestisPavarde.nextLine();

                    System.out.println("Iveskite studento grupe: ");
                    Scanner ivestisGrupe = new Scanner(System.in);
                    String grupe = ivestisGrupe.nextLine();

                    System.out.println("Iveskite studento pazymiu vidurki: ");
                    Scanner vid = new Scanner(System.in);
                    String vidurkis = vid.nextLine();

                    FileWriter fw = new FileWriter("C:\\Users\\carca\\IdeaProjects\\11praktine\\studentai.txt", true);
                    fw.write(String.format("%-15S", vardas.substring(0, 1).toUpperCase() + vardas.substring(1).toLowerCase()));
                    fw.write(String.format("%-15S", pavarde.substring(0, 1).toUpperCase() + pavarde.substring(1).toLowerCase()));
                    fw.write(String.format("%-15S", grupe.toUpperCase(Locale.ROOT)));
                    fw.write(String.format("%-15S\n", vidurkis));
                    fw.close();
                    x++;
                } catch (Exception e) {
                    System.out.println("Klaidinga ivestis.");
                }
            }
        } catch (Exception e) {
            System.out.println("Klaidinga ivestis");
        }

    }


    public static void perrasyti() {
        try{
            PrintWriter writer = new PrintWriter("C:\\Users\\carca\\IdeaProjects\\11praktine\\studentai.txt");
            writer.print("");
            writer.close();
        }catch (Exception e){
            System.out.print("Ivyko klaida.");
        }


    }


    public static void spausdinti() {
        try {
            System.out.println();
            String isvedamoji = String.format("%-15S%-15S%-15S%-15S", "Vardas", "Pavarde", "Grupe","Vidurkis");
            System.out.println(isvedamoji);
            System.out.println("===========================================================");
            BufferedReader br = new BufferedReader(
                    new FileReader("C:\\Users\\carca\\IdeaProjects\\11praktine\\studentai.txt"));
            String s;
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
            br.close();
        } catch (Exception e) {
            System.out.println("Klaidinga ivestis.");
        }
    }


    public static void kopijuoti() {
        FileReader fr = null;
        FileWriter fw = null;
        try {
            Scanner pav = new Scanner(System.in);
            System.out.println("Irasykite naujos bylos pavadinima");
            String pasirinkimas = pav.nextLine();
            fr = new FileReader("C:\\Users\\carca\\IdeaProjects\\11praktine\\studentai.txt");
            fw = new FileWriter("C:\\Users\\carca\\IdeaProjects\\11praktine\\"+ pasirinkimas +".txt");
            int c = fr.read();
            while(c!=-1) {
                fw.write(c);
                c = fr.read();

            }
        } catch(IOException e) {
            e.printStackTrace();
        }finally {
            try{
                fw.close();
                fr.close();
            }catch (Exception e){
                System.out.println(e);
            }

    }


    }

    public static void main(String[] args) {
        System.out.println("Darba atliko Karolis Pociunas ISI-19I");
        System.out.println();
        boolean x = true;
        while (x == true){
            try{
                System.out.println();
                System.out.println("Pasirinkite norima veiksma: ");
                System.out.println("1. Irasyti duomenis i bylos pabaiga. ");
                System.out.println("2. Istrinti senus duomenis ir rasyti naujus. ");
                System.out.println("3. Kopijuoti duomenis i nauja byla.");
                System.out.println("4. Spausdinti duomenis.");
                System.out.println("5. Baigti.");
                System.out.println("Pasirinkite norima veiksma: ");
                Scanner ivestis = new Scanner(System.in);
                int pasirinkimas = ivestis.nextInt();

                if (pasirinkimas == 1){
                    irasytiGale();
                }
                else if (pasirinkimas == 2){
                    perrasyti();
                    irasytiGale();
                }
                else if ( pasirinkimas == 3){
                    kopijuoti();
                }
                else if ( pasirinkimas == 4){
                    spausdinti();
                }
                else if ( pasirinkimas == 5){
                    System.out.println("Programa isjungiama.");
                    x = false;
                }
                else {
                    System.out.println("Klaidingas pasirinkimas.");
                }
            }catch (Exception e){
                System.out.println("Klaidinga ivestis");
            }

            }
        }
    }



