package com.artiom.javapractice;

/**
 * Created by ART on 01/22/2018.
 */

public class Car {
    public String colour = "Black";
    private int mNumberOfSeats = 5;
    protected String mInterior = "Leather";

    public Car(){
        //additional instructions go here
    }

    public Car(String chosenColour, String chosenInterior){
        colour = chosenColour;
        mInterior = chosenInterior;
    }

    public int getNumberOfSeats(){
        return mNumberOfSeats;
    }

    public String getInterior() {
        return mInterior;
    }

    public void drive(){
        System.out.println("Car is moving");
    }
    public String drive(String milesPerHour ){
        return milesPerHour;
    }
}
