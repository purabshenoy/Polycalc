package main;

import javax.swing.*;
import java.awt.*;

public class main {
    public static void main(String[] args){
        JFrame frame= new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(1000,600);
        frame.setResizable(false);
        JPanel input_panel=new JPanel();
        input_panel.setBounds(0,0,500,600);
        input_panel.setBackground(new Color(209,207,207));
        JPanel poly_one =  new JPanel();
        poly_one.setBounds(500,0,250,250);
        poly_one.setBackground(new Color(173, 173, 173));
        JPanel poly_two = new JPanel();
        poly_two.setBounds(750,0,250,250);
        poly_two.setBackground(new Color(210, 210, 210));
        JPanel final_polynomial = new JPanel();
        final_polynomial.setBounds(500,250,500,600-250);
        final_polynomial.setBackground(new Color(149, 149, 149));
        frame.add(input_panel);
        frame.add(poly_one);
        frame.add(poly_two);
        frame.add(final_polynomial);
        frame.setTitle("PolyCalc");
        frame.setLayout(null);


    }
}
