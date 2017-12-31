package com.artiom.bmicalculator;


public class BMICalculator {
    public static void main(String[] args) {

        System.out.println("You BMI score is: "+ getBMI(1.6,48));

    }

    public static double getBMI(double height, int weight) {

        double bmi =  Math.round(weight/(Math.pow(height,2.0)));

        if(bmi > 25) System.out.println("Lay off that donut, you're OVERWEIGHT !!!");
        else if(bmi > 18.5 && bmi < 25.0) System.out.println("Keep up the healthy life style, your weight is NORMAL !!!");
        else System.out.println("Oh no, you are UNDERWEIGHT");

        return bmi;
    }
}
