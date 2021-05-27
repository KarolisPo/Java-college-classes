package Zaidimas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Skydelis extends JFrame implements ActionListener {
    JButton sukti, zaisti;
    JLabel kaulas1, tekstas, taskai, gyvybes, pabaiga, rezultatas;
    String picName;
    JRadioButton vienas, du, trys, keturi, penki, sesi;
    int sk;
    int pasirinkimas;
    int tsk = 0;
    int gyv = 20;

    public void zaidimoPabaiga(){
        vienas.setVisible(false);
        du.setVisible(false);
        trys.setVisible(false);
        keturi.setVisible(false);
        penki.setVisible(false);
        sesi.setVisible(false);
        taskai.setVisible(false);
        gyvybes.setVisible(false);
        sukti.setVisible(false);
        kaulas1.setVisible(false);
        tekstas.setVisible(false);
        pabaiga.setVisible(true);
        rezultatas.setText("Surinkote tasku: " + tsk );
        rezultatas.setVisible(true);
        zaisti.setVisible(true);
    }
    public void zaidimoPradzia(){
        tsk = 0;
        gyv = 20;
        vienas.setVisible(true);
        du.setVisible(true);
        trys.setVisible(true);
        keturi.setVisible(true);
        penki.setVisible(true);
        sesi.setVisible(true);
        taskai.setVisible(true);
        gyvybes.setVisible(true);
        sukti.setVisible(true);
        kaulas1.setVisible(false);
        pabaiga.setVisible(false);
        rezultatas.setVisible(false);
        zaisti.setVisible(false);
        taskai.setText("TASKAI: "+ tsk);
        gyvybes.setText("GYVYBES: "+ gyv);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==vienas) {
            pasirinkimas = 1;
        }
        if(e.getSource()==du) {
            pasirinkimas = 2;
        }
        if(e.getSource()==trys) {
            pasirinkimas = 3;
        }
        if(e.getSource()==keturi) {
            pasirinkimas = 4;
        }
        if(e.getSource()==penki) {
            pasirinkimas = 5;
        }
        if(e.getSource()==sesi) {
            pasirinkimas = 6;
        }
        if (e.getSource() == sukti){
            Random rand = new Random();
            sk = rand.nextInt(6);
            if(sk+1 == 1){
                picName = "die1.gif";
                kaulas1.setIcon(new ImageIcon(picName));
                kaulas1.setVisible(true);

                tekstas.setVisible(true);
                tekstas.setText("VIENAS");
                if(pasirinkimas == 1){
                    System.out.println("Jus atspejote");
                    tsk++;
                    taskai.setText("TASKAI: " + tsk);
                }
                else if (pasirinkimas!= 1){
                    System.out.println("Jus neatspejote");
                    gyv--;
                    gyvybes.setText("GYVYBES: " + gyv);
                    if(gyv == 0){
                        zaidimoPabaiga();
                    }
                }
            }
            else if(sk+1 == 2){
                picName = "die2.gif";
                kaulas1.setIcon(new ImageIcon(picName));
                kaulas1.setVisible(true);

                tekstas.setVisible(true);
                tekstas.setText("DU");
                if(pasirinkimas == 2) {
                    System.out.println("Jus atspejote");
                    tsk++;
                    taskai.setText("TASKAI: " + tsk);
                }
                else if (pasirinkimas!= 2){
                    System.out.println("Jus neatspejote");
                    gyv--;
                    gyvybes.setText("GYVYBES: " + gyv);
                    if(gyv == 0){
                        zaidimoPabaiga();
                    }
                }
            }
            else if(sk+1 == 3){
                picName = "die3.gif";
                kaulas1.setIcon(new ImageIcon(picName));
                kaulas1.setVisible(true);

                tekstas.setVisible(true);
                tekstas.setText("TRYS");
                    if(pasirinkimas == 3) {
                        System.out.println("Jus atspejote");
                        tsk++;
                        taskai.setText("TASKAI: " + tsk);
                    }
                    else if (pasirinkimas!= 3){
                        System.out.println("Jus neatspejote");
                        gyv--;
                        gyvybes.setText("GYVYBES: " + gyv);
                        if(gyv == 0){
                            zaidimoPabaiga();
                        }
                    }
            }
            else if(sk+1 == 4){
                picName = "die4.gif";
                kaulas1.setIcon(new ImageIcon(picName));
                kaulas1.setVisible(true);

                tekstas.setVisible(true);
                tekstas.setText("KETURI");

                    if(pasirinkimas == 4) {
                        System.out.println("Jus atspejote");
                        tsk++;
                        taskai.setText("TASKAI: " + tsk);
                    }
                    else if (pasirinkimas!= 4){
                        System.out.println("Jus neatspejote");
                        gyv--;
                        gyvybes.setText("GYVYBES: " + gyv);
                        if(gyv == 0){
                            zaidimoPabaiga();
                        }
                    }
            }
            else if(sk+1 == 5){
                picName = "die5.gif";
                kaulas1.setIcon(new ImageIcon(picName));
                kaulas1.setVisible(true);

                tekstas.setVisible(true);
                tekstas.setText("PENKI");

                    if(pasirinkimas == 5) {
                        System.out.println("Jus atspejote");
                        tsk++;
                        taskai.setText("TASKAI: " + tsk);
                    }
                    else if (pasirinkimas!= 5){
                        System.out.println("Jus neatspejote");
                        gyv--;
                        gyvybes.setText("GYVYBES: " + gyv);
                        if(gyv == 0){
                            zaidimoPabaiga();
                        }
                    }
            }
            else{
                picName = "die6.gif";
                kaulas1.setIcon(new ImageIcon(picName));
                kaulas1.setVisible(true);

                tekstas.setVisible(true);
                tekstas.setText("SESI");
                    if(pasirinkimas == 6) {
                        System.out.println("Jus atspejote");
                        tsk++;
                        taskai.setText("TASKAI: " + tsk);
                    }
                    else if (pasirinkimas!= 6){
                        System.out.println("Jus neatspejote");
                        gyv--;
                        gyvybes.setText("GYVYBES: " + gyv);
                        if(gyv == 0){
                            zaidimoPabaiga();
                        }
                    }
            }

        }
        if(e.getSource() == zaisti){
            zaidimoPradzia();
        }


        }



    Skydelis() {
        tekstas = new JLabel();
        tekstas.setVisible(false);
        tekstas.setFont(new Font("Comic Sans", Font.BOLD, 25));
        tekstas.setBounds(195, 140, 225, 50);

        taskai = new JLabel();
        taskai.setText("TASKAI: "+tsk);
        taskai.setFont(new Font("Comic Sans", Font.BOLD, 15));
        taskai.setBounds(350, 40, 130,50);
        gyvybes = new JLabel();
        gyvybes.setText("GYVYBES: "+ gyv);
        gyvybes.setFont(new Font("Comic Sans", Font.BOLD, 15));
        gyvybes.setBounds(350, 10, 130,50);

        kaulas1 = new JLabel();
        kaulas1.setBounds(175,10,150,150);
        kaulas1.setVisible(false);

        pabaiga = new JLabel();
        pabaiga.setBounds(150,50,200,200);
        pabaiga.setText("Zaidimas baigtas");
        pabaiga.setFont(new Font("Comic Sans", Font.BOLD, 25));
        pabaiga.setForeground(new Color(102,17,0));
        pabaiga.setVisible(false);


        rezultatas = new JLabel();
        rezultatas.setBounds(145,100,300,200);
        rezultatas.setFont(new Font("Comic Sans", Font.BOLD, 25));
        rezultatas.setForeground(new Color(102,17,0));
        rezultatas.setVisible(false);



        sukti = new JButton();
        sukti.setText("RIDENTI");
        sukti.setBackground(new Color(102,17,0));
        sukti.setBounds(150, 350, 200,50);
        sukti.setFont(new Font("Comic Sans", Font.BOLD, 25));
        sukti.setFocusable(false);
        sukti.setHorizontalTextPosition(JButton.CENTER);
        sukti.setVerticalTextPosition(JButton.BOTTOM);
        sukti.setForeground(new Color(255,255,255));
        sukti.addActionListener(this);

        zaisti = new JButton();
        zaisti.setText("ZAISTI");
        zaisti.setBackground(new Color(102,17,0));
        zaisti.setBounds(150, 350, 200,50);
        zaisti.setFont(new Font("Comic Sans", Font.BOLD, 25));
        zaisti.setFocusable(false);
        zaisti.setHorizontalTextPosition(JButton.CENTER);
        zaisti.setVerticalTextPosition(JButton.BOTTOM);
        zaisti.setForeground(new Color(255,255,255));
        zaisti.addActionListener(this);
        zaisti.setVisible(false);

        vienas = new JRadioButton("Vienas");
        vienas.setBounds(10,100,100,30);
        vienas.setVisible(true);
        vienas.addActionListener(this);
        du = new JRadioButton("Du");
        du.setBounds(10,130,100,30);
        du.setVisible(true);
        du.addActionListener(this);
        trys = new JRadioButton("Trys");
        trys.setBounds(10,160,100,30);
        trys.setVisible(true);
        trys.addActionListener(this);
        keturi = new JRadioButton("Keturi");
        keturi.setBounds(10,190,100,30);
        keturi.setVisible(true);
        keturi.addActionListener(this);
        penki = new JRadioButton("Penki");
        penki.setBounds(10,220,100,30);
        penki.setVisible(true);
        penki.addActionListener(this);
        sesi = new JRadioButton("Sesi");
        sesi.setBounds(10,250,100,30);
        sesi.setVisible(true);
        sesi.addActionListener(this);

        ButtonGroup group = new ButtonGroup();
        group.add(vienas);
        group.add(du);
        group.add(trys);
        group.add(keturi);
        group.add(penki);
        group.add(sesi);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setTitle("Kauliuku zaidimas");
        this.setVisible(true);
        this.add(sukti);
        this.add(kaulas1);
        this.add(tekstas);
        this.add(taskai);
        this.add(gyvybes);
        this.add(pabaiga);
        this.add(rezultatas);
        this.add(zaisti);

        //radioButtons
        this.add(vienas);
        this.add(du);
        this.add(trys);
        this.add(keturi);
        this.add(penki);
        this.add(sesi);



    }
}
