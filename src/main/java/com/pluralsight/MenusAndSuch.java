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
public static void viewInventory(){
    System.out.println("here is the inventory");
}

public static void manageCustomers(){
    System.out.println("here are the customers");
    boolean appRunning = true;
    while(appRunning){
        System.out.println("""
                what do you want to do?
                    1. view customers
                    2. add customer
                    3. remove customer
                    4. return to main menu
                    Make your selection:
                
                
                """);
        int manageCustomersChoice = userInputThing.nextInt();
        System.out.println("""
                case 1 ->  view customers
                case 2 ->  add a customer
                case 3 ->  go back to the main menu
                """);

        int menuChoice = userInputThing.nextInt();
        switch(menuChoice) {
            case 1:
                System.out.println("Here are the customers");
                break;
            case 2:
                System.out.println("Add a customer");
                break;
            case 3:
                System.out.println("Returning to main menu");
                appRunning = false;
                break;
            default:
                System.out.println("Invalid selection try again");
        }
    }
}
