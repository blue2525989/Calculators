package com.BlueCalculator;

public class Calculator {
    CalculatorControls control = new CalculatorControls();
    public Calculator() {
        control.calcUI.loadUI();
    }
    
    public static void main(String[] args) {
        new Calculator();
    }
}