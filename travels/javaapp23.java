package keliones23;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Scanner;

public class javaapp23 {
    static class Kelione {
        private String transportas, vietove;
        private int dienos;
        private double kaina;


        public Kelione(String transportas, int dienos, String vietove, Double kaina) {
            this.transportas = transportas;
            this.dienos = dienos;
            this.vietove = vietove;
            this.kaina = kaina;
        }

        public String getTransportas() {
            return transportas;
        }

        public double getKaina() {
            return kaina;
        }

        public String getVietove() {
            return vietove;
        }

        public static Comparator<Kelione> transportasComparator = new Comparator<Kelione>() {
            @Override
            public int compare(Kelione o1, Kelione o2) {
                return o1.getTransportas().compareTo(o2.getTransportas());
            }
        };
        public static Comparator<Kelione> kainosComparator = new Comparator<Kelione>() {
            @Override
            public int compare(Kelione o1, Kelione o2) {
                return (int) o2.getKaina() - (int) o1.getKaina();
            }
        };
        public static Comparator<Kelione> tranpKainosComparator = new Comparator<Kelione>() {
            @Override
            public int compare(Kelione o1, Kelione o2) {
                int flag = o1.getVietove().compareTo(o2.getVietove());
                if (flag == 0) flag = (int) o2.getKaina() - (int) o1.getKaina();
                return flag;
            }
        };

    }


    public static void main(String[] args) throws FileNotFoundException, Exception {
        Scanner fScn = new Scanner(new File("C:\\Users\\carca\\IdeaProjects\\programavimo_praktika\\src\\keliones23\\keliones.dat"));
        String data;
        int eilnr = 0;


        String transportas[] = new String[100];
        Integer dienos[] = new Integer[100];
        String vietove[] = new String[100];
        Double kaina[] = new Double[100];

        List<Kelione> isvykos = new ArrayList<>();

        while (fScn.hasNextLine()) {
            data = fScn.nextLine();
            String[] token = data.split("-");
            transportas[eilnr] = token[0];
            dienos[eilnr] = Integer.parseInt(token[1]);
            vietove[eilnr] = token[2];
            kaina[eilnr] = Double.parseDouble(token[3]);

            isvykos.add(new Kelione(transportas[eilnr], dienos[eilnr], vietove[eilnr], kaina[eilnr]));

            eilnr++;
        }
        boolean x = true;
        while (x == true) {
            try {
                System.out.println();
                System.out.println("Isvesti kainas ne didsnes nei ivesta ranka  1. ");
                System.out.println("Rikiuoti pagal transporto priemone 2. ");
                System.out.println("Rikiuoti pagal kaina 3. ");
                System.out.println("Rikiuoti pagal vietove ir kaina(mazejimo tvarka) 4. ");
                System.out.println("Baigti 5. ");

                BufferedReader iv = new BufferedReader(new InputStreamReader(System.in));
                int pasirinkimas = Integer.parseInt(iv.readLine());

                if (pasirinkimas == 1) {
                    System.out.println("Iveskite kaina: ");
                    BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
                    Double norimaKaina = Double.parseDouble(inp.readLine());

                    System.out.println();
                    System.out.println("KELIONES GALIMOS UZ IVESTA KAINA:");
                    isvykos.forEach(kelione -> {
                        if (norimaKaina >= kelione.kaina) {
                            System.out.println(String.format("%-15S%-5S%-15S%-15S", kelione.transportas, kelione.dienos, kelione.vietove, kelione.kaina));
                        }
                    });
                } else if (pasirinkimas == 2) {
                    isvykos.sort(Kelione.transportasComparator);
                    for (Kelione elem : isvykos) {
                        System.out.println(String.format("%-15S%-5S%-15S%-15S", elem.transportas, elem.dienos, elem.vietove, elem.kaina));
                    }
                } else if (pasirinkimas == 3) {
                    isvykos.sort(Kelione.kainosComparator);
                    for (Kelione elem : isvykos) {
                        System.out.println(String.format("%-15S%-5S%-15S%-15S", elem.transportas, elem.dienos, elem.vietove, elem.kaina));
                    }
                } else if (pasirinkimas == 4) {
                    isvykos.sort(Kelione.tranpKainosComparator);
                    for (Kelione elem : isvykos) {
                        System.out.println(String.format("%-15S%-5S%-15S%-15S", elem.transportas, elem.dienos, elem.vietove, elem.kaina));
                    }
                } else if (pasirinkimas == 5) {
                    System.out.println("Programa isjungiama.");
                    break;
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }
}

