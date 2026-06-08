package Project;

import java.util.Scanner;

public class Bakery {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("---------------Hello! Welcome to delights bakery ----------------------");
        System.out.println("What you want to purchase? \ncake\npasteries\nbiscuits\n------------------------------");

        String item = sc.nextLine();

        if (item.equalsIgnoreCase("cake")) {
            System.out.println("Flavours of cakes are available. Opening menu...");
            new CakeFlavours();   
        } 
        else {
            System.out.println("Sorry! This item is not available.");
            System.out.println("------------------THANKS FOR VISITING US-----------------");
        }

        
    }
}