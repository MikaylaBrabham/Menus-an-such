package com.pluralsight;

import java.util.Scanner;

public class MenusAndSuch {
    public static Scanner userInputThing = new Scanner(System.in);

    public static void main(String[] args) {

        //display the main menu
        System.out.println("""
                what do you want to do?
                    1. view inventory
                    2. Manage customers
                    3. Exit this nonsense
                    Make your selection:
                
                
                """);

        //while(userInputThing.hasnextInt())

        //store the users choice
        int mainMenuChoice = userInputThing.nextInt();

        switch(mainMenuChoice) {
            case 1 -> System.out.println("You want to view inventory");
            case 2 -> System.out.println("You want to manage customers");
            case 3 -> System.out.println("You want to exit this nonsense");
            system.exit(0);
            default -> System.out.println("Invalid selection try again");
        }
    }
}
