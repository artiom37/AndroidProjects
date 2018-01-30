package com.artiom.javapractice;

/**
 * Created by ART on 01/28/2018.
 */

public class SelfDrivingCar extends Car {

    public SelfDrivingCar(String chosenColour, String chosenInterior) {
        super(chosenColour, chosenInterior);
        System.out.println("Constructing self-driving car. Installing Skynet version 0.92.4");
    }

    @Override
    public void drive(){

        System.out.println("Driving to Googleplex, Mountain View");
    }
}
