package com.programavimo_praktika;

import java.util.Locale;
import java.util.Scanner;
import java.io.*;

public class javaapp10 {

    public static void main(String[] args) {
        int x = 0;
        System.out.println("Darba atliko: Karolis Pociunas ISI-19I");
        System.out.println("Kiek studentu norite irasyti? : ");
        try {
            Scanner skaicius = new Scanner(System.in);  // Create a Scanner object
            int studSk = skaicius.nextInt();  // Read user input
            while (x != studSk) {
                try {
                    System.out.println("Iveskite studento varda: ");
                    Scanner ivestisVardas = new Scanner(System.in);  // Create a Scanner object
                    String vardas = ivestisVardas.nextLine();  // Read user input

                    System.out.println("Iveskite studento pavarde: ");
                    Scanner ivestisPavarde = new Scanner(System.in);  // Create a Scanner object
                    String pavarde = ivestisPavarde.nextLine();  // Read user input

                    System.out.println("Iveskite studento grupe: ");
                    Scanner ivestisGrupe = new Scanner(System.in);  // Create a Scanner object
                    String grupe = ivestisGrupe.nextLine();  // Read user input

                    FileWriter fw = new FileWriter("C:\\Users\\carca\\IdeaProjects\\10praktine\\informacija.txt", true);
                    fw.write(String.format("%-15S", vardas.substring(0, 1).toUpperCase() + vardas.substring(1).toLowerCase()));
                    fw.write(String.format("%-15S", pavarde.substring(0, 1).toUpperCase() + pavarde.substring(1).toLowerCase()));
                    fw.write(String.format("%-15S\n", grupe.toUpperCase(Locale.ROOT)));
                    fw.close();
                    x++;
                } catch (Exception e) {
                    System.out.println("Klaidinga ivestis.");
                }
            }
            try {
                String isvedamoji = String.format("%-15S%-15S%-15S", "Vardas", "Pavarde", "Grupe");
                System.out.println(isvedamoji);
                System.out.println("====================================");
                BufferedReader br = new BufferedReader(
                        new FileReader("C:\\Users\\carca\\IdeaProjects\\10praktine\\informacija.txt"));
                String s;
                while ((s = br.readLine()) != null) {
                    System.out.println(s);
                }
                br.close();
            } catch (Exception e) {
                System.out.println("Klaidinga ivestis.");
            }

        } catch (Exception e) {
            System.out.println("Klaidinga ivestis");
        }


    }
}



