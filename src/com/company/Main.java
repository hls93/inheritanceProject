package com.company;

public class Main {

    public static void main(String[] args) {

        EmailNotification email = new EmailNotification("me", "att&t", "poop", "turd");
        TextNotification text = new TextNotification("you", "verison", "semr", "meh");

        System.out.println(email);
        System.out.println(text);



    }




}
