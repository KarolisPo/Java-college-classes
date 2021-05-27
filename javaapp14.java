package com.programavimo_praktika;

import java.io.*;
import java.util.Scanner;

public class javaapp14 {
    public static void main(String[] args) throws FileNotFoundException, Exception {

        String pavarde[] = new String[100];
        String vardas[] = new String[100];
        String grupe[] = new String[100];
        Double vidurkis[] = new Double[100];

        Scanner fScn = new Scanner(new File("C:\\Users\\carca\\IdeaProjects\\14praktine\\info.txt"));
        String data;
        int eilnr = 0;

        String[] didesnisvid = new String[100];
        String[] mazesnisvid = new String[100];


        String studentas= String.format("%-15S%-15S%-15S%-15S",
                vardas[eilnr], pavarde[eilnr], grupe[eilnr], vidurkis[eilnr]);

        while (fScn.hasNextLine()) {
            data = fScn.nextLine();
            String[] token = data.split(" ");
            vardas[eilnr] = token[0];
            pavarde[eilnr] = token[1];
            grupe[eilnr] = token[2];
            vidurkis[eilnr] = Double.parseDouble(token[3]);

            if (vidurkis[eilnr] >= 8) {
                didesnisvid[eilnr] = String.format("%-15S%-15S%-15S%-15S",
                        vardas[eilnr], pavarde[eilnr], grupe[eilnr], vidurkis[eilnr]);
            }
            else if (vidurkis[eilnr]<8 && vidurkis[eilnr]>6){
                mazesnisvid[eilnr] = String.format("%-15S%-15S%-15S%-15S",
                        vardas[eilnr], pavarde[eilnr], grupe[eilnr], vidurkis[eilnr]);
            }
            eilnr++;
        }
        System.out.println();
        System.out.println("Siu studentu vidurkis yra 8 ir daugiau:");
        System.out.println(String.format("%-15S%-15S%-15S%-15S", "Vardas", "Pavarde", "Grupe", "Vidurkis"));
        System.out.println("=========================================================");
        for (int i = 0; i < eilnr; i++) {
            if (didesnisvid[i] != null) {
                System.out.println(didesnisvid[i]);

            }
        }
        System.out.println();
        System.out.println("Siu studentu vidurkis yra tarp 8 ir 6:");
        System.out.println(String.format("%-15S%-15S%-15S%-15S", "Vardas", "Pavarde", "Grupe", "Vidurkis"));
        System.out.println("=========================================================");
        for (int i = 0; i < eilnr; i++) {
            if (mazesnisvid[i] != null) {
                System.out.println(mazesnisvid[i]);

            }
        }
    }
}
