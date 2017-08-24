package com.company;

public class Main {

    public static void main(String[] args) {

        EmailNotification email = new EmailNotification("me", "att&t", "him", "turd");
        TextNotification text = new TextNotification("you", "verison", "her", "meh");

        Object emailNotificationClone = EmailNotification.clone();

        email.transport();
        text.transport();

        System.out.println("-------");

        email.showStatus();
        text.showStatus();

        email.printSomeText();

        System.out.println(email);
        System.out.println(text);



    }




}
