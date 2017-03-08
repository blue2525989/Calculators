package com.BlueCalculator;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.*;

public class CalculatorUI {
    //UI components
    JFrame main = new JFrame("Blue's Calculator");
    
    JPanel inputPane = new JPanel();
    JTextArea input = new JTextArea("");
    
    JPanel buttonsNum = new JPanel();
    JButton b1 = new JButton("1");
    JButton b2 = new JButton("2");
    JButton b3 = new JButton("3");
    JButton b4 = new JButton("4");
    JButton b5 = new JButton("5");
    JButton b6 = new JButton("6");
    JButton b7 = new JButton("7");
    JButton b8 = new JButton("8");
    JButton b9 = new JButton("9");
    JButton b0 = new JButton("0");
    JButton bC = new JButton("CE");
    JButton bDOT = new JButton(".");
    
    JPanel buttonsBas = new JPanel();
    JButton bAdd = new JButton("+");
    JButton bSub = new JButton("-");
    JButton bDiv = new JButton("/");
    JButton bMult = new JButton("*");
    JButton bPosNeg = new JButton("+/-");
    JButton bEqual = new JButton("=");
    
    JPanel buttonsAdv = new JPanel();
    JButton bLog = new JButton("Log");
    JButton bPow = new JButton("Pow");
    JButton bSquare = new JButton("X2");
    JButton bSqrt = new JButton("Sqrt");
    JButton bPI = new JButton("PI");
    JButton bPercent = new JButton("%");
    
    JPanel blankPane = new JPanel();
    JPanel blankPane2 = new JPanel();
    
    Font f = new Font("jasons font",1,18);
    public void loadUI() {
        GridLayout grd2 = new GridLayout(3,4);
        GridLayout grd3 = new GridLayout(3,2);
        buttonsNum.setLayout(grd2);
        buttonsBas.setLayout(grd3);
        buttonsAdv.setLayout(grd3);
        
        inputPane.add(input);
        input.setBackground(Color.LIGHT_GRAY);
        input.setForeground(Color.BLUE);
        input.setLineWrap(true);
        input.setFont(f);
        buttonsNum.add(b1);
        buttonsNum.add(b2);
        buttonsNum.add(b3);
        buttonsNum.add(b4);
        buttonsNum.add(b5);
        buttonsNum.add(b6);
        buttonsNum.add(b7);
        buttonsNum.add(b8);
        buttonsNum.add(b9);
        buttonsNum.add(b0);
        buttonsNum.add(bDOT);
        buttonsNum.add(bC);
        
        buttonsBas.add(bAdd);
        buttonsBas.add(bSub);
        buttonsBas.add(bMult);
        buttonsBas.add(bDiv);
        buttonsBas.add(bPosNeg);
        buttonsBas.add(bEqual);
        bEqual.setEnabled(false);
        
        buttonsAdv.add(bLog);
        buttonsAdv.add(bPow);
        buttonsAdv.add(bSquare);
        buttonsAdv.add(bSqrt);
        buttonsAdv.add(bPI);
        buttonsAdv.add(bPercent);
        
        GridLayout grd1 = new GridLayout(2,2);
        main.setLayout(grd1);
        main.add(input);
        main.add(buttonsNum);
        main.add(buttonsBas);
        main.add(buttonsAdv);
        main.setSize(500,400);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main.setLocationRelativeTo(null);
        main.setVisible(true);
    }

    
    public void setText(String s1) {
        input.append(s1);
    }
    public void setSum(String s1) {
        input.setText(s1);
    }
    public String getText() {
        String text = input.getText();
        return text;
    }
    public double getNum() {
        String text = getText();
        double num = Double.parseDouble(text);
        return num;
    }
}