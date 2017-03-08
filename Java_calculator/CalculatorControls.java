package com.BlueCalculator;

import java.awt.event.*;
import javax.swing.JOptionPane;

public class CalculatorControls {
    CalculatorUI calcUI = new CalculatorUI();
    boolean answered = false;
    double num1, num2, num3, sum = 0;
    String choice;
    double PI = Math.PI; 
    public CalculatorControls() {
        
        calcUI.b0.addActionListener(new numberListener());
        calcUI.b1.addActionListener(new numberListener());
        calcUI.b2.addActionListener(new numberListener());
        calcUI.b3.addActionListener(new numberListener());
        calcUI.b4.addActionListener(new numberListener());
        calcUI.b5.addActionListener(new numberListener());
        calcUI.b6.addActionListener(new numberListener());
        calcUI.b7.addActionListener(new numberListener());
        calcUI.b8.addActionListener(new numberListener());
        calcUI.b9.addActionListener(new numberListener());
        calcUI.bDOT.addActionListener(new numberListener());
        calcUI.bC.addActionListener(new numberListener());
        
        calcUI.bAdd.addActionListener(new basicListener());
        calcUI.bSub.addActionListener(new basicListener());
        calcUI.bDiv.addActionListener(new basicListener());
        calcUI.bMult.addActionListener(new basicListener());
        calcUI.bPosNeg.addActionListener(new basicListener());
        calcUI.bEqual.addActionListener(new basicListener());
        
        calcUI.bLog.addActionListener(new advanceListener());
        calcUI.bPow.addActionListener(new advanceListener());
        calcUI.bSquare.addActionListener(new advanceListener());
        calcUI.bSqrt.addActionListener(new advanceListener());
        calcUI.bPI.addActionListener(new advanceListener());
        calcUI.bPercent.addActionListener(new advanceListener());        
    }
    
    private class numberListener implements ActionListener {
        
        public void actionPerformed(ActionEvent event) {
            String command = event.getActionCommand();
            switch (command) {
                case "1" :
                    calcUI.setText("1");
                    break;
                case "2" :
                    calcUI.setText("2");
                    break;
                case "3" :
                    calcUI.setText("3");
                    break;
                case "4" :
                    calcUI.setText("4");
                    break;
                case "5" :
                    calcUI.setText("5");
                    break;
                case "6" :
                    calcUI.setText("6");
                    break;
                case "7" :
                    calcUI.setText("7");
                    break;
                case "8" :
                    calcUI.setText("8");
                    break;
                case "9" :
                    calcUI.setText("9");
                    break;
                case "0" :
                    calcUI.setText("0");
                    break;
                case "." :
                    String testDot = calcUI.getText();
                    if (testDot.contains(".")) {
                        JOptionPane.showMessageDialog(calcUI.main,"Number already"
                                + " contains '.' character.");
                    } 
                    else {
                    calcUI.setText(".");
                    break;
                    }
            }
            if (event.getSource() == calcUI.bC) {
                calcUI.input.setText("");
            }
        }
    }
    private class basicListener implements ActionListener {
        
        public void actionPerformed(ActionEvent event) {
            //All basic buttons minus equals button
            try {
           String basic = event.getActionCommand();           
           switch (basic) {               
               case "+" :
                   add();
                   calcUI.bEqual.setEnabled(true);
                   break;
               case "-" :
                   subtract();
                   calcUI.bEqual.setEnabled(true);
                   break;
               case "*" :
                   mult();
                   calcUI.bEqual.setEnabled(true);
                   break;
               case "/" :
                   divide();
                   calcUI.bEqual.setEnabled(true);
                   break;
               case "+/-" :
                   posNeg();
                   break;
           } 
            } catch (NumberFormatException err) {
                JOptionPane.showMessageDialog(calcUI.main,"Error: "+err.getMessage());
            } 
           //Equals button
           if (event.getSource() == calcUI.bEqual) try {
               
                num2 = Double.parseDouble(calcUI.input.getText());
               
                if (!answered) {
                    
                    switch (choice) {
                        case "add":
                            sum = num1 + num2;
                            break;
                        case "subtract":
                            sum = num1 - num2;
                            break;
                        case "multiply":
                            sum = num1 * num2;
                            break;
                        case "divide":
                            sum = num1 / num2;
                            break;
                        case "pow" :
                            sum = Math.pow(num1, num2);
                            break;
                        default:
                            break;
                    }
            } 
                    calcUI.setSum(sum+"");
                    answered = true; 
                    
                    if (answered) {
                calcUI.bEqual.setEnabled(false);
                }                 
            } catch (NumberFormatException err) {
                JOptionPane.showMessageDialog(calcUI.main,"Error: "+err.getMessage());
            } 
        }
    }
    private class advanceListener implements ActionListener {
        
        public void actionPerformed(ActionEvent event) {
            //All advanced buttons
            try {
            String advance = event.getActionCommand();
            switch (advance)  {
                case "PI" :
                    PI();
                    break;
                case "X2" :
                    square();
                    break;
                case "Sqrt" :
                    sqrt();
                    break;
                case "Log" :
                    log();
                    break;
                case "%" :
                    percent();
                    break; 
                case "Pow" :
                    pow();
                    break;
            }
            } catch (NumberFormatException err) {
                JOptionPane.showMessageDialog(calcUI.main,"Error: "+err.getMessage());
            } 
            if (!answered) {                
                calcUI.bEqual.setEnabled(true);
            }
        }
    }
    
     public void add() {
        num1 = Double.parseDouble(calcUI.input.getText());
        calcUI.input.setText("");
        choice = "add";
        answered = false;
    }
    
    public void subtract() {
        num1 = Double.parseDouble(calcUI.input.getText());
        calcUI.input.setText("");
        choice = "subtract";
        answered = false;
    }
    
    public void mult() {
        num1 = Double.parseDouble(calcUI.input.getText());
        calcUI.input.setText("");
        choice = "multiply";
        answered = false;
    }
    
    public void divide() {
        num1 = Double.parseDouble(calcUI.input.getText());
        calcUI.input.setText("");
        choice = "divide";
        answered = false;
    }
    
    public void sqrt() {
        num1 = Double.parseDouble(calcUI.input.getText());
        num2 = Math.sqrt(num1);
        calcUI.input.setText(""+num2);
    }
    
    public void square(){
        num1 = Double.parseDouble(calcUI.input.getText());
        num2 = num1 * num1;
        calcUI.input.setText(""+num2);
    }
    
    public void pow(){
        num1 = Double.parseDouble(calcUI.input.getText());
        calcUI.input.setText("");
        choice = "pow";
        answered = false;
    }
    
    public void PI(){       
        calcUI.input.setText(""+PI);
    }
    
    public void log() {
        num1 = Double.parseDouble(calcUI.input.getText());
        num2 = Math.log(num1);
        calcUI.input.setText(num2+"");
    }
    
    public void percent(){
        num1 = Double.parseDouble(calcUI.input.getText());
        num2 = (num1 /100);
        calcUI.input.setText(""+num2);
    }
    
    public void posNeg() {
        num1 = calcUI.getNum();
        if (num1 == 0) {
            JOptionPane.showMessageDialog(calcUI.main,"Number is Zero.");
        }
        else {
            num2 = num1 * -1;
            calcUI.setSum(""+num2);
        } 
    }
}