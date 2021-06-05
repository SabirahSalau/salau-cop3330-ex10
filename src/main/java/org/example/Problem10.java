/*
 *  UCF COP3330 Summer 2021 Assignment 10 Solution
 *  Copyright 2021 Sabirah Salau
 */


package org.example;

import java.util.Scanner;

public class Problem10
{
    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);


        //INPUTS
        double taxrate = 0.055;

        System.out.println("Enter the price of item one:");
        String sItem1 = input.next();
        double item1 = Double.parseDouble(sItem1);

        System.out.println("Enter the quantity of item one:");
        String sQuantityItem1 = input.next();
        double quantityItem1 = Double.parseDouble(sQuantityItem1);




        System.out.println("Enter the price of item two:");
        String sItem2 = input.next();
        double item2 = Double.parseDouble(sItem2);

        System.out.println("Enter the quantity of item two:");
        String sQuantityItem2 = input.next();
        double quantityItem2 = Double.parseDouble(sQuantityItem2);




        System.out.println("Enter the price of item three:");
        String sItem3 = input.next();
        double item3 = Double.parseDouble(sItem3);

        System.out.println("Enter the quantity of item three:");
        String sQuantityItem3 = input.next();
        double quantityItem3 = Double.parseDouble(sQuantityItem3);



        //CALCULATIONS
        double subtotal = (item1 * quantityItem1) + (item2 * quantityItem2) + (item3 * quantityItem3);

        double tax = subtotal * taxrate;

        double total = subtotal + tax;



        //OUTPUTS
        System.out.printf("Subtotal: $%.2f\n", subtotal);
        System.out.printf("Tax: $%.2f\n", tax);
        System.out.printf("Total: $%.2f", total);




    }
}
