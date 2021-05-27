package com.programavimo_praktika;

import javax.swing.*;
import java.awt.*;

public class javaapp17 {


    public static void main(String[] args){
        JLabel label = new JLabel();
        label.setText("Do you even code?");
        ImageIcon paveiksliukas = new ImageIcon("code.png");
        label.setIcon(paveiksliukas);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(150,53,200));
        label.setFont(new Font("MV BOLI", Font.BOLD,20));
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.CENTER);


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("PAVADINIMAS");
        frame.setVisible(true);
        frame.setSize(420,420);
        //frame.setResizable(false);
        frame.getContentPane().setBackground(new Color(100,0,0));
        frame.add(label);
        frame.pack();
    }
}
