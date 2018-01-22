package com.artiom.javapractice;

public class CarSimulator {
    public static void main(String[] args) {
        System.out.println("Launching car simulator ...");

        Car myToyota = new Car();

        System.out.println("The car colour is: "+ myToyota.colour);
        myToyota.colour = "Blue";
        System.out.println("Got a paint job. New coluor is "+ myToyota.colour);
    }
}
