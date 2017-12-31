package com.artiom.couldthisbelove;

import java.util.Random;

public class LoveCalculator {

    public static void main(String[] args) {

        System.out.println("You love score is: " + ifYouHadMyLove("Ben", "Jenny from the Block"));

    }

    public static int ifYouHadMyLove(String yourName, String theirName){

        Random randObject = new Random();
        int loveScore = randObject.nextInt(101);

        if(loveScore > 80) System.out.println(yourName +" and "+theirName+" love each other like Kanye loves Kanye");
        else if (loveScore > 40) System.out.println(yourName+" and "+theirName+", you go together like coke and menthos");
        else System.out.println("No love possible. You'll be forever alone...");
        return loveScore;
    }

}
