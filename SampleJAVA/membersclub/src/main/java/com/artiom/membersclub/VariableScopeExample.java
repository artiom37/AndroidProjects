package com.artiom.membersclub;

public class VariableScopeExample {

    public static void main(String[] args) {
        oneLiner();
        talkToMe();
    }

    private static void talkToMe(){
        String shoutOut = "I remember a time when I knew more than my phone...";
        System.out.println(shoutOut);
    }

    public static void oneLiner() {

        String message = "Instagram is Twitter for people who go outside";
        System.out.println(message);
    }

}
