package com.artiom.javapractice;

public class CarSimulator {
    public static void main(String[] args) {

        System.out.println("Launching car simulator ...");

        Car myToyota = new Car("Blue","Wood");
        Car myHonda = new Car();
        myHonda.drive() ;

        SelfDrivingCar autoBot = new SelfDrivingCar("Yellow","Plastic");
        autoBot.drive();
        System.out.println("autoBot colour is : "+autoBot.colour);
        System.out.println("autoBot interior is : "+autoBot.mInterior);
    }
}
